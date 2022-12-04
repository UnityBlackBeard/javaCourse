package Lesson_12;

public class main1 {
    public static void main(String[] args) {
Fridge fridge =new Fridge();

        fridge.putproducts("яблоко", 2);
        fridge.putproducts("груша", 3);
        fridge.putproducts("банан", 3);
        fridge.putproducts("апельсин", 2);
        fridge.putproducts("киви", 4);
        fridge.putproducts("груша", 10);

        fridge.getProduct("яблоко", 5);

        fridge.getProduct("молоко",1);
        fridge.getProduct("груша", 5);
        fridge.getProduct("апельсин", 2);



    }
}
