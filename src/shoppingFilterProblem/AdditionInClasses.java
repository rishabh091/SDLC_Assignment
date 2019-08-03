package shoppingFilterProblem;

import shoppingFilterProblem.ApparelClasses.Jeans;
import shoppingFilterProblem.ApparelClasses.Shirts;
import shoppingFilterProblem.ApparelClasses.Tshirts;
import shoppingFilterProblem.ElectronicsClasses.Laptops;
import shoppingFilterProblem.ElectronicsClasses.Mobiles;
import shoppingFilterProblem.ElectronicsClasses.TV;
import shoppingFilterProblem.FurnitureClasses.Bed;
import shoppingFilterProblem.FurnitureClasses.Chair;
import shoppingFilterProblem.FurnitureClasses.Table;
import shoppingFilterProblem.GroceryClasses.Apples;
import shoppingFilterProblem.GroceryClasses.Bananas;
import shoppingFilterProblem.GroceryClasses.Carrots;

public class AdditionInClasses {

    public void addApparels(){

        //----------------------------------------Apparels--------------------------------------------------------------
        //----------------------------------------Jeans-----------------------------------------------------------------
        Main.apparelsHashMap.put(new Jeans("washed","32","black","duke"),"jeans");
        Main.apparelsHashMap.put(new Jeans("washed","30","blue","tommy"),"jeans");
        Main.apparelsHashMap.put(new Jeans("denim","32","grey","levis"),"jeans");
        Main.apparelsHashMap.put(new Jeans("denim","34","blue","levis"),"jeans");

        //--------------------------------------Shirts------------------------------------------------------------------
        Main.apparelsHashMap.put(new Shirts("denim","40","red","duke"),"shirts");
        Main.apparelsHashMap.put(new Shirts("formal","38","black","octave"),"shirts");
        Main.apparelsHashMap.put(new Shirts("formal","40","white","ford"),"shirts");
        Main.apparelsHashMap.put(new Shirts("casual","42","green","duke"),"shirts");

        //----------------------------------------T shirts--------------------------------------------------------------
        Main.apparelsHashMap.put(new Tshirts("crew","38","pink","roadster"),"tshirts");
        Main.apparelsHashMap.put(new Tshirts("henley","40","black","spykar"),"tshirts");
        Main.apparelsHashMap.put(new Tshirts("crew","40","white","wrangler"),"tshirts");
        Main.apparelsHashMap.put(new Tshirts("v","42","brown","duke"),"tshirts");
    }

    public void addElectronics(){
        //---------------------------------------Electronics------------------------------------------------------------
        //---------------------------------------Mobiles----------------------------------------------------------------
        Main.electronicsHashMap.put(new Mobiles("j7","black","samsung"),"mobiles");
        Main.electronicsHashMap.put(new Mobiles("j7","white","samsung"),"mobiles");
        Main.electronicsHashMap.put(new Mobiles("mia1","gold","mi"),"mobiles");
        Main.electronicsHashMap.put(new Mobiles("7plus","grey","apple"),"mobiles");

        //-------------------------------------Laptops------------------------------------------------------------------
        Main.electronicsHashMap.put(new Laptops("macbook","white","apple"),"laptops");
        Main.electronicsHashMap.put(new Laptops("macbook","black","apple"),"laptops");
        Main.electronicsHashMap.put(new Laptops("vivobook","silver","asus"),"laptops");
        Main.electronicsHashMap.put(new Laptops("predator","grey","acer"),"laptops");

        //---------------------------------------TV---------------------------------------------------------------------
        Main.electronicsHashMap.put(new TV("mi410","black","mi"),"tv");
        Main.electronicsHashMap.put(new TV("mi310","black","mi"),"tv");
        Main.electronicsHashMap.put(new TV("bravia","grey","sony"),"tv");
        Main.electronicsHashMap.put(new TV("sg410","black","samsung"),"tv");
    }

    public void addFurniture(){
        //--------------------------------------Furniture---------------------------------------------------------------
        //--------------------------------------Bed---------------------------------------------------------------------
        Main.furnitureHashMap.put(new Bed("ikea"),"bed");
        Main.furnitureHashMap.put(new Bed("woodfry"),"bed");
        Main.furnitureHashMap.put(new Bed("godrej"),"bed");
        Main.furnitureHashMap.put(new Bed("pepperfry"),"bed");

        //-----------------------------------------Chair----------------------------------------------------------------
        Main.furnitureHashMap.put(new Chair("ikea"),"chair");
        Main.furnitureHashMap.put(new Chair("godrej"),"chair");
        Main.furnitureHashMap.put(new Chair("woodfry"),"chair");
        Main.furnitureHashMap.put(new Chair("pepperfry"),"chair");

        //-------------------------------------Table--------------------------------------------------------------------
        Main.furnitureHashMap.put(new Table("ikea"),"table");
        Main.furnitureHashMap.put(new Table("godrej"),"table");
        Main.furnitureHashMap.put(new Table("woodfry"),"table");
        Main.furnitureHashMap.put(new Table("pepperfry"),"table");
    }

    public void addGrocery(){
        //------------------------------------Grocery-------------------------------------------------------------------
        //----------------------------------------Apple-----------------------------------------------------------------
        Main.groceryHashMap.put(new Apples("kashmiri","fruits"),"apples");
        Main.groceryHashMap.put(new Apples("imported","fruits"),"apples");

        //---------------------------------------Bananas----------------------------------------------------------------
        Main.groceryHashMap.put(new Bananas("imported","fruits"),"bananas");
        Main.groceryHashMap.put(new Bananas("grown","fruits"),"bananas");

        //-------------------------------------------Carrots------------------------------------------------------------
        Main.groceryHashMap.put(new Carrots("imported","vegetables"),"carrots");
        Main.groceryHashMap.put(new Carrots("organic","vegetables"),"carrots");
    }
}
