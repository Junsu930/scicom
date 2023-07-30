package scicom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class ScicomApp {

	public static void main(String[] args) {
		SpringApplication.run(ScicomApp.class, args);
	}
}
