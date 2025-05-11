package Esercizio1;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        Amiibo doctorMario = new Amiibo("Doctor Mario", "Super Mario");
        Amiibo peach = new Amiibo("Princess Peach", "Super Mario");
        Amiibo samusAran = new Amiibo("Samus Aran", "Metroid");
        Amiibo link = new Amiibo("Link", "The Legend Of Zelda");

        List<Amiibo> allAmiibos = new ArrayList<>();
        allAmiibos.add(doctorMario);
        allAmiibos.add(peach);
        allAmiibos.add(link);
        allAmiibos.add(samusAran);

        List<Amiibo> superMariolist = Amiibo.getSuperMarioAmiibo(allAmiibos);
        
        System.out.println("Tutti Gli Amiibo");
        for (int i = 0; i<allAmiibos.size(); i++){
            System.out.println(allAmiibos.get(i));
        }

        System.out.println("Amiibo Serie Super Mario");
        for (int i = 0; i<superMariolist.size(); i++){
            System.out.println(superMariolist.get(i));
        }
    }
}
