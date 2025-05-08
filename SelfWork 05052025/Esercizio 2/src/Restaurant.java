public class Restaurant {

    private String name;
    private Dish[] dishes;
    private Drink[] drinks;
    


    public Restaurant(String name, Dish[] dishes, Drink[] drinks) {
        this.name = name;
        this.dishes = dishes;
        this.drinks = drinks;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void printingMenu(){
        System.out.println("Menù del Ristorante "+ name +" :");
        System.out.println("---------");
        for (int i =0; i< dishes.length; i++){
            Dish dish = dishes[i];
            System.out.println(dish.getName() + " -- Prezzo: " +dish.getPrice()+ " Euro.");
        }
        for (int i = 0; i < drinks.length; i++){
            Drink drink= drinks[i];
            System.out.println(drink.getName() +" -- Prezzo: " +drink.getPrice()+ " Euro.");
        }
    }



    

}
