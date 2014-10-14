/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejb_book;

import java.util.List;
import javax.ejb.Local;
import persist_book.BookEntity;

/**
 *
 * @author SLC
 */
@Local
public interface BookEntityFacadeLocal {

    void create(BookEntity bookEntity);

    void edit(BookEntity bookEntity);

    void remove(BookEntity bookEntity);

    BookEntity find(Object id);

    List<BookEntity> findAll();

    List<BookEntity> findRange(int[] range);

    int count();
    
}
