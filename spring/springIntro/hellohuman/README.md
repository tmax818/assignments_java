# [Hello Human](https://login.codingdojo.com/m/315/9532/64275)

- [ ] Create an app that will show in the browser either a default value of "human" or with the name provided in the URL query string.

- [ ] NINJA BONUS: Include a "last_name" as a parameter and print out both the first and last names.

- [ ] SENSEI BONUS: Add a "times" parameter and show the greeting that many times.

## NOTES

user query params:

```java
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HomeController {
    @RequestMapping("/")
    public String index(@RequestParam(value="q", required = false) String searchQuery) {
        return "You searched for: " + searchQuery;
    }
}
```