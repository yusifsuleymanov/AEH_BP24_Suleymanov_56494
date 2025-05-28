package pl.pp;

public class Person {
    // Fields
    public String forename;
    public String surname;
    public int age;
    public String address;
    public int year_of_birth;

    // Constructors
    public Person() {
        this.forename = "";
        this.surname = "";
        this.age = 0;
        this.address = "";
        this.year_of_birth = 0;
    }

    public Person(String forename, String surname, int age) {
        this.forename = forename;
        this.surname = surname;
        this.age = age;
        this.address = "";
        this.year_of_birth = 0;
    }

    // Method: Display greeting and info
    public void hiToAll() {
        System.out.println("Hello, my name is " + forename + " " + surname + ". I am " + age + " years old.");
        if (!address.equals("")) {
            System.out.println("I live at: " + address);
        }
        if (year_of_birth != 0) {
            System.out.println("Year of birth: " + year_of_birth);
        }
        System.out.println();
    }

    // growOld method with parameter
    public void growOld(int years) {
        this.age += years;
    }

    // overload growOld() for compatibility
    public void growOld() {
        this.age += 1;
    }

    // beYounger method
    public void beYounger() {
        if (age > 0) {
            this.age -= 1;
        }
    }

    // Getter and Setter for forename
    public String getName() {
        return this.forename;
    }

    public void setName(String name) {
        this.forename = name;
    }
}
