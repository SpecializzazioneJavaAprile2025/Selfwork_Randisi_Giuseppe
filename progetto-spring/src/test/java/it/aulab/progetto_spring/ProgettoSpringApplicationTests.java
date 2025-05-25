package it.aulab.progetto_spring;

import static org.assertj.core.api.Assertions. *;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.TestPropertySource;

import it.aulab.progetto_spring.models.Author;
import it.aulab.progetto_spring.repositories.AuthorRepository;

//@SpringBootTest
//Commentiamo per effettuare i test solo sui JPA. Non su tutto il contesto
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@TestPropertySource(locations = "classpath:application.properties")
@Commit
//Usi il tuo database ma non lo "Rovini"
class ProgettoSpringApplicationTests {
	
	@Autowired
	AuthorRepository authorRepository;

	@BeforeEach
	//Prima di Ogni Test, fai
		void load(){
		Author a = new Author();
		a.setName("Pippo");
		a.setSurname("Franco");
		a.setEmail("PippoFranco@bagaglino.com");
		authorRepository.save(a);
		//Metodo .save preso da AuthorRepository che lo prende da CrudRepository ("...extends...") 
		//Salviamo nel database tutto un nuovo Author
		}

	//@Test
	// void contextLoads() {
	// }
	@Test
	void findByName(){
		assertThat(authorRepository.findByName("Pippo"))
		//Asserisci che sia vero che: in AuthorRepository e fai una query con Pippo, dalla lista che ti arriva (List<Author>)
		.extracting("name")
		//Estrai la proprietà Name 
		.containsOnly("Pippo");
		//Esso contiene solo "Pippo". Quindi non ritonra name = Pippo ma solo Pippo
	}
	@Test
	void authorsWithNamesNotNative(){
		assertThat(authorRepository.authorsWithNamesNotNative())
		.extracting("name")
		.containsOnly("Pippo");
	};

	@Test
	void authorsWithNames(){
		assertThat(authorRepository.authorsWithNames())
		.extracting("name")
		.containsOnly("Pippo");
	};
}
//Prova a risolvere test falliti
