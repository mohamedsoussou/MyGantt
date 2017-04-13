/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.IndexA;
import javax.persistence.EntityManager;

/**
 *
 * @author Aimad.JAOUHAR
 */
public class IndexADao extends AbstractFacade<IndexA> {

    private EntityManager em;

    public IndexADao() {
        super(IndexA.class);
        this.em = getEntityManager();
    }
}
