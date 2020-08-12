package com.mongodb;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;


public class MongoMain {

    public MongoCollection<Document> getCollection() {
        String uri = "mongodb://localhost:27017";
        MongoClientURI mongoClientURI = new MongoClientURI(uri);
        MongoClient mongoClient = new MongoClient(mongoClientURI);

        MongoDatabase mongoDatabase = mongoClient.getDatabase("CrudDB");
        MongoCollection<Document> collection = mongoDatabase.getCollection("test1");
        return  collection;
    }

}
