Java Unit Testing with Gradle and CircleCI
==========================================

This project contains sample code for running Java Unit Tests with junit5, Gradle and CircleCI.


How to use
----------

Run unit tests (from project root) with

```bash
./gradlew clean test
```

Run Cucumber JVM tests (from project root) with

```bash
./gradlew clean executeFeatures
```


Circle CI Build Job
-------------------

Check https://circleci.com/gh/michaellihs/javaunittesting


References and Resources
------------------------

* [CircleCI configuration for Gradle](https://github.com/RealOrangeOne/java-gradle-circleci/blob/master/.circleci/config.yml)
* [CircleCI Docker images for Java](https://hub.docker.com/r/circleci/openjdk)
* [Gradle configuration for nicer test output](https://stackoverflow.com/questions/3963708/gradle-how-to-display-test-results-in-the-console-in-real-time)
* [Mac OS desktop notifications for CircleCI](https://github.com/nolaneo/SeaEye)
* [Cucumber JVM installation](https://docs.cucumber.io/installation/java/)
