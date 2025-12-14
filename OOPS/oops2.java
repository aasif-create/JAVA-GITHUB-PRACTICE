abstract class Person {

    abstract void role();
}

class Student extends Person {

    private int marks;

    public void setMarks(int m) {
        System.out.println("ENCAPSULATION: Setting marks using setter");
        marks = m;
    }

    public int getMarks() {
        System.out.println("ENCAPSULATION: Getting marks using getter");
        return marks;
    }

    void role() {
        System.out.println("ABSTRACTION: Person role implemented as Student");
    }
}

class CollegeStudent extends Student {

    void role() {
        System.out.println("POLYMORPHISM: role() overridden in CollegeStudent");
        System.out.println("INHERITANCE: CollegeStudent uses Student properties");
    }
}

public class oops2
{

    public static void main(String[] args) {

        System.out.println("Creating object using parent reference");
        Student s = new CollegeStudent();

        System.out.println("Calling encapsulated methods");
        s.setMarks(85);
        System.out.println("Marks = " + s.getMarks());

        System.out.println("Calling role method");
        s.role();
    }
}
