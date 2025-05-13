package Esercizio6;

import java.util.*;

public class Funko {

    private String name;
    private String series;
    public Funko(String name, String series) {
        this.name = name;
        this.series = series;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSeries() {
        return series;
    }
    public void setSeries(String series) {
        this.series = series;
    }

    public static List<Funko> createAndPrint(){
        List <Funko> funkos = new ArrayList<Funko>();
        funkos.add(new Funko("Mario", "SuperMario"));
        funkos.add(new Funko("Luigi", "SuperMario"));
        funkos.add(new Funko("Luigi", "SuperMario"));
        for(int i=0; i< funkos.size(); i++){
            Funko f = funkos.get(i);
            System.out.println(f.getName() + " " + f.getSeries() );
        }
        return funkos;
    }
    
    public static void print(List<Funko> list){
    for(int i=0; i< list.size(); i++){
            Funko f = list.get(i);
            System.out.println(f.getName() + " " + f.getSeries() );
        }
    }

      @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Funko funko = (Funko) obj;

    return Objects.equals(name, funko.name) &&
           Objects.equals(series, funko.series);
        }       

    @Override
    public int hashCode() {
    return Objects.hash(name, series);
    }

    @Override
    public String toString() {
    return "Funko{" + "Nome='" + name + '\'' + ", Serie='" + series + '\'' + '}';
        }


    public static HashSet<Funko> removeDuplicates(List<Funko> list){
        System.out.println("//----\\\\");
        System.out.println("Rimozione Duplicati");
        return new HashSet<>(list);
    }

}
