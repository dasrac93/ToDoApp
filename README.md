# todo-app


# ToDo App using Spring Boot, Spring Security ,JSP , Hibernate and In-Memory H2

i) ToDo app is built using Spring Boot, Spring MVC, Spring Data JPA and Hibernate.
ii) The database used is in-memory H2 DB.
iii)Authentication is done using Spring Security.
iv) The front end is developed using JSP with model/data binding using Spring MVC framework.
v)Application server used in embedded Tomcat
vi)Server port used is 8082 and it is configured in the application.properties file under resources folder of the project root folder.
vii)To run the application one can take the below steps

Running the Application

i)From your IDE, run the ToDoApplication.main() method as a standalone Java class that will start the embedded Tomcat server on port 8082 and point the browser to http://localhost:8082/.
ii)From the target folder, the WAR file todo-app-0.0.1-SNAPSHOT.war can be deployed in Tomcat 7/8 (JAVA 7/8)

Demo

1. Login Page
URL : http://localhost:8082/login
Username: admin
Password: admin

2. Home Page
After successful login, user will get Home Page display.

3. List Todos
URL: http://localhost:8082/list-todos

4. Create Todo
URL: http://localhost:8082/add-todo

5. Update Todo
URL: http://localhost:8082/update-todo?id=<>

6. Logout Page
URL: http://localhost:8082/login?logout

Design Patterns Used are : 

i) Inversion of Control or Dependency Injection design pattern which comes under the umbrella of SOLID design principles.

This is used for achieving loose coupling among the different Java beans which helps in easier maintenance of the application.

The Spring framework has an IOC container i.e. Application Context that is responsible for the creation of the object, wiring the objects together, configuring these objects and handling the entire life cycle of these objects from their creation until they are completely destroyed. 

ii) Singleton Design Pattern

Singleton design pattern ensures that only a single instance of the object will exist in the memory that could provide services.

In the spring framework, the Singleton is the default scope and the IOC container creates exactly one instance of the object per spring IOC container.

iii) The Model-View-Controller (MVC) software design pattern is a method for separating concerns within a software application. In principle, the application logic, or controller, is separated from the technology used to display information to the user, or the view layer. The model is a communications vehicle between the controller and view layers.

iv) Domain Model Pattern

The domain model is treated as POJO in Hibernate.

The domain model is an object model of the domain that incorporates both behavior and data.

v)The Repository Design Pattern via Spring Data JPA library is one of the most popular design patterns to achieve  separation between the actual database, queries, and other data access logic from the rest of the application.

Areas which could have been covered given more time :

i)User authentication using JWT and not form based Spring Security login.
ii)Unit test of the classes , using JUnit and Mockito.