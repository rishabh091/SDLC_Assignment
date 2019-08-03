package shoppingFilterProblem;

import shoppingFilterProblem.ApparelClasses.Apparels;
import shoppingFilterProblem.ElectronicsClasses.Electronics;
import shoppingFilterProblem.FurnitureClasses.Furniture;
import shoppingFilterProblem.GroceryClasses.Grocery;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DisplayOfClasses {

    public void displayApparel(){
        Set<Map.Entry<Apparels,String>> set=Main.apparelsHashMap.entrySet();
        Iterator<Map.Entry<Apparels,String>> iterator=set.iterator();

        while (iterator.hasNext()){
            Map.Entry<Apparels,String> tempMapEntry=iterator.next();

            System.out.println("Type : "+tempMapEntry.getValue()+
                    "\t"+"Name : "+tempMapEntry.getKey().getApparelName()+
                    "\t"+ "Size : "+tempMapEntry.getKey().getApparelSize()+
                    "\t"+"Color : "+tempMapEntry.getKey().getApparelColor()+
                    "\t"+"Brand : "+tempMapEntry.getKey().getApparelBrand());
        }
        System.out.println();
        System.out.println();
    }

    public void displayElectronics(){
        Set<Map.Entry<Electronics,String>> set=Main.electronicsHashMap.entrySet();
        Iterator<Map.Entry<Electronics,String>> iterator=set.iterator();

        while (iterator.hasNext()){
            Map.Entry<Electronics,String> tempMapEntry=iterator.next();

            System.out.println("Type : "+tempMapEntry.getValue()+
                    "\t"+"Name : "+tempMapEntry.getKey().getElectronicName()+
                    "\t"+"Color : "+tempMapEntry.getKey().getElectronicsColor()+
                    "\t"+"Brand : "+tempMapEntry.getKey().getElectronicsBrand());
        }
        System.out.println();
        System.out.println();
    }

    public void displayFurniture(){
        Set<Map.Entry<Furniture,String>> set=Main.furnitureHashMap.entrySet();
        Iterator<Map.Entry<Furniture,String>> iterator=set.iterator();

        while (iterator.hasNext()){
            Map.Entry<Furniture,String> tempMapEntry=iterator.next();

            System.out.println("Type : "+tempMapEntry.getValue()+
                    "\t"+"Name : "+tempMapEntry.getKey().getName());
        }
        System.out.println();
        System.out.println();
    }

    public void displayGrocery(){
        Set<Map.Entry<Grocery,String>> set=Main.groceryHashMap.entrySet();
        Iterator<Map.Entry<Grocery,String>> iterator=set.iterator();

        while (iterator.hasNext()){
            Map.Entry<Grocery,String> tempMapEntry=iterator.next();

            System.out.println("Genre : "+tempMapEntry.getValue()+
                    "\t"+"Name : "+tempMapEntry.getKey().getName()+
                    "\t"+"Type : "+tempMapEntry.getKey().getType());
        }
        System.out.println();
        System.out.println();
    }
}
