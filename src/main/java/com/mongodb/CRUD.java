package com.mongodb;

import org.bson.Document;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.combine;
import static com.mongodb.client.model.Updates.set;

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

    public void read() {
        Document document = getCollection().find().first();
        System.out.println(document.toJson());
    }

    public void update() {
        getCollection().updateOne(
                eq("firstName", "Upanshu"),
                combine(set("age", "23"), set("lastName", "Singh"))
                );
        System.out.println("successful");
    }

    public void delete() {
        getCollection().deleteMany(eq("age", "22"));
    }

}
