/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Operation;
import javax.persistence.EntityManager;

/**
 *
 * @author Aimad.JAOUHAR
 */
public class OperationDao extends AbstractFacade<Operation> {

    private EntityManager em;

    public OperationDao() {
        super(Operation.class);
        this.em = getEntityManager();
    }
}
