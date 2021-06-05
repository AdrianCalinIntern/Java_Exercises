package oopExercises.Ex6;
/*
Create a class called Employee that includes three pieces of information as instance variables
— a first name (typeString),
- a last name (typeString)
- monthly salary (double).

Your class should have a constructor that initializes the three instance variables.

Provide a set and a get method for each instance variable.

If the monthly salary is not positive, set it to 0.0.

Write a test application named EmployeeTest that demonstrates class Employee’s capabilities.

Create two Employee objects and display each object’s yearly salary.

Then give each Employee a 10% raise and display each Employee’s yearly salary again.

 */
public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary){
        this.firstName = firstName;
        this.lastName = lastName;
        if(monthlySalary <0){
            this.monthlySalary = 0.0;
        }
        else {
            this.monthlySalary = monthlySalary;
        }
    }

    public String getFirstName() {
       return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double calculateYearlySalary(){
        return getMonthlySalary() * 12;
    }

    public double calculateYearlySalaryIncreased(int percent){
        double bonus = getMonthlySalary() * percent / 100;
        return (getMonthlySalary() + bonus) * 12;
    }

    @Override
    public String toString() {
        return "First Name= " + getFirstName() + '\n' +
                "Last Name= " + getLastName() + '\n' +
                "Monthly Salary= " + getMonthlySalary();
    }
}