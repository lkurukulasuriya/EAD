/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejb_author;

import java.util.List;
import javax.ejb.Local;
import persist_author.AuthorEntity;

/**
 *
 * @author SLC
 */
@Local
public interface AuthorEntityFacadeLocal {

    void create(AuthorEntity authorEntity);

    void edit(AuthorEntity authorEntity);

    void remove(AuthorEntity authorEntity);

    AuthorEntity find(Object id);

    List<AuthorEntity> findAll();

    List<AuthorEntity> findRange(int[] range);

    List<AuthorEntity> findRelevants(String isbn);
    int count();
    
}
