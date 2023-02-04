# [Counter](https://login.codingdojo.com/m/315/9532/64284)


- [ ] Create and display a counter on http://your_server/counter

- [ ] Increment the counter on each visit to http://your_server/

- [ ] Counter must start at zero

- [ ] No errors regardless of which page is visited first

- [ ] NINJA BONUS: Create a third page that will increment the counter by 2

- [ ] NINJA BONUS: Create a reset button to set the counter back to zero


## Review

- [Session]()

- [Session in Java](https://login.codingdojo.com/m/315/9532/65005)

# using session

```java
// ... package and other imports you may have
import javax.servlet.http.HttpSession;
@Controller
public class MainController {
    public String index(HttpSession session){
		 // Here we can use the variable session to store things!
		return "index.jsp"
	}
// ...
```