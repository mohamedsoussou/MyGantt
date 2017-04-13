/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Equipement;
import javax.persistence.EntityManager;

/**
 *
 * @author Aimad.JAOUHAR
 */
public class EquipementDao extends AbstractFacade<Equipement> {

    private EntityManager em;

    public EquipementDao() {
        super(Equipement.class);
        this.em = getEntityManager();
    }
}
