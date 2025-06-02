package it.aulab.progetto_spring.services;

import java.util.List;

import it.aulab.progetto_spring.models.Author;

public interface AuthorService {

    //Service =contengono Business Logic; Ergo MANIPOLAZZIONE DEL DATO ottenuto da REPOSITORY
     //Farai la Object Injection  
    
     List<Author> readAll();
     Author read(Long id);
     List<Author> read(String email);
     List<Author> read(String firstname, String lastname);
     Author create(Author author);
     Author update(Long id, Author author);
     void delete(Long id);

     //Hai solo le FIRME DEI METODI. Poi nell'impl andrai a scrivere il corpo del metodo

}