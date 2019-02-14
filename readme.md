# Dustin Bowman Individual Project

### Problem Statement
Games in general have been a popular past time, and there's been
many different type of ways to keep track of game collections. Each 
platform have their own respective library but that is only for that specific
platform. Also with the digital download being a more popular way to get games
it is even harder to know what a person has without logging in multiple
accounts to figure it out. 

The range of games is quite expansive, so it will be great to have
all the information in one place instead of looking in multiple different locations.

### Project Technologies/Techniques (Tentative)

* Security/Authentication
  * Tomcat's JDBC Realm Authentication
  * Admin role: create/read/update/delete
  * User role: add game to library, create library, edit games in library
  * All: anyone can view game information (no login)
* Database
  * MySQL
  * Store users
  * Store all data for games in libraries
* ORM Framework
  * Hibernate 5
* Dependency Management
  * Maven
* Web Services consumed using Java
  * IGDB for video game metadata; Release dates, descriptions etc..
* CSS 
  * Bootstrap or Materialize
* Data Validation
  * Bootstrap Validator for front end
  * Explore Hibernate's validation
* Logging
  * Log4J2 
* Hosting
  * AWS
* Independent Research Topic/s
  * CI tools in AWS
  * Materialize
  * Hibernate Validation
  * Hibernate Search
  * Mock
* Project Lombok to eliminate boilerplate code like getters/setters/equals
* Unit Testing
  * JUnit tests to achieve 80%+ code coverage
  * Mock? 
* IDE: IntelliJ IDEA


### Design

* [User Stories](DesignDocuments/userStories.md)


### [Project Plan](ProjectPlan.md)

### [Time Log](DesignDocuments/timeLog.md)