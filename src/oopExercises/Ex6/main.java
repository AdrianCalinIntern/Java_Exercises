package oopExercises.Ex6;

public class main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Adi", "Adi", 500.88);
        System.out.println(e1.toString() + "\nYearly salary = " + e1.calculateYearlySalary() + "\n");

        Employee e2 = new Employee("Adi 2", "Adi 2", 100);
        System.out.println(e2.toString() + "\nYearly salary = " + e2.calculateYearlySalary() + "\n");

        System.out.println("New yearly salary for " + e1.getFirstName() + " , " + e1.getLastName() + " is " +
                e1.calculateYearlySalaryIncreased(10));
        System.out.println("New yearly salary for " + e2.getFirstName() + " , " + e2.getLastName() + " is " +
                e2.calculateYearlySalaryIncreased(10) + "\n");
    }
}
