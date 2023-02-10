# [Burger Tracker I](https://login.codingdojo.com/m/315/9533/65990)

## Checklist

- [ ] Create a new Spring Project with packages for models, repositories, services and controllers.

- [ ] Create a model called Burger with all the appropriate fields. Don't forget to add annotations and getters & setters!

- [ ] Add all the appropriate dependencies and setup for adding JSP views and connecting to the database

- [ ] Create a schema for the project and test the setup by running your project. Debug as necessary!

- [ ] Create an index.jsp file with a table and a form (hard coded for now).

- [ ] Create a route in your controller to render index.jsp and just test that it renders.

- [ ] Set up your BurgerRepository (findAll is the only necessary query method to add at this time)

- [ ] Set up your BurgerService with any necessary methods. Don't forget to inject your repository interface as a dependency.

- [ ] Add @ModelAttribute annotation and associated syntax to your render route, to bind an empty Burger object to the JSP form to capture the user input.

- [ ] In your JSP, change the form tags to form:form tags, add the modelAttribute, error tags and be sure to include the path attribute.

- [ ] Add a POST route in your controller to process the form and add a new burger to the database, using the @ModelAttribute annotation to receive the filled Burger object.

- [ ] Be sure the POST route redirects to the render route after creating the new burger.

- [ ] Test successful creation by adding some new (valid) entries in the form. For now, use workbench to see the results in the database.

- [ ] In your render route, retrieve all the records from the database and render them on the page and test.

- [ ] Finally, be sure to handle validations in your POST method. If the user has any errors, you'll need to render the page again. But remember, you may need to send in some data here as well!

## Review

- [Adding a create form](https://login.codingdojo.com/m/315/9533/64304)