package persist_author;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import persist_book.BookEntity;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-08-08T11:50:05")
@StaticMetamodel(AuthorEntity.class)
public class AuthorEntity_ { 

    public static volatile SingularAttribute<AuthorEntity, Long> id;
    public static volatile SingularAttribute<AuthorEntity, String> name;
    public static volatile SingularAttribute<AuthorEntity, BookEntity> book;

}