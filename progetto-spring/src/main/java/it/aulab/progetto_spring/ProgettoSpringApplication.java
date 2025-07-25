package it.aulab.progetto_spring;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import it.aulab.progetto_spring.utils.mappings.AuthorToAuthorDtoPropertyMap;

@SpringBootApplication
public class ProgettoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProgettoSpringApplication.class, args);
	}

	@Bean
	public ModelMapper instanceModelMapper(){
		ModelMapper mapper = new ModelMapper();
		mapper.addMappings(new AuthorToAuthorDtoPropertyMap());
		return mapper;
	}

}
