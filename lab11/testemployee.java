package lab11;

public class testemployee {
    public static void main(String [] args) {
		employee emp1 = new employee();
		employee emp2 = new employee();
		int oldSalary;

		// Part 1-2 here
        emp1.setname("Chan Tai Man");
        emp1.setsalary(12000);
        emp2.setname("Tam Ping Shing");
        emp2.setsalary(13500);        
		// Part 3 below
		System.out.println("Before-");
		System.out.println("Employee 1: name="+emp1.getname() 
        + " salary=" + emp1.getsalary());
        System.out.println("Employee 2: name="+emp2.getname() 
        + " salary=" + emp2.getsalary());

		// Part 4-5 here
        oldSalary = emp1.getsalary();
        emp1.setsalary((int)(oldSalary*1.1));
        oldSalary = emp2.getsalary();
        emp2.setsalary((int)(oldSalary*1.05));
        System.out.println("After-");
		System.out.println("Employee 1: name="+emp1.getname() 
        + " salary=" + emp1.getsalary());
        System.out.println("Employee 2: name="+emp2.getname() 
        + " salary=" + emp2.getsalary());
    }
}
