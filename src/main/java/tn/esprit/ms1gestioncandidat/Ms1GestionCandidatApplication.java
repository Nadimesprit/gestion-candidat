package tn.esprit.ms1gestioncandidat;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import tn.esprit.ms1gestioncandidat.entities.Candidat;
import tn.esprit.ms1gestioncandidat.repositories.CandidatRepository;
import java.util.stream.Stream;

@EnableEurekaClient
@SpringBootApplication
public class Ms1GestionCandidatApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms1GestionCandidatApplication.class, args);
	}
	@Bean
	ApplicationRunner start (CandidatRepository candidatRepository){
		return args -> {
			Stream.of(
					Candidat.builder().nom("Nagati")
							.prenom("Nadim")
							.email("Nadim.nagati@esprit.tn")
							.build(),
					Candidat.builder().nom("Trabelsi")
							.prenom("Mayssa")
							.email("Mayssa.trabelsi@esprit.tn")
							.build())
			.forEach
			(
					Candidat ->
					{
						candidatRepository.save(Candidat) ;
					}
			);
			candidatRepository.findAll().forEach(System.out::println);
		};
	}
}
