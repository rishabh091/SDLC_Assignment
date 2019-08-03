package shoppingFilterProblem.FurnitureClasses;

public abstract class Furniture {

    private String name;

    public Furniture(String n){
        name=n;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
