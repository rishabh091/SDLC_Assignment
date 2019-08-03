package shoppingFilterProblem.ApparelClasses;

abstract public class Apparels {

    private String apparelName;
    private String apparelSize;
    private String apparelColor;
    private String apparelBrand;

    public Apparels(String an,String as,String ac,String ab){
        apparelName=an;
        apparelSize=as;
        apparelColor=ac;
        apparelBrand=ab;
    }

    public void setApparelName(String apparelName) {
        this.apparelName = apparelName;
    }
    public void setApparelSize(String apparelSize) {
        this.apparelSize = apparelSize;
    }
    public void setApparelColor(String apparelColor) {
        this.apparelColor = apparelColor;
    }
    public void setApparelBrand(String apparelBrand) {
        this.apparelBrand = apparelBrand;
    }

    public String getApparelName(){
        return apparelName;
    }
    public String getApparelSize(){
        return apparelSize;
    }
    public String getApparelColor(){
        return apparelColor;
    }
    public String getApparelBrand(){
        return apparelBrand;
    }
}
