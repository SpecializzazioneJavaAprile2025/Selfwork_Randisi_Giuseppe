package it.aulab.progetto_spring.services;

import java.util.List;

import it.aulab.progetto_spring.dtos.AuthorDto;
import it.aulab.progetto_spring.models.Author;

public interface AuthorService {

    //Service =contengono Business Logic; Ergo MANIPOLAZZIONE DEL DATO ottenuto da REPOSITORY
     //Farai la Object Injection  
    
     List<AuthorDto> readAll();
     AuthorDto read(Long id);
     List<AuthorDto> read(String email);
     List<AuthorDto> read(String firstname, String lastname);
     AuthorDto create(Author author);
     AuthorDto update(Long id, Author author);
     void delete(Long id);

     //Hai solo le FIRME DEI METODI. Poi nell'impl andrai a scrivere il corpo del metodo

}