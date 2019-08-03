package shoppingFilterProblem;

import shoppingFilterProblem.ApparelClasses.Apparels;
import shoppingFilterProblem.ElectronicsClasses.Electronics;
import shoppingFilterProblem.FurnitureClasses.Furniture;
import shoppingFilterProblem.GroceryClasses.Grocery;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ContractClass {

    public static Set<Map.Entry<Apparels,String>> apparelSet;
    public static Iterator<Map.Entry<Apparels,String>> apparelIterator;

    public static Set<Map.Entry<Electronics,String>> electronicsSet;
    public static Iterator<Map.Entry<Electronics,String>> electronicsIterator;

    public static Set<Map.Entry<Furniture,String>> furnitureSet;
    public static Iterator<Map.Entry<Furniture,String>> furnitureIterator;

    public static Set<Map.Entry<Grocery,String>> grocerySet;
    public static Iterator<Map.Entry<Grocery,String>> groceryIterator;

    public void initialisation(){
        apparelSet=Main.apparelsHashMap.entrySet();
        apparelIterator=apparelSet.iterator();

        electronicsSet=Main.electronicsHashMap.entrySet();
        electronicsIterator=electronicsSet.iterator();

        furnitureSet=Main.furnitureHashMap.entrySet();
        furnitureIterator=furnitureSet.iterator();

        grocerySet=Main.groceryHashMap.entrySet();
        groceryIterator=grocerySet.iterator();
    }

    public static void apparelsIteratorReset(){
        apparelIterator=apparelSet.iterator();
    }
    public static void electronicsIteratorReset(){
        electronicsIterator=electronicsSet.iterator();
    }
    public static void furnitureIteratorReset(){
        furnitureIterator=furnitureSet.iterator();
    }
    public static void groceryIteratorReset(){
        groceryIterator=grocerySet.iterator();
    }
}
