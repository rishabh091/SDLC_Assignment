package shoppingCartProblem;

import java.util.*;

public class Total {

    private double sum;
    private Map<Cart,Integer> Inventory=new HashMap<>();
    private Map<String,Integer> shoppingCart=new HashMap<>();
    private List<String> global=new LinkedList<>();

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

                    global.add(inventoryEntry.getKey().getNameOfProduct());
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

        returnFunction();

    }

    public void returnFunction(){
        boolean state=false;
        Scanner io=new Scanner(System.in);

        System.out.println("Do you want to return / shop ?");
        while (state==false){
            String temp=io.next();
            if(temp.equals("return")){
                state=true;
                System.out.println("Enter name of item : ");
                String input=io.next();

                if(global.contains(input)){
                    if(input.equals("earphones")){
                        System.out.println("Item not returnable");
                    }
                    if(input.equals("jeans") || input.equals("shoes") || input.equals("shirts")){
                        System.out.println("Item can only be returned before 30 days with price tag intact.");
                    }
                    if(input.equals("chocolates")){
                        System.out.println("Can only be returned in 1 day.");
                    }
                }
                else{
                    System.out.println("Product not found.");
                }
            }
            if(temp.equals("shop")){
                state=true;
                Main.displayList(Main.listItem);
                Main.selectionFunction();
            }
            else{
                state=false;
                returnFunction();
            }
        }
    }
}
