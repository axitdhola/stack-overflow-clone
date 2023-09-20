# Tech Stack
1. Java, Spring Boot

# How to run this code
1. download Spring Tools 4 for Eclipse from https://spring.io/tools
2. Unzip the downloded folder and open SpringToolSuite4.exe file. 
3. Download the github repo and open inside above mention .exe file
4. Run the code
5. You do not need any database connections, Bacuase i used H2 database which is inMemory database in Spring Boot
6. You can see database at http://localhost:8080/h2-console and hit the connect button.  

# Backend Architecture
1. Layer1 : Controller Layer(To map incoming request with services)
2. Layer2 : Service Layer(Business Logic)
3. Layer3 : DAO Layer(For Database related oparations)
4. Layer4 : Database Server

# Exposed API
1. http://localhost:8080/user/add   - POST   - To a add new user
2. http://localhost:8080/question/add - POST - To add a new question
3. http://localhost:8080/question/{id}  - GET - To get a question by their Id
4. http://localhost:8080/question/edit/{id} - PUT - To edit a question.
5. http://localhost:8080/question/user/{name} - GET - To get all question belogs to a user
6. http://localhost:8080/question/tag - POST - To get all question that contains given tag
6. http://localhost:8080/answer/add  - POST - To add a new answer
7. http://localhost:8080/answer/question/{id}  - GET - To get all answer belogs to a question
8. http://localhost:8080/answer/user/{name} - GET - To get all answer given by a user



