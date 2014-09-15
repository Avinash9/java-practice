package FirstApp.FirstApp;


import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingControoler {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting1")
    public Greeting greeting(@RequestParam(value="name", required=true, defaultValue="World11111") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
}