package shoppingFilterProblem.ElectronicsClasses;

public abstract class Electronics {

    private String electronicName;
    private String electronicsColor;
    private String electronicsBrand;

    public Electronics(String n, String c, String b){
        electronicName=n;
        electronicsColor=c;
        electronicsBrand=b;
    }

    public String getElectronicName() {
        return electronicName;
    }

    public void setElectronicName(String electronicName) {
        this.electronicName = electronicName;
    }

    public String getElectronicsColor() {
        return electronicsColor;
    }

    public void setElectronicsColor(String electronicsColor) {
        this.electronicsColor = electronicsColor;
    }

    public String getElectronicsBrand() {
        return electronicsBrand;
    }

    public void setElectronicsBrand(String electronicsBrand) {
        this.electronicsBrand = electronicsBrand;
    }
}
