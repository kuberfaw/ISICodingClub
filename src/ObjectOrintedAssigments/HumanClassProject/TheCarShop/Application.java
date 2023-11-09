package ObjectOrintedAssigments.HumanClassProject.TheCarShop;

import java.util.Scanner;

public class Application {
    public void run(){
        boolean isTru = true;
        Scanner input = new Scanner(System.in);
        String string;
        String brandName;
        String color;
        String modelNumber;
        Car newCar = null;

        while (isTru){
            System.out.println("⊡⊡⊡⊡⊡⊡⊡⊡⊡⊡⊡");
            System.out.println("\n - Buy Car\n - Car Info\n - Exit");
            System.out.print("I want to: ");
            string = input.nextLine();
            if (string.equals("Buy Car")){
                System.out.print("\nWhat is the brand? ");
                brandName = input.nextLine();
                System.out.print("\nAnd what is the color? ");
                color = input.nextLine();
                System.out.print("\nAnd what is the model number? ");
                modelNumber = input.nextLine();
                newCar = new Car(brandName,color,modelNumber);
            } else if (string.equals("Car Info")){
                if (newCar!=null){
                    System.out.println(newCar.getInfo());
                } else {
                    System.out.println("No car has been purchased.");
                }
            } else if (string.equals("Exit")){
                isTru =false;
            } else {
                System.out.println("Not a valid statement.\n");
            }

        }
    }
}
