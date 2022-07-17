package lab11;

public class testStudent {
    public static void main(String [] args) {
		student stud1 = new student();
		student stud2 = new student();
        student stud3 = new student();
		double Average;

		// Part 1-2 here
        stud1.setname("Cheung Siu Ming");
        stud1.setid(310567);
        stud1.setscore(87.1);
        stud2.setname("Ng Wai Man");
        stud2.setscore(77.5);  
        stud3.setname("Wong Sui Kai");
        stud3.setscore(83.4);
		Average = stud1.getscore()+stud2.getscore()+stud3.getscore();

		System.out.println("Student 1: name="+stud1.getname() 
        + " id=" + stud1.getid() + "score="+stud1.getscore());
		System.out.println("Student 2: name="+stud2.getname() 
        + " id=" + stud2.getid() + "score="+stud2.getscore());
        System.out.println("Student 3: name="+stud3.getname() 
        + " id=" + stud3.getid() + "score="+stud3.getscore());
        System.out.println("Average Score = "+Average/3);

}}
    
