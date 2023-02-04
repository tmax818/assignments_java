# [Hopper's Receipt](https://login.codingdojo.com/m/315/9532/64747)

- Be sure you have a WEB-INF folder within your webapp folder, and that it is added to the configurations in your application.properties file so Tomcat knows where to look:

```
spring.mvc.view.prefix=/WEB-INF/copy
```

- Double check the `@Controller` annotation in your controller is present.
- Check your imports.
- If values aren't showing up on the page, double check the key value pair names from your controller to the variable names used in your template (index.jsp) and also double-check the `c:out` tag syntax.

- [ ] Create a new Spring Starter Project.

- [ ] Create a controllers package and a controller within it

- [ ] Go through all the set up requirements for adding JSP and JSTL to your project

- [ ] Render the purchase information on the page.

- [ ] Change the variable values from "Grace Hopper" etc. to other values to thoroughly test your code.

## Review Material

- [Java Server Pages](https://login.codingdojo.com/m/315/9532/64276)

> it is [a] better practice to separate the presentation layer from the logic layer.

```xml
<dependency>
        <groupId>org.apache.tomcat.embed</groupId>
        <artifactId>tomcat-embed-jasper</artifactId>
</dependency>


```
- [JSTL Tags](https://login.codingdojo.com/m/315/9532/64553)


- [Rendering with `@Controller`](https://login.codingdojo.com/m/315/9532/64278)


- [More On Rendering Data](https://login.codingdojo.com/m/315/9532/64279)