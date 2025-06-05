package it.aulab.progetto_spring.models;

import java.beans.Transient;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name="authors")  //Senza questo, la tabella che il framework cerca nel database è author 
//(come il nome della classe)
//@JsonIgnoreProperties({"id"}) 
  //Ignora L'id Quando chiami Author.
    //Ricorda che però fare questo sulla classe non è il massimo per la deserializzazione del dato 
        //Serializzare = Da Oggetto a JSON
        //DESerializzare = da JSON ad Oggetto

    public class Author {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id; //Di norma Long significa ID. 
        
        @Column(name="firstname", nullable = true)
        private String name;
        
        @Column(name="lastname", nullable = true)
        private String surname;
        
        @Column(nullable = false, unique = true) 
        //Di default è false il nullable. Però decidi tu
        private String email;


        @OneToMany(mappedBy = "author")
        //mappedBy = "Mappalo per/Traccia la relazione grazie ad attributo author"
        @JsonIgnoreProperties({"author"})
        private List<Post> posts = new ArrayList<Post>();
        //Per evitare il ritorno di NULL, se Posts dovesse ritornare null
        //Quanto meno a default diamo un valore come Lista di Array POST ma Vuota
        //Ritorna sempre qualcosa
        //Esempio = L'autore non ha Post

        
        public Author() {
        }

        public Long getId() {
            return id;
        }
        
        public void setId(Long id) {
            this.id = id;
        }
        
        public String getName() {
            return name;
        }
        
        public void setName(String name) {
            this.name = name;
        }
        
        public String getSurname() {
            return surname;
        }
        
        public void setSurname(String surname) {
            this.surname = surname;
        }
        
        public String getEmail() {
            return email;
        }
        
        public void setEmail(String email) {
            this.email = email;
        }
        public List<Post> getPosts() {
            return posts;
        }
    
        public void setPosts(List<Post> posts) {
            this.posts = posts;
        }

        @Transient
        public String getFullname(){
            return name +" "+surname;
        }

    }   
