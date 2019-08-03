package shoppingFilterProblem;

import shoppingFilterProblem.ApparelClasses.Apparels;
import shoppingFilterProblem.ElectronicsClasses.Electronics;
import shoppingFilterProblem.FurnitureClasses.Furniture;
import shoppingFilterProblem.GroceryClasses.Grocery;

import java.util.Map;
import java.util.Scanner;

public class FurtherFilters {

    Scanner io=new Scanner(System.in);

    public void apparelFilters(String search,String input){

        if(input.equals("color")){
            System.out.println("Enter color : ");
            String color=io.next().toLowerCase();

            boolean condition=false;
            int count=0;
            ContractClass.apparelsIteratorReset();

            while (ContractClass.apparelIterator.hasNext()){
                Map.Entry<Apparels,String> mapEntry=ContractClass.apparelIterator.next();

                if(mapEntry.getValue().equals(search)){
                    if(mapEntry.getKey().getApparelColor().equals(color)){
                        condition=true;
                        count++;

                        System.out.println("Name : "+mapEntry.getKey().getApparelName()+"\t"+
                                "Size : "+mapEntry.getKey().getApparelSize()+"\t"+
                                "Brand : "+mapEntry.getKey().getApparelBrand());
                    }
                }
            }

            if(condition==true){
                System.out.println("Total products : "+count);
            }
            else{
                System.out.println("Items not found");
            }
        }
        if(input.equals("size")){
            System.out.println("Enter size : ");
            String size=io.next().toLowerCase();

            boolean condition=false;
            int count=0;
            ContractClass.apparelsIteratorReset();

            while (ContractClass.apparelIterator.hasNext()){
                Map.Entry<Apparels,String> mapEntry=ContractClass.apparelIterator.next();

                if(mapEntry.getValue().equals(search)){
                    if(mapEntry.getKey().getApparelSize().equals(size)){
                        condition=true;
                        count++;

                        System.out.println("Name : "+mapEntry.getKey().getApparelName()+"\t"+
                                "Color : "+mapEntry.getKey().getApparelColor()+"\t"+
                                "Brand : "+mapEntry.getKey().getApparelBrand());
                    }
                }
            }

            if(condition==true){
                System.out.println("Total products : "+count);
            }
            else{
                System.out.println("Items not found");
            }
        }
        if(input.equals("brand")){
            System.out.println("Enter brand : ");
            String brand=io.next().toLowerCase();

            boolean condition=true;
            int count=0;
            ContractClass.apparelsIteratorReset();

            while (ContractClass.apparelIterator.hasNext()){
                Map.Entry<Apparels,String> mapEntry=ContractClass.apparelIterator.next();

                if(mapEntry.getValue().equals(search)){
                    if(mapEntry.getKey().getApparelBrand().equals(brand)){
                        condition=true;
                        count++;

                        System.out.println("Name : "+mapEntry.getKey().getApparelName()+"\t"+
                                "Size : "+mapEntry.getKey().getApparelSize()+"\t"+
                                "Color : "+mapEntry.getKey().getApparelColor());
                    }
                }
            }

            if(condition==true){
                System.out.println("Total products : "+count);
            }
            else{
                System.out.println("Items not found");
            }
        }
        if(!input.equals("color") && !input.equals("brand") && !input.equals("size")){
            System.out.println("Invalid filters");
        }
    }

