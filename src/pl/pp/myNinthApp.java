package pl.pp;

public class myNinthApp {
    public static void main(String[] args) {
        Person p = new Person("Alice", 30);
        p.introduce();

        Circle c = new Circle(5);
        System.out.println("Circle area: " + c.calculateArea());
    }
}

