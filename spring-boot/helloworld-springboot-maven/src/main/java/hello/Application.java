package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	private static String envValue;
	
	@RequestMapping("/")
	public String home() {
		return "Hello Docker World, Environment - " + envValue;
	}


	public static void main(String[] args) {
		if (args != null && args.length > 0) {
			envValue = args[0];
		}
		SpringApplication.run(Application.class, args);
	}

}
