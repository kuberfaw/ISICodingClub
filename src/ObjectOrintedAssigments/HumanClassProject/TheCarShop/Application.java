package ObjectOrintedAssigments.HumanClassProject.TheCarShop;

import java.util.Scanner;

public class Application {
    public void run(){
        boolean isTru = true;
        Scanner input = new Scanner(System.in);
        String string;
        String brandName;
        String color;
        int modelNumber =0001;
        Car newCar = null;

        while (isTru){
            System.out.println("⊡⊡⊡⊡⊡⊡⊡⊡⊡⊡⊡");
            System.out.println("\n - Buy Car\n - Car Info\n - Exit");
            System.out.print("I want to: ");
            string = input.nextLine();
            if (string.equalsIgnoreCase("BUY CAR")){
                System.out.print("\nWhat is the brand? ");
                brandName = input.nextLine();
                System.out.print("\nAnd what is the color? ");
                color = input.nextLine();
                System.out.print("\nAnd what is the model number? ");
                try {
                    modelNumber = Integer.parseInt(input.nextLine());
                } catch (Exception e){
                    System.out.println(e);
                }
                if (!(modelNumber>0)){
                 modelNumber=000001;
                }
                newCar = new Car(brandName,color,modelNumber);
            } else if (string.equalsIgnoreCase("Car Info")){
                if (newCar!=null){
                    System.out.println(newCar.getInfo());
                } else {
                    System.out.println("No car has been purchased.");
                }
            } else if (string.equalsIgnoreCase("Exit")){
                isTru =false;
            } else {
                System.out.println("Not a valid statement.\n");
            }

        }
    }
}
