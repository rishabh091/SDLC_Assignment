package shoppingCartProblem;

public class Cart {

    private String nameOfProduct;
    private double priceOfProduct;

    Cart(String n,double p){
        nameOfProduct=n;
        priceOfProduct=p;
    }
    Cart(){}

    public String getNameOfProduct(){
        return nameOfProduct;
    }
    public double getPriceOfProduct(){
        return priceOfProduct;
    }
}
