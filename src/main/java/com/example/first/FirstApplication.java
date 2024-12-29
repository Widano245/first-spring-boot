package com.example.first;

import com.example.first.entities.Etudiant;
import com.example.first.repositories.EtudiantRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
	}

	@Bean
	CommandLineRunner start(EtudiantRepository etudiantRepository ){
		return args -> {
			Etudiant e1 =  Etudiant.builder()
					.age(23)
					.nom("ouma")
					.note(15.0)
					.build();
			etudiantRepository.save(e1);
			Etudiant e2 = Etudiant.builder()
					.age(20)
					.nom("Khaoula")
					.note(14.0)
					.build();
			etudiantRepository.save(e2);
			List<Etudiant> listes = etudiantRepository.findAll();
			for (Etudiant e : listes)
				System.out.println(e);
		};
	}
}
