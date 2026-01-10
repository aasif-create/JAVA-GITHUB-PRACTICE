abstract class Employee {

    @SuppressWarnings("unused")
    abstract void work();
}

class Staff extends Employee {

    private int salary;

    public void setSalary(int s) {
        System.out.println("ENCAPSULATION: Setting salary using setter");
        salary = s;
    }

    public int getSalary() {
        System.out.println("ENCAPSULATION: Getting salary using getter");
        return salary;
    }

    @Override
    void work() {
        System.out.println("ABSTRACTION: Employee work implemented in Staff");
    }
}

class Developer extends Staff {

    @Override
    void work() {
        System.out.println("POLYMORPHISM: work() overridden in Developer");
        System.out.println("INHERITANCE: Developer uses Staff properties");
    }
}

public class oops3
{

    public static void main(String[] args) {

        System.out.println("Creating object using parent reference");
        Staff emp = new Developer();

        emp.setSalary(30000);
        System.out.println("Salary = " + emp.getSalary());

        emp.work();
    }
}
