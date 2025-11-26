# Spring Boot + Docker + MySQL -- TP Completion Guide

## 1. Préparation du projet Spring Boot

-   Créer un projet via https://start.spring.io
-   Group : `ma.ens`
-   Artifact : `springdocker`
-   Dépendances :
    -   Spring Web
    -   Spring Data JPA
    -   Lombok
    -   MySQL Driver

### Configuration `application.properties`

    spring.datasource.url=jdbc:mysql://localhost:3306/demo_db?createDatabaseIfNotExist=true
    spring.datasource.username=root
    spring.datasource.password=1234
    spring.jpa.hibernate.ddl-auto=update
    server.port=8080

### Compilation

    mvn clean package -DskipTests

------------------------------------------------------------------------

## 2. Dockerfile

Créer un fichier `Dockerfile` à la racine :

    FROM openjdk:17-jdk-slim
    WORKDIR /app
    COPY target/springdocker-0.0.1-SNAPSHOT.jar app.jar
    EXPOSE 8080
    ENTRYPOINT ["java", "-jar", "app.jar"]

------------------------------------------------------------------------

## 3. Construction & Exécution Docker

### Construire l'image

    docker build -t ens/springdocker:1.0 .

### Lister les images

    docker images





------------------------------------------------------------------------


------------------------------------------------------------------------

## 5. Exécuter Docker Compose





<img width="1381" height="287" alt="image" src="https://github.com/user-attachments/assets/e732ce66-4224-4980-aeee-991a0a720192" />
  







