/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.AffEquipement;
import javax.persistence.EntityManager;

/**
 *
 * @author Aimad.JAOUHAR
 */
public class AffEquipementDao extends AbstractFacade<AffEquipement>{
    
   private EntityManager em;

    public AffEquipementDao() {
        super(AffEquipement.class);
        this.em = getEntityManager();
    }
    
}
