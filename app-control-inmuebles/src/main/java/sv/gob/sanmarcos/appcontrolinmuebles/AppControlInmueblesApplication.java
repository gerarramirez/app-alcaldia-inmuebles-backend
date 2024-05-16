package sv.gob.sanmarcos.appcontrolinmuebles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class AppControlInmueblesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppControlInmueblesApplication.class, args);
	}

}
