package ObjectOrintedAssigments.HumanClassProject.TheCarShop;

import java.util.Scanner;

public class Car {

    String brand;
    String color;
    int modelNumber;

    public Car(String brand, String color, int modelNumber) {
       setBrand(brand);
       setColor(color);
       setModelNumber(modelNumber);
    }

    public void setBrand(String brand) {
        boolean e=true;
        while (e) {
            if (CarLibrary.isBrandValid(brand)) {
                this.brand = brand;
                e = false;
            } else {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Give a VALID car brand: ");
                brand=scanner.nextLine();
            }
        }
    }

    public void setColor(String color) {
        boolean e=true;
        while (e) {
            if (CarLibrary.isColorValid(color)) {
                this.color = color;
                e = false;
            } else {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Give a VALID color: ");
                color=scanner.nextLine();
            }
        }
    }

    public void setModelNumber(int modelNumber) {
        if (modelNumber<=0){
            this.modelNumber = 000001;
        } else {
            this.modelNumber = modelNumber;
        }
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
