package cz.gyarab.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigInteger;

@SpringBootApplication
@Controller //takhle se to pry moc delata nema
public class MyappApplication {
	@GetMapping("/factorial")
	public String myFactorial(@RequestParam(defaultValue = "12") Integer number, Model model){
		model.addAttribute("number", number);
		int factorial = 1;
		for (int i = 1; i < number; i++) {
			factorial *= i ;
		}
		model.addAttribute("factorial", factorial);
		return "ff";
	}
	public static void main(String[] args) {
		SpringApplication.run(MyappApplication.class, args);
	}

}
