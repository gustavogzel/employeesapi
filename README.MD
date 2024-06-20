# Generate Employees API
## Problem :
- Illustrate the straightforward way to develop an API rest using the Spring Data JPA and Mockito Test features.
- Illustrate a complex query using the Spring Data JPA.

## Solution Approach:
- EmployeeController exposes the API developed using Spring Data JPA.
- EmployeeControllerTest uses Mockito test features.
    One of the basic functions of mocking frameworks is an ability to return a given value when a specific method is called. 
    It can be done using Mockito.when() in conjunction with thenReturn () . 
    This process of defining how a given mock method should behave is called stubbing.

- EvaluacionService exposes a Service API with complex queries.
- EvaluacionRepositoryTest uses a test to verify the Hibernate SQL generated.
- Enable a h2database 



## Explanation

mvn spring-boot:run

    http://localhost:8080/api/employees

            POST http://localhost:8080/api/employees
            POST /api/employees HTTP/1.1
            Content-Type: application/json
            User-Agent: PostmanRuntime/7.29.4
            Accept: */*
            Host: localhost:8080
            Accept-Encoding: gzip, deflate, br
            Connection: keep-alive
            Content-Length: 52            
            {"name":"developer","position":"software developer"}

            
            HTTP/1.1 200 OK
            Content-Type: application/json
            Transfer-Encoding: chunked
            Date: Thu, 20 Jun 2024 00:16:28 GMT
            Keep-Alive: timeout=60
            Connection: keep-alive 
            {"id":1,"name":"developer","position":"software developer"}



mvn test
