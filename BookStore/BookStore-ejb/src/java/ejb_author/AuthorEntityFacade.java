/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejb_author;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import persist_author.AuthorEntity;

/**
 *
 * @author SLC
 */
@Stateless
public class AuthorEntityFacade extends AbstractFacade<AuthorEntity> implements AuthorEntityFacadeLocal {
    @PersistenceContext(unitName = "BookStore-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AuthorEntityFacade() {
        super(AuthorEntity.class);
    }
    
}
