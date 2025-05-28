package pl.pp;

public class myEighthApp {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 30);
        person.sayHello();

        Circle circle = new Circle(5.0);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());

        // Test setRadius with a negative value
        circle.setRadius(-10.0);  // should not change the radius
        System.out.println("Updated Radius: " + circle.getRadius());
        System.out.println("Updated Area: " + circle.getArea());
    }
}
