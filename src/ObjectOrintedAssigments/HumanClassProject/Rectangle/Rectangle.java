package ObjectOrintedAssigments.HumanClassProject.Rectangle;

public class Rectangle {
    private double height;
    private double length;

    public Rectangle(double height, double length) {
        if (height>0) {
            this.height = height;
        }
        if (length > 0) {
            this.length = length;
        }
    }
    public void getArea(){
        System.out.println("The area is: "+(height*length));
    }
    public void getPerimeter(){
        System.out.println("The perimeter is: " + (2*(height+length)));
    }
}
