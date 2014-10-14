package mongodbex;


import com.mongodb.DB;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nimesha
 */
public class DBManager {

    private static DB database;

	public static DB getDatabase() {
		if(database == null) {
			MongoClient mongo;
			try {
				mongo = new MongoClient("localhost", 27017);
				database = mongo.getDB("usermanager");
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return database;
	}

}
