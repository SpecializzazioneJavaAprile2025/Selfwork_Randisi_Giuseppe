package Esercizio1;
import java.util.ArrayList;
import java.util.List;

public class Amiibo {

    private String name;
    private String series;
    
    public Amiibo(String name, String series) {
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

    public static List<Amiibo> getSuperMarioAmiibo(List<Amiibo> amiibos){

        List<Amiibo> superMarioSerieS = new ArrayList<>();
        List<Amiibo> otherSeries = new ArrayList<>();

        for (int i = 0; i<amiibos.size(); i++){
            Amiibo am = amiibos.get(i);
            if(am.getSeries().equalsIgnoreCase("Super Mario")){
                superMarioSerieS.add(am);
            } else {
                    otherSeries.add(am);
            }
        }

        return superMarioSerieS;
        
    }
    
    @Override
    public String toString(){
        return "Amiibo{name='" + name + "', series='" + series + ";'}";
    }
}