    public void electronicsFilters(String search,String input){
        if(input.equals("color")){
            System.out.println("Enter color : ");
            String color=io.next().toLowerCase();

            boolean condition=false;
            int count=0;
            ContractClass.electronicsIteratorReset();

            while (ContractClass.electronicsIterator.hasNext()){
                Map.Entry<Electronics,String> mapEntry=ContractClass.electronicsIterator.next();

                if(mapEntry.getValue().equals(search)){
                    if(mapEntry.getKey().getElectronicsColor().equals(color)){
                        condition=true;
                        count++;

                        System.out.println("Name : "+mapEntry.getKey().getElectronicName()+"\t"+
                                "Brand : "+mapEntry.getKey().getElectronicsBrand());
                    }
                }
            }
            if(condition==true){
                System.out.println("Total Products : "+count);
            }
            else{
                System.out.println("Item not found");
            }
        }

        if(input.equals("brand")){
            System.out.println("Enter brand : ");
            String brand=io.next().toLowerCase();

            boolean condition=false;
            int count=0;
            ContractClass.electronicsIteratorReset();

            while (ContractClass.electronicsIterator.hasNext()){
                Map.Entry<Electronics,String> mapEntry=ContractClass.electronicsIterator.next();

                if(mapEntry.getValue().equals(search)){
                    if(mapEntry.getKey().getElectronicsBrand().equals(brand)){
                        condition=true;
                        count++;

                        System.out.println("Name : "+mapEntry.getKey().getElectronicName()+"\t"+
                                "Color : "+mapEntry.getKey().getElectronicsColor());
                    }
                }
            }

            if(condition==true){
                System.out.println("Total Products : "+count);
            }
            else{
                System.out.println("Item not found");
            }
        }
        if(!input.equals("color") && !input.equals("brand")){
            System.out.println("Invalid Filters");
        }
    }

    public void furnitureFilters(String search,String input){
        if(input.equals("name")){
            System.out.println("Enter name : ");
            String name=io.next().toLowerCase();

            boolean condition=false;
            int count=0;
            ContractClass.furnitureIteratorReset();

            while (ContractClass.furnitureIterator.hasNext()){
                Map.Entry<Furniture,String> mapEntry=ContractClass.furnitureIterator.next();

                if(mapEntry.getValue().equals(search)){
                    if(mapEntry.getKey().getName().equals(name)){
                        condition=true;
                        count++;

                        System.out.println("Name : "+mapEntry.getKey().getName());
                    }
                }
            }

            if(condition==true){
                System.out.println("Total Products : "+count);
            }
            else{
                System.out.println("Item not found");
            }
        }
        if(!input.equals("name")){
            System.out.println("Invalid Filters");
        }
    }

    public void groceryFilters(String search,String input){
        if(input.equals("name")){
            System.out.println("Enter name : ");
            String name=io.next().toLowerCase();

            boolean condition=false;
            int count=0;
            ContractClass.groceryIteratorReset();

            while (ContractClass.groceryIterator.hasNext()){
                Map.Entry<Grocery,String> mapEntry=ContractClass.groceryIterator.next();

                if(mapEntry.getValue().equals(search)){
                    if(mapEntry.getKey().getName().equals(name)){
                        condition=true;
                        count++;

                        System.out.println("Value : "+mapEntry.getValue()+"\t"+
                                "Type : "+mapEntry.getKey().getType());
                    }
                }
            }

            if(condition==true){
                System.out.println("Total Products : "+count);
            }
            else{
                System.out.println("Items not found");
            }
        }

        if(input.equals("type")){
            System.out.println("Enter type : ");
            String type=io.next().toLowerCase();

            boolean condition=false;
            int count=0;
            ContractClass.groceryIteratorReset();

            while (ContractClass.groceryIterator.hasNext()){
                Map.Entry<Grocery,String> mapEntry=ContractClass.groceryIterator.next();

                if(mapEntry.getValue().equals(search)){
                    if(mapEntry.getKey().getType().equals(type)){
                        condition=true;
                        count++;

                        System.out.println("Value : "+mapEntry.getValue()+"\t"+
                                "Name : "+mapEntry.getKey().getName());
                    }
                }
            }

            if(condition==true){
                System.out.println("Total Products : "+count);
            }
            else{
                System.out.println("Item not found");
            }
        }
        if(!input.equals("name") && !input.equals("type")){
            System.out.println("Invalid filters");
        }
    }
}
