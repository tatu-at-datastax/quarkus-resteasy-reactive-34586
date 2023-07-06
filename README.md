# quarkus-resteasy-reactive-34586

This project reproduces following issue:

* [quarkus#34586](https://github.com/quarkusio/quarkus/issues/34586)

with

    ./mvnw clean test

To make test(s) pass modify `pom.xml` and uncomment `quarkus-resteasy` dependency (instead of default `quarkus-resteasy-reactive`)
