package shoppingCartProblem;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Tax {

    private static double sum=0;
    private Map<Cart,Integer> Inventory=new HashMap<>();
    private Map<String,Integer> shoppingCart=new HashMap<>();

    Tax(){
        Inventory.putAll(Main.listItem);
        shoppingCart.putAll(Main.cartList);
    }

    public void computeTotal(){
        Set<Map.Entry<Cart,Integer>> inventorySet=Inventory.entrySet();
        Iterator<Map.Entry<Cart,Integer>> inventoryIterator=inventorySet.iterator();

        Set<Map.Entry<String,Integer>> shoppingCartSet=shoppingCart.entrySet();
        Iterator<Map.Entry<String,Integer>> shoppingCartIterator=shoppingCartSet.iterator();

        while(shoppingCartIterator.hasNext()){
            double price=0;
            while(inventoryIterator.hasNext()){
                Map.Entry<Cart,Integer> inventoryEntry=inventoryIterator.next();

                if(inventoryEntry.getKey().getNameOfProduct().equals(shoppingCartIterator.next().getKey())){
                    price=inventoryEntry.getKey().getPriceOfProduct();
                }

                sum=sum+price;
            }
        }

        System.out.println("Total is : "+sum);
    }
}
