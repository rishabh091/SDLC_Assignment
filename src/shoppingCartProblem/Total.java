package shoppingCartProblem;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Total {

    private double sum;
    private Map<Cart,Integer> Inventory=new HashMap<>();
    private Map<String,Integer> shoppingCart=new HashMap<>();

    Total(){
        sum=0;
        Inventory.putAll(Main.listItem);
        shoppingCart.putAll(Main.cartList);
    }

    public void computeTotal(){
        double cgst=0,sgst=0;

        Set<Map.Entry<Cart,Integer>> inventorySet=Inventory.entrySet();
        Iterator<Map.Entry<Cart,Integer>> inventoryIterator=inventorySet.iterator();

        Set<Map.Entry<String,Integer>> shoppingCartSet=shoppingCart.entrySet();
        Iterator<Map.Entry<String,Integer>> shoppingCartIterator=shoppingCartSet.iterator();

        while(shoppingCartIterator.hasNext()){
            double price=0;
            int quantity=0;
            String category="";

            Map.Entry<String,Integer> shoppingEntry=shoppingCartIterator.next();

            while(inventoryIterator.hasNext()){
                sum=0;
                Map.Entry<Cart,Integer> inventoryEntry=inventoryIterator.next();

                if(inventoryEntry.getKey().getNameOfProduct().equals(shoppingEntry.getKey())) {
                    price = inventoryEntry.getKey().getPriceOfProduct();
                    quantity = shoppingEntry.getValue();
                    category=inventoryEntry.getKey().getCategory();
                }

                sum=sum+(quantity*price);

                if(category=="organic"){
                    cgst=0.05*sum;
                    sgst=0.05*sum;
                }
                if(category=="other"){
                    cgst=0.1*sum;
                    sgst=0.1*sum;
                }
                if(category=="luxury"){
                    cgst=0.15*sum;
                    sgst=0.15*sum;
                }

                sum=sum+cgst+sgst;
            }
        }

        System.out.println("CGST : "+cgst);
        System.out.println("SGST : "+sgst);
        System.out.println("Total is : "+sum);
        Main.selectionFunction();
    }
}
