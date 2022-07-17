package lab12;

public class Employee {
    private String name;
    private int salary;
    public Employee(String n,int s){
       name = n;
       salary = s;

    }

    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }
    public void raiseSalary(double percentage){
        salary = (int)(salary*(1+percentage));
    }

    public void displayDetails() {
        System.out.println(" name="+name + " salary=" +salary);
    }
}
class testemployee {
    public static void main(String [] args) {
		Employee emp1 = new Employee("Chan Tai Man",12000);
		Employee emp2 = new Employee("Tam Ping Shing",13500);
        emp1.raiseSalary(0.05);
        emp2.raiseSalary(0.1);
		System.out.print("Employee 1:");
        emp1.displayDetails();
        System.out.print("Employee 2:");
        emp2.displayDetails();
    }}