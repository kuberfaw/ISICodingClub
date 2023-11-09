package ObjectOrintedAssigments.HumanClassProject.TheCarShop;

public class Car {

    String brand;
    String color;
    String modelNumber;

    public Car(String brand, String color, String modelNumber) {
       setBrand(brand);
       setColor(color);
       setModelNumber(modelNumber);
    }

    public void setBrand(String brand) {
        if(CarLibrary.isBrandValid(brand)) {
            this.brand = brand;
        }
    }

    public void setColor(String color) {
        if(CarLibrary.isColorValid(color)) {
            this.color = color;
        }
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public double getPrice(){
        double price=5.00;
        switch (CarLibrary.capatlizeInput(brand)){
            case "TESLA":
                price+=100;
                break;
            case "HONDA":
                price+=80;
                break;
            case "AUDI":
                price+=110;
                break;
            case "FERRARI":
                price+=180;
                break;
            case "ACURA":
                price+=95;
                break;
            case "FORD":
                price+=85;
                break;
            case "TOYOTA":
                price+=70;
                break;
        }
        return (price+((CarLibrary.capatlizeInput(brand).equals("WHITE")||CarLibrary.capatlizeInput(brand).equals("BLACK"))?0:5));
    }
    public String getInfo(){
        return "Car "+this.modelNumber+" is owned by "+this.brand+", and it is "+this.color+". It costs "+ getPrice();
    }

}
