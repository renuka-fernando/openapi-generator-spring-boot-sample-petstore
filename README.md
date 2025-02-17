# openapi-generator-spring-boot-sample-petstore

## Build

```shell
sdk env
mvn clean package
```

## Run

```shell
java -jar target/spring-boot-openapi-generator-sample-1.0.0-SNAPSHOT.jar
```

## Invoke

```shell
curl http://localhost:8080/pet/1 -H 'accept: application/json'
```
