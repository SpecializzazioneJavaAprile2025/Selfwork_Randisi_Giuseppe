package Esercizio2;

import java.util.Objects;;
public class Game {

    public String name;
    public String producer;
    public int year;
    public Game(String name, String producer, int year) {
        this.name = name;
        this.producer = producer;
        this.year = year;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getProducer() {
        return producer;
    }
    public void setProducer(String producer) {
        this.producer = producer;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        Game other = (Game) obj;
    
        return Objects.equals(name, other.name) && Objects.equals(producer, other.producer) && year == other.year;
        }

        @Override
        public int hashCode(){
            return Objects.hash(name, producer, year);
        }
    }

