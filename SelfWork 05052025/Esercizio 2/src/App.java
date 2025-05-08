public class App {
    public static void main(String[] args) throws Exception {
         
        Dish[] dishes = {
         new Dish("Carbonara", 12, "Uovo", "Guanciale", "Pecorino Romano"),
         new Dish("Gricia", 10, "Pecorino Romano", "Pepe", "Guanciale"),
         new Dish("Cacio e Pepe", 8, "Pecorino Romano", "Pepe", "PannAHHHHAHHAHAHAHHAH Stai Scherzando Vero? VERO?")
        };

        Drink[] drinks = {
            new Drink("Caipiroska", 8),
            new Drink("Angelo Azzurro", 8),
            new Drink("Vino Chianti", 13)
        };
    
    Restaurant menu = new Restaurant("Al Vicolo Stretto", dishes, drinks);
    menu.printingMenu();

    for (int i = 0; i < dishes.length; i++){
        Dish dish= dishes[i];
        dish.describe();
        }
    }
}