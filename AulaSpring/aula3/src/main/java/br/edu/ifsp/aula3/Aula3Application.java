package br.edu.ifsp.aula3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsp.aula3.repository.PerfilRepository;

@SpringBootApplication
@RestController
public class Aula3Application {
	public static void main(String[] args) {
		PerfilRepository.init();
		SpringApplication.run(Aula3Application.class, args);

	}

}
