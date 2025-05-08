public class Dish implements Describe{

    private String name;
    private int price;
    private String ingridient1;
    private String ingridient2;
    private String ingridient3;
    
    public Dish(String name, int price, String ingridient1, String ingridient2, String ingridient3) {
        this.name = name;
        this.price = price;
        this.ingridient1 = ingridient1;
        this.ingridient2 = ingridient2;
        this.ingridient3 = ingridient3;
    }
    
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void describe() {
        System.out.println("-------///-----");
        System.out.println("I 3 ingredienti Principali della "+ name +" sono: "+ ingridient1 + " , " + ingridient2 + ", " + ingridient3);        
    }
}

