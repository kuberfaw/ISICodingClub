package ObjectOrintedAssigments.HumanClassProject.TheCarShop;

public class CarLibrary {

    public static Boolean isBrandValid(String brandName){
        brandName = CarLibrary.capatlizeInput(brandName);
        String[] validBrands = {"TESLA", "HONDA", "AUDI", "FERRARI", "ACURA","FORD","TOYOTA"};
            for (String e:validBrands) {
            if (e.equals(brandName)){
                return true;
            }
        }

            return false;
    }

    public static String capatlizeInput(String input){
        return input.toUpperCase();
    }

    public static Boolean isColorValid(String colorName){
        colorName = CarLibrary.capatlizeInput(colorName);
        String[] validColors = {"BLUE","RED","BLACK","WHITE","GREEN"};
        for (String e:validColors) {
            if (e.equals(colorName)){
                return true;
            }
        }
        return false;
    }
}
