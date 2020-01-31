# Spring Boot On K8s #

O objetivo dessa aplicação é servir como prova de conceito
para o aprendizado de como subir uma aplicação em Kubernetes.
Passando desde a criação da aplicação e concepçao de uma 
utilidade prática, testar funcionalidades ou ferramentas
novas execução do container até a execução na
plataforma Kubernetes propriamente dito.

A aplicação será evoluída em dojos em conjunto
com a equipe.

## Run ##

```
    java -jar target/spring-boot-on-k8s-*.jar 

    java -Dspring.profiles.active=test -jar target/spring-boot-on-k8s-*.jar 
```

## Healthcheck ##

```
curl -i http://localhost:8080/actuator/health
```
