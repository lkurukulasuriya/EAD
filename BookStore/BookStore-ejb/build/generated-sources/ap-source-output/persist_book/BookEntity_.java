package persist_book;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import persist_author.AuthorEntity;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-08-08T11:50:05")
@StaticMetamodel(BookEntity.class)
public class BookEntity_ { 

    public static volatile ListAttribute<BookEntity, AuthorEntity> authors;
    public static volatile SingularAttribute<BookEntity, String> title;
    public static volatile SingularAttribute<BookEntity, Double> price;
    public static volatile SingularAttribute<BookEntity, String> isbn;
    public static volatile SingularAttribute<BookEntity, String> language;
    public static volatile SingularAttribute<BookEntity, Integer> year_book;

}