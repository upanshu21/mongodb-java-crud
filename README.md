# Java CRUD with MongoDB

This is a simple Java CRUD application using MongoDb. To run this project you need 
	-MongoDB environment installed on your local machine
	-MongoDb compass for database visualization
	
Before running this project start the MongoDB server. This project uses default MongoDB port.

## Running this project

- Clone this repo on your local machine. 
- Open the project in your IDE.

open the terminal

```
mvn compile
```
```
mvn exec:java -Dexec.mainClass=com.mongodb.Driver
```

The project has 4 different functions for each operation. for clear understanding run one function at a time. You can do this by commenting the other three function call in the **Driver** class. You can also watch each change in the database using the MongoDB compass.
