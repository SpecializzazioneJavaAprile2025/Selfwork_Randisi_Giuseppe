package it.aulab.progetto_spring.utils.mappings;

import org.modelmapper.PropertyMap;
import it.aulab.progetto_spring.dtos.AuthorDto;
import it.aulab.progetto_spring.models.Author;
import it.aulab.progetto_spring.utils.mappings.CollectionToIntegerConverter;

public class AuthorToAuthorDtoPropertyMap extends PropertyMap<Author, AuthorDto> {
    //PropertyMap = Classe Astratta che richeide Sorgente e Destinazione 

    @Override
    protected void configure() {
        map(source.getFullname()).setFullname(null);
        //Il get lo chiami dal Model; Il set lo fai sul DTO.
        //Il risultato del getFullname diventa parametro del metodo successivo setFullname
            //Sintassi Da FRAMEWORK
        using(new CollectionToIntegerConverter()).map(source.getPosts()).setNamenumberOfPosts(null);
    }


}
