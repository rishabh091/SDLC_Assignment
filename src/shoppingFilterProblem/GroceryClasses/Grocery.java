package shoppingFilterProblem.GroceryClasses;

public abstract class Grocery {

    private String name;
    private String type;

    public Grocery(String n,String t){
        name=n;
        type=t;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
