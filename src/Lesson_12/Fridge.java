package Lesson_12;

import java.util.HashMap;

public class Fridge {
    private HashMap<String, Integer>products=new HashMap<>();

    //methods
    public void putproducts(String product, Integer value){
        if(products.containsKey(product)){
           products.put(product,products.get(product)+value);
        }else {
            products.put(product,value);

        }

    }

    public void getProduct(String product, Integer value){
        if(!products.containsKey(product)){
            System.out.println("Такого продукта нет "+ products.get(product));
            return;
        }
        //если продукта не хватает
        if(products.get(product)<value){
            System.out.println("не хватает" + (value- products.get(product))+" , вы взяли "+ product);
            return;
        }
        if (products.get(product)>value){
            System.out.println("нОсталось еще "+(products.get(product)-value)+ " "+ product);
            return;
        }
        //если продукта ровно столько сколько нужно
        if (products.get(product)==value){
            System.out.println(" " +(products.get(product)));
        }

    }

}
