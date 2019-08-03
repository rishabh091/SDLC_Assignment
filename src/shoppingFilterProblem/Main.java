package shoppingFilterProblem;

import shoppingFilterProblem.ApparelClasses.Apparels;
import shoppingFilterProblem.ElectronicsClasses.Electronics;
import shoppingFilterProblem.FurnitureClasses.Furniture;
import shoppingFilterProblem.GroceryClasses.Grocery;

import java.util.*;

public class Main {

    public static HashMap<Apparels,String> apparelsHashMap=new HashMap<>();
    public static HashMap<Electronics, String> electronicsHashMap=new HashMap<>();
    public static HashMap<Furniture, String> furnitureHashMap=new HashMap<>();
    public static HashMap<Grocery, String> groceryHashMap=new HashMap<>();

    public static void main(String[] args) {
        //addition in lists
        AdditionInClasses additionInClasses=new AdditionInClasses();
        additionInClasses.addApparels();
        additionInClasses.addElectronics();
        additionInClasses.addFurniture();
        additionInClasses.addGrocery();

        //display every product
        DisplayOfClasses displayOfClasses=new DisplayOfClasses();

        System.out.println("Apparels : ");
        displayOfClasses.displayApparel();

        System.out.println("Electronics : ");
        displayOfClasses.displayElectronics();

        System.out.println("Furniture : ");
        displayOfClasses.displayFurniture();

        System.out.println("Grocery : ");
        displayOfClasses.displayGrocery();

        initialSearch(displayOfClasses);
    }

    private static void initialSearch(DisplayOfClasses displayOfClasses){
        Scanner io=new Scanner(System.in);
        String search;

        System.out.println("Search : ");
        search=io.next().toLowerCase();

        switch (search){
            case "apparels" : {
                displayOfClasses.displayApparel();
                subCategory(displayOfClasses,"apparels");
                break;
            }
            case "electronics" : {
                displayOfClasses.displayElectronics();
                subCategory(displayOfClasses,"electronics");
                break;
            }
            case "furniture" : {
                displayOfClasses.displayFurniture();
                subCategory(displayOfClasses,"furniture");
                break;
            }
            case "grocery" : {
                displayOfClasses.displayGrocery();
                subCategory(displayOfClasses,"grocery");
                break;
            }
            default:{
                System.out.println("Enter valid search.");
                initialSearch(displayOfClasses);
                break;
            }
        }
    }

    private static void subCategory(DisplayOfClasses displayOfClasses,String category){
        Scanner io=new Scanner(System.in);
        String search;

        ContractClass contractClass=new ContractClass();
        contractClass.initialisation();

        FurtherFilters furtherFilters=new FurtherFilters();

        //-------------------------------------------Apparels-----------------------------------------------------------
        if(category.equals("apparels")){
            System.out.println("Search in Apparels : ");
            search=io.next().toLowerCase();

            boolean condition=false;
            int count=0;

            while (ContractClass.apparelIterator.hasNext()){
                Map.Entry<Apparels,String> mapEntry=ContractClass.apparelIterator.next();

                if(mapEntry.getValue().equals(search)){
                    condition=true;
                    count++;

                    System.out.println("Name : "+mapEntry.getKey().getApparelName()+"\t"+
                            "Color : "+mapEntry.getKey().getApparelColor()+"\t"+
                            "Size : "+mapEntry.getKey().getApparelSize()+"\t"+
                            "Brand : "+mapEntry.getKey().getApparelBrand());
                }
            }

            if(condition==true){
                System.out.println("Total Products : "+count);

                String input;
                System.out.println("ApparelFilters : color/brand/size : ");
                input=io.next().toLowerCase();

                furtherFilters.apparelFilters(search,input);
                initialSearch(displayOfClasses);
            }
            if(condition==false){
                System.out.println("Item not found");
                initialSearch(displayOfClasses);
            }
        }

        //------------------------------------------Electronics---------------------------------------------------------
        if(category.equals("electronics")){
            System.out.println("Search in Electronics : ");
            search=io.next().toLowerCase();

            boolean condition=false;
            int count=0;

            while (ContractClass.electronicsIterator.hasNext()){
                Map.Entry<Electronics,String> mapEntry=ContractClass.electronicsIterator.next();

                if(mapEntry.getValue().equals(search)){
                    condition=true;
                    count++;

                    System.out.println("Name : "+mapEntry.getKey().getElectronicName()+"\t"+
                            "Color : "+mapEntry.getKey().getElectronicsColor()+"\t"+
                            "Brand : "+mapEntry.getKey().getElectronicsBrand());
                }
            }

            if(condition==true){
                System.out.println("Total Products : "+count);

                String input;
                System.out.println("Electronics Filters : color/brand");
                input=io.next().toLowerCase();

                furtherFilters.electronicsFilters(search,input);
                initialSearch(displayOfClasses);
            }
            if(condition==false){
                System.out.println("Items not found.");
                initialSearch(displayOfClasses);
            }
        }

        //--------------------------------------------Furniture---------------------------------------------------------
        if(category.equals("furniture")){
            System.out.println("Search in Furniture : ");
            search=io.next().toLowerCase();

            boolean condition=false;
            int count=0;

            while (ContractClass.furnitureIterator.hasNext()){
                Map.Entry<Furniture,String> mapEntry=ContractClass.furnitureIterator.next();

                if(mapEntry.getValue().equals(search)){
                    condition=true;
                    count++;

                    System.out.println("Name : "+mapEntry.getKey().getName());
                }
            }

            if(condition==true){
                System.out.println("Total Products : "+count);

                System.out.println("Furniture Filter : name : ");
                String input=io.next().toLowerCase();
                furtherFilters.furnitureFilters(search,input);

                initialSearch(displayOfClasses);
            }
            if(condition==false){
                System.out.println("Item not found");
                initialSearch(displayOfClasses);
            }
        }

        //--------------------------------------------Grocery-----------------------------------------------------------
        if(category.equals("grocery")){
            System.out.println("Search in Grocery : ");
            search=io.next().toLowerCase();

            boolean condition=false;
            int count=0;

            while (ContractClass.groceryIterator.hasNext()){
                Map.Entry<Grocery,String> mapEntry=ContractClass.groceryIterator.next();

                if(mapEntry.getValue().equals(search)){
                    condition=true;
                    count++;

                    System.out.println("Name : "+mapEntry.getKey().getName()+"\t"+
                            "Type : "+mapEntry.getKey().getType());
                }
            }

            if(condition==true){
                System.out.println("Total Products : "+count);

                System.out.println("Grocery Filters : name/type : ");
                String input=io.next().toLowerCase();
                furtherFilters.groceryFilters(search,input);

                initialSearch(displayOfClasses);
            }
            if(condition==false){
                System.out.println("Item not found");
                initialSearch(displayOfClasses);
            }
        }
        else {
            System.out.println("Item not found.");
            initialSearch(displayOfClasses);
        }
    }
}