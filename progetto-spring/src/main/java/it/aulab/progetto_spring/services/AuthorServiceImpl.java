package it.aulab.progetto_spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import it.aulab.progetto_spring.models.Author;
import it.aulab.progetto_spring.models.Post;
import it.aulab.progetto_spring.repositories.AuthorRepository;

@Service
public class AuthorServiceImpl implements AuthorService{

    //Object Injection

    @Autowired
    AuthorRepository authorRepository;

    @Override
    public List<Author> readAll() {
        return authorRepository.findAll();    
    }

    @Override
    public Author read(Long id) {
        Optional<Author> optAuthor = authorRepository.findById(id);
        //Aggiungiamo un controllo al metodo nel caso l'id non sia collegato ad autore
            //Mettiamo La possibilità che non esista usando OPTIONAL (Può ritornare un oggetto Vuoto = OPTINAL)
        if(optAuthor.isPresent()){
            return optAuthor.get();
            //SE il POSSIBILE Author NULL contiene un, id, fai get)
        }else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Auhtor id= " + id + " not found");
            } 
        } 

    @Override
    public List<Author> read(String email) {
        //If su unica riga = Se una IF ha UN SOLO ED ESCLUSIVAMENTE UN COMANDO puoi omettere le graffe
        if(email == null) throw new ResponseStatusException(HttpStatus.BAD_REQUEST); 
        return authorRepository.findByEmail(email);
    }

    @Override
    public List<Author> read(String firstname, String lastname) {
        if(firstname == null || lastname == null ) throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        return authorRepository.findByNameAndSurname(firstname, lastname);
        }

    @Override
    public Author create(Author author) {
        if(author.getEmail() == null) throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        return authorRepository.save(author);   
    }

    @Override
    public Author update(Long id, Author author) {
        if (authorRepository.existsById(id)){
            author.setId(id);
            return authorRepository.save(author);
        } else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public void delete(Long id) {
        if (authorRepository.existsById(id)) {
            Author author = authorRepository.findById(id).get();
            List<Post> authorPosts = author.getPosts();
            for (Post post : authorPosts) {
                post.setAuthor(null);
            }
            authorRepository.deleteById(id);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Author not Found");
        }
      }

}
