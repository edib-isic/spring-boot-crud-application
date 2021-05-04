# spring-boot-crud-application
spring boot full crud application
Angular Spring Boot CRUD Full Stack App created by Edib Isic a fullstack Application that 
edits, creates, deletes and reads Data from the mysql database 
You have to install a local version of the MySQL database you can find it under https://dev.mysql.com/downloads/installer/
Download and install then .

Open the file=>
C:\Users\edibi\git\spring-boot-crud-fullStackApp\cvt-programmingTask\src\main\resources edit the application.properties 
and write the following text:

spring.datasource.url=jdbc:mysql://localhost:3306/cvt_programmingtask?useSSL=false
spring.datasource.username=rootEdib
spring.datasource.password=rootEdib

Then you need to create a new connection in the MySql Workbench with the same credentials as above.
and Then you need to create a new database with in the MySql Workbench
provide a database name like in this example "cvt_programmingtask"

after this you can test the connection then you 

Import the project into your eclipse ide and run it 

go the file 

\spring-boot-crud-fullStackApp\cvt-programmingTask\src\main\java\com\cvt\programmingTask\CvtProgrammingTaskApplication.java
then right click on the project and select Maven>UpdateProject then right click on the project root folder and click on RunAs>SpringBootApp
Then the Tomcat Server should boot up and release following information

2021-05-05 01:40:38.865  INFO 19884 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''

Then install the frontEnd Part
