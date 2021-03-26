# jaxb233perfmance
This simple project is to reproudce the performance regeression issue caused by 
this [change](https://github.com/eclipse-ee4j/jaxb-ri/pull/1352) jaxb 2.3.3 with jdk8. There is one 
test in this producer simply creates JAXBContext instance for 200 times and print
the time it takes. It shows this change in jaxb2.3.3 makes 10x times slower than jaxb 2.3.2. 
## Steps to run this produceer
- Change jdk version to 1.8.x
- ```mvn clean install``` to run with jaxb 2.3.3 
- ```mvn clean install -Pjaxb232``` to run with jaxb 2.3.3
### Test result with openjdk 1.8.0.282
- jaxb 2.3.2
```
[INFO] Running org.example.CreateJAXBContextBenchMarkTest
Create 200 JAXBContext takes: 1111ms
```
- jaxb 2.3.3
```
[INFO] Running org.example.CreateJAXBContextBenchMarkTest
Create 200 JAXBContext takes: 15623ms
```