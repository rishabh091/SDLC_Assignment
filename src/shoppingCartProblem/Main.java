package shoppingCartProblem;

import java.util.*;

public class Main {

    public static Map<Cart,Integer> listItem;
    public static Map<String,Integer> cartList;

    public static void main(String[] args) {

        listItem=new HashMap<>();
        cartList=new HashMap<>();

        listItem.put(new Cart("chocolates","organic",100),10);
        listItem.put(new Cart("earphones","luxury",2000),5);
        listItem.put(new Cart("shirts","other",1000),20);
        listItem.put(new Cart("jeans","other",2000),30);
        listItem.put(new Cart("shoes","other",1500),7);

        System.out.println("Items in Inventory : ");
        displayList(listItem);
        selectionFunction();
    }

    static void selectionFunction(){
        //selection
        int selection=0;
        while(selection==0){
            selection=selectionOfProducts();
        }

        if(selection==1){
            addAProduct();
        }
        if(selection==2){
            removeProduct();
        }
        if(selection==3){
            Total total=new Total();
            total.computeTotal();
        }
        if(selection==4){
            editQuantity();
        }
    }

    static void editQuantity(){

        Scanner io=new Scanner(System.in);

        System.out.println("Enter name of product : ");
        String tempName=io.next();
        System.out.println("Enter new Quantity : ");
        int quantity=io.nextInt();

        if(cartList.containsKey(tempName)){
            cartList.put(tempName,quantity);
            displayCartList(cartList);
            selectionFunction();
        }
        else{
            System.out.println("Product not found.");
            selectionFunction();
        }
    }

    static void removeProduct(){

        String name;
        Scanner io=new Scanner(System.in);

        System.out.println("Enter name of product you want to remove : ");
        name=io.next().toLowerCase();

        boolean temp=false;
        //sometimes giving java.util.ConcurrentModificationException
        if(cartList.containsKey(name)) {
            temp = true;
            cartList.remove(name);
        }

        if(temp==true){
            System.out.println("Item successfully Removed");
            displayCartList(cartList);
            selectionFunction();
        }
        if(temp==false){
            System.out.println("Enter valid name to remove : ");
            selectionFunction();
        }
    }

    static void addAProduct(){
        String input;
        int quantity;
        Scanner io=new Scanner(System.in);

        System.out.println("Enter name of product you wanna add : ");
        input=io.nextLine();

        Set<Map.Entry<Cart,Integer>> mapEntry=listItem.entrySet();

        Iterator<Map.Entry<Cart,Integer>> iterator=mapEntry.iterator();

        boolean presentCase=false;
        while(iterator.hasNext()){
            Map.Entry<Cart,Integer> mapEntrySet=iterator.next();

            if(mapEntrySet.getKey().getNameOfProduct().equals(input)){
                String name=input;
                presentCase=true;

                System.out.println("Quantity : ");
                quantity=io.nextInt();

                if(quantity>0 && quantity<=mapEntrySet.getValue()){
                    cartList.put(name,quantity);

                    if(mapEntrySet.getValue()>0){
                        int temp=mapEntrySet.getValue()-quantity;
                        mapEntrySet.setValue(temp);
                    }
                }
                else {
                    System.out.println("Enter valid Quantity retry from main menu : ");
                    selectionFunction();
                }
            }
        }
        if(presentCase==false){
            System.out.println("Enter valid name retry from main menu : ");
            selectionFunction();
        }

        System.out.println("Your Cart : ");
        displayCartList(cartList);

        System.out.println("Inventory : ");
        displayList(listItem);

        System.out.println("Do you wanna add more items : (y/n)");
        char ch=io.next().toLowerCase().charAt(0);
        if(ch=='y'){
            addAProduct();
        }
        else{
            selectionFunction();
        }
    }

    static void displayCartList(Map<String,Integer> cart){
        Set<Map.Entry<String,Integer>> set=cart.entrySet();

        Iterator<Map.Entry<String,Integer>> iterator=set.iterator();

        while(iterator.hasNext()){
            Map.Entry<String,Integer> entrySet=iterator.next();
            System.out.println("Name : "+entrySet.getKey()+"\t"+"Quantity : "+entrySet.getValue());
        }
    }

    static void displayList(Map<Cart,Integer> map){
        Set<Map.Entry<Cart, Integer>> mapEntry=map.entrySet();

        Iterator<Map.Entry<Cart, Integer>> iterator=mapEntry.iterator();

        while (iterator.hasNext()){
            Map.Entry<Cart, Integer> map2=iterator.next();
            System.out.println("Name : "+map2.getKey().getNameOfProduct()+"\t"+"Price : "+map2.getKey().getPriceOfProduct()+"\t"+"Quantity : "+
                    map2.getValue());
        }
    }

    static int selectionOfProducts(){
        String input;
        Scanner io=new Scanner(System.in);

        System.out.println("Add, remove, change or total : ");
        input=io.next().toLowerCase();

        if(input.equals("add")){
            return 1;
        }
        if(input.equals("remove")){
            return 2;
        }
        if(input.equals("total")){
            return 3;
        }
        if(input.equals("change")){
            return 4;
        }
        else {
            return 0;
        }
    }
}
