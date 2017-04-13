/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.AbstractFacade;
import entities.Stock;
import javax.persistence.EntityManager;

/**
 *
 * @author Aimad.JAOUHAR
 */
public class StockDao extends AbstractFacade<Stock> {

    private EntityManager em;

    public StockDao() {
        super(Stock.class);
        this.em = getEntityManager();
    }
}
