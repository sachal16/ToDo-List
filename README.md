📝 To-Do List Application

This is a full-stack To-Do List application that allows users to create, view, and manage their personal goals or tasks. 
It is built using Spring Boot, Thymeleaf, HTML, and a MySQL/PostgreSQL relational database with JPA and Hibernate for ORM.

🔧 Technologies Used:

Java 21
Spring Boot 3.4.5
Thymeleaf (template engine for HTML rendering)
HTML5/CSS3 (frontend design)
JPA & Hibernate (ORM for database interaction)
MySQL / PostgreSQL (relational database)
Spring Data JPA (repository layer)
Maven (project management)

✨ Features:

Add new tasks/goals with titles and descriptions
Mark tasks as completed
View a list of all goals (pending and completed)
Delete goals from the list
Clean and responsive UI built using HTML and Thymeleaf
Full integration between front-end and back-end
Persistent data storage using SQL database

🗂️ Project Structure:
css
Copy code
src/
 └── main/
     ├── java/
     │   └── com.app.todoapp/
     │       ├── controller/
     │       ├── model/
     │       ├── repository/
     │       ├── service/
     │       └── TodoappApplication.java
     └── resources/
         ├── templates/  (Thymeleaf HTML files)
         ├── static/     (CSS/JS)
         └── application.properties

⚙️ Prerequisites:

Java 21+
Maven
MySQL or PostgreSQL
IDE (e.g., IntelliJ, VS Code)

Setup Instructions:

1) Clone the Repository

2) bash
  Copy code
  git clone https://github.com/your-username/todoapp.git
  cd todoapp
  Configure the Database

3) Create a new database (todo_db) in MySQL or PostgreSQL.

4) Update the application.properties file with your database credentials:
  properties
  Copy code
  spring.datasource.url=jdbc:mysql://localhost:3306/todo_db
  spring.datasource.username=your_username
  spring.datasource.password=your_password

  spring.jpa.hibernate.ddl-auto=update
  spring.jpa.show-sql=true
  
5) Run the Application

  bash
  Copy code
  ./mvnw spring-boot:run
  
6) Access the App
  Open your browser and go to:
  arduino
  Copy code
  http://localhost:8080
