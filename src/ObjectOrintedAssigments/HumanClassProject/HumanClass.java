package ObjectOrintedAssigments.HumanClassProject;

public class HumanClass {
    public static void main(String[] args) {
        var person1 = new HumanMain("English");
        System.out.println("Person 1 attributes are:");
        person1.getAttributes();
        System.out.println("Person 2 attributes are:");
        var person2 = new HumanMain("Malayalam",5.7,103.4);
        System.out.print("Language: " + person2.getLanguage() + ", Height: " + person2.getHeight() + ", Weight: " + person2.getWeight());
    }
}
