package fiszki.pl.Fiszki;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FiszkiApplication {

	public static void main(String[] args) {

		SpringApplication.run(FiszkiApplication.class, args);


	}
	@GetMapping
	public String index() {
		return "Witamy w aplikacji fiszki \r\n W tym miejscu powstanie aplikacja do nauki przy pomocy prostych karteczek \r\n Zapraszamy wkrotce  ";
	}
}
