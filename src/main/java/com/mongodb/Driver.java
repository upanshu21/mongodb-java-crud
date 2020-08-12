package com.mongodb;

public class Driver {

    public static void main( String[] args) {
        CRUD operation = new CRUD();
        operation.create();
        operation.read();
        operation.update();
        operation.delete();
    }

}
