/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejb_book;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import persist_book.BookEntity;

/**
 *
 * @author SLC
 */
@Stateless
public class BookEntityFacade extends AbstractFacade<BookEntity> implements BookEntityFacadeLocal {
    @PersistenceContext(unitName = "BookStore-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BookEntityFacade() {
        super(BookEntity.class);
    }
    
}
