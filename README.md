# GitPod Spring Boot Test

A simple test spring-boot application generated with spring initializr.

## Getting Started

[![Open in Gitpod](https://gitpod.io/button/open-in-gitpod.svg)](https://gitpod.io/#https://github.com/axiallon/testing-gitpod-spring)

### Running the Application

Three ways to start the application:

  - Open `Application.java` and click on `Run` link above the main method.

  - Once the application is running, you can access the Welcome page by navigating to the `Open Ports` tab and click on the `Open Browser` button for port 8080.

### Database

This application uses an embedded H2 database.

#### Database Access

When the application is running, you can access the embedded H2 database via the following URL path: `/h2-console`.

Use JDBC URL: `jdbc:h2:./target/database/h2`

#### Database Migrations

Database changes are managed via Flyway. The following link provides additional details regarding [Flyway Migration Concepts](https://flywaydb.org/documentation/concepts/migrations).

The database migration scripts are located in `src/main/resources/db/migration`.

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.4.2/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.4.2/maven-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.4.2/reference/htmlsingle/#using-boot-devtools)
* [Spring Configuration Processor](https://docs.spring.io/spring-boot/docs/2.4.2/reference/htmlsingle/#configuration-metadata-annotation-processor)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.4.2/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.4.2/reference/htmlsingle/#boot-features-jpa-and-spring-data)
* [Flyway Migration](https://docs.spring.io/spring-boot/docs/2.4.2/reference/htmlsingle/#howto-execute-flyway-database-migrations-on-startup)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

