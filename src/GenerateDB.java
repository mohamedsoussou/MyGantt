/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dao.CaseeDao;
import dao.EquipementDao;
import dao.NiveauDao;
import dao.OperationDao;
import dao.TrancheDao;
import entities.Casee;
import entities.Equipement;
import entities.Niveau;
import entities.Operation;
import entities.Tranche;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author AIMAD
 */
public class GenerateDB {

    public static void main(String[] args) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myGanttV2PU");
//        EntityManager em = emf.createEntityManager();
//        em.close();
//        System.out.println("generating database .... ");

//        EquipementDao equipementDao = new EquipementDao();
//        OperationDao operationDao = new OperationDao();
//        NiveauDao ed = new NiveauDao();
//
//        String s = "1#Recouvrement Sillon B#8.01#0@2#Sillon B#0.90#1@3#Intercalaire SB//SA2#6.39#0@4#Sillon A2#3.43#1@5#Intercalaire SA2//C0#11.75#0@6#Couche 0 #0.81#1@7#Couche 1#1.50#1@8#Intercalaire C1//C2 Sup#3.00#0@9#Couche 2 superieure#1.68#1@10#Intercalaire C2 Sup//C3 Sup#4.69#0@11#Couche 3 superieure#0.85#1@12#Couche 3 inferieure#0.72#1@13#Intercalaire C3 inf//C4#1.24#0@14#Couche 4#1.44#1@15#Intercalaire C4//C5#4.65#0@16#Couche 5 #2.75#1@17#Intercalaire C5//C6#3.40#0@18#Couche 6 #0.65#1";
//        String tab[] = s.split("@");
//
//        for (int i = 0; i < tab.length; i++) {
//            String elem[] = tab[i].split("#");
//            Niveau e = new Niveau();
//            e.setNumero(Long.parseLong(elem[0]));
//            e.setNom(elem[1]);
//            e.setEpaisseur(Float.parseFloat(elem[2]));
//            e.setType(Integer.parseInt(elem[3]));
//            ed.create(e);
//        }
        
        
        
        CaseeDao caseeDao = new CaseeDao();
        TrancheDao trancheDao = new TrancheDao();
        
        for (int i = 1; i <= 8; i++) {
            Tranche tranche = new Tranche();
            tranche.setId(trancheDao.generateId("Tranche", "id"));
            tranche.setNom("Tranche "+(i+1));
            trancheDao.create(tranche);
            for (int j = 20*(i-1)+1; j <= 20*i ; j++) {
                Casee casee = new Casee();
                casee.setNumCase(j);
                casee.setTranche(tranche);
                caseeDao.create(casee);
            }
        }

    }

}
