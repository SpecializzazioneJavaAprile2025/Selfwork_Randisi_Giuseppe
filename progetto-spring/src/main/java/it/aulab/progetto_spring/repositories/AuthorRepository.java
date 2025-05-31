package it.aulab.progetto_spring.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;

import it.aulab.progetto_spring.models.Author;

public interface AuthorRepository extends ListCrudRepository<Author, Long>{
    //Impostiamo a ListCrud per ottenere una lista in ritorno dal Crud
    //Best Practice: Fai Sempre una ListCrud

    //findBy = Query WHERE

    List<Author> findByName(String name);
    //Il nome della prorpietà presente nel modello deve essere riportata anche nella derived query
    //Qui usi Name perchè nel modello hai usato name; Poi Cerchi per FIRSTNAME in quanto è quella la ROW presente nella tabella Author
    //In ogni caso, se record singolo o doppio, ritorniamo SEMPRE una Lista (così abbiamo anche i metodi delle liste).

    List<Author> findBySurname(String lastname);
    //Tra parentesi sono parametri formali/Segnaposto. Volendo posso passargli il nome della variabile presente in un form

    List<Author> findByNameAndSurname(String firstname, String lastname);
    //Traduzione in query SQL = select all from Author Where firstname = firstname AND surname = lastname
    //(In base a dove si trova la query derivata, dopo from andrà qualcosa)
    //Name e Surname sono usati in base a cosa c'è nel modello; 
    //Se nel modello scrivevamo solo name e lastname, diventava findByNameAndLastname
    //Es. = List<Author> findByNameAndSurname(String franco, String rossi) diventa select all from Author where firstname = franco and surname = rossi
    
    //Query Nativa
    //Scritta normale in SQL
    //FROM authors a = Richiami un alias di authors dichiarandolo a; Dopo scrivi semplicemente a per richiamare authors
    @Query(value =" SELECT * FROM authors a WHERE a.firstname = 'Pippo'", nativeQuery = true)
    List<Author> authorsWithNames();


    //Query NON NATIVA con OOP
    //Passiamo l'oggetto ed il nome presente nel model
    @Query("SELECT a FROM Author a WHERE a.name ='Pippo'")
    //Volendo Possiamo anche passargli degli elementi dinamici al posto del value direttamente noi. Esempio = Value di ritorno da un form o da una barra di ricerca testuale
    List<Author> authorsWithNamesNotNative();

}   