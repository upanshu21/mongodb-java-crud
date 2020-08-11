package com.mongodb;

import org.bson.Document;

public class CRUD extends MongoMain{

    public void create() {
        Document document = new Document()
                .append("firstName", "Upanshu")
                .append("lastName", "Chaudhary")
                .append("age", "22")
                .append("gender", "Male")
                .append("designation", "Software Consultant");
        getCollection().insertOne(document);

    }

}
