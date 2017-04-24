/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp6uf2pt3;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author cristian
 */
public class MP6UF2PT3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MongoClient mongoClient = new MongoClient();
        MongoDatabase database = mongoClient.getDatabase("consultes");

        for (String s : database.listCollectionNames()) {
            System.out.println(s);
        }

        MongoCollection<Document> col = database.getCollection("restaurants");

    }

}
