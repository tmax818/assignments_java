# [Burger Tracker II](https://login.codingdojo.com/m/315/9533/65992)

## Checklist

- [ ] Make a task list for how to approach adding update functionality to this project.

- [ ] Work with at least one other student at some point while completing this assignment.

- [ ] Keep a list of challenging aspects and specific bugs you fixed for future reference and to help others.

- [ ] Implement all the features detailed in the above wireframe into your Burger Tracker project.

## Task List

- update [application.properties](src/main/resources/application.properties)

- update [pom.xml](pom.xml)

```xml
<!--  -->
		<dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-tomcat</artifactId>
            <scope>provided</scope>
        </dependency>
		<dependency>
			<groupId>org.apache.tomcat.embed</groupId>
			<artifactId>tomcat-embed-jasper</artifactId>
        </dependency>

			<!--  -->
		<dependency>
			<groupId>javax.servlet</groupId>
			<artifactId>jstl</artifactId>
        </dependency>
		<!-- VALIDATIONS -->
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-validation</artifactId>
		</dependency>  

	    <!-- BOOTSTRAP DEPENDENCIES -->
		<dependency>
			<groupId>org.webjars</groupId>
			<artifactId>webjars-locator</artifactId>
			<version>0.30</version>
    	</dependency>
		<dependency>
			<groupId>org.webjars</groupId>
			<artifactId>bootstrap</artifactId>
			<version>5.0.1</version>
		</dependency>
		<dependency>
			<groupId>org.webjars</groupId>
			<artifactId>jquery</artifactId>
			<version>3.6.0</version>
		</dependency>
```

- add [BurgerController.java]()

- add [index.jsp](src/main/webapp/WEB-INF/index.jsp)
- add [show.jsp](src/main/webapp/WEB-INF/show.jsp)
- add [edit.jsp](src/main/webapp/WEB-INF/edit.jsp)

## Review 

- [Edit and Update](https://login.codingdojo.com/m/315/9533/64306)