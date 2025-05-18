import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    
    public static void main(String[] args) throws Exception {
    
        List<String> name = List.of(
            "Anna",
            "Marco",
            "Serena",
            "Andrea"
        );
        List<String> result = getNamesStartingWithA(name);
        System.out.println(result);
    }

    public static List<String> getNamesStartingWithA(List<String> names){
        return names.stream()
        .filter(name -> name.startsWith("A"))
        .map(name -> name.toUpperCase())
        .collect(Collectors.toList()); 
    
        }

}
