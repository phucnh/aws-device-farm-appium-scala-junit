AWS Device Farm Appium Scala Junit
-------

The sample project setup for testing web app on AWS Device Farm

### Prerequisite

- maven

### Building

```bash
mvn clean test-compile
``` 

### Run test on AWS Device Farm

- Firstly, generate `target/AppiumScalaJUnit.zip` file:
```bash
mvn clean package -DskipTests=true
```
- Go to AWS Device Farm console, create a new project 
then create new run
- On "Create a new run" screen, choose web application, 
enter the test's name, next step
- Choose "Appium Java JUnit" test framework then upload 
`target/AppiumScalaJUnit.zip`, next step
- Create device pool and select target iPhone device
- Wait until test finish...

### Troubleshooting

- See [appium Java JUnit Web Troubleshooting on official Document](https://docs.aws.amazon.com/devicefarm/latest/developerguide/troubleshooting-appium-web-java-junit-tests.html)

### References

- https://docs.aws.amazon.com/devicefarm/latest/developerguide/test-types-web-app-appium-java-junit.html
- https://dev.classmethod.jp/cloud/aws/device-farm-web-app/
