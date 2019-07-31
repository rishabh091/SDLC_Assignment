package shoppingCartProblem;

public class Cart {

    private String nameOfProduct;
    private String category;
    private double priceOfProduct;

    Cart(String n,String c,double p){
        nameOfProduct=n;
        category=c;
        priceOfProduct=p;
    }

    public String getNameOfProduct(){
        return nameOfProduct;
    }
    public double getPriceOfProduct(){
        return priceOfProduct;
    }
    public String getCategory(){
        return category;
    }
}
