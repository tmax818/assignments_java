- [ ] Add 2 new routes with corresponding method definitions in your Daikichi Routes project that will accept path variables.

- [ ] Have an http GET request to 'http://localhost:8080/daikichi/travel/kyoto' where the url will take any string for the city, and display text that says for example, 'Congratulations! You will soon travel to kyoto!'.

- [ ] Have an http GET request to 'http://localhost:8080/daikichi/lotto/8', where the url will take any integer. If the number is even, display text that says 'You will take a grand journey in the near future, but be weary of tempting offers'. If it is odd, display text that says "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends."

```java
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HomeController {
    @RequestMapping("/m/{track}/{module}/{lesson}")
    public String showLesson(@PathVariable("track") String track, @PathVariable("module") String module, @PathVariable("lesson") String lesson){
    	return "Track: " + track + ", Module: " + module + ", Lesson: " + lesson;
    }
}
```