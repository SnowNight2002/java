package lab11;

class AStudent {
    private String name;
	private int age;

	public void setName(String inName) { name = inName; }
	public String getName() { return name; }
	public int getAge() { return age; }
	public void setAge(int inAge) { if(inAge<0){
		System.out.println("invalid age: "+inAge);
		age =18;
	}else
	  age =inAge;
	
	}
} 
public class TestStudent2 {
	public static void main(String s[]) {
		AStudent stud1 = new AStudent();
		AStudent stud2 = new AStudent();
		stud1.setName("Chan Tai Man");
		stud1.setAge(19);
		stud2.setName("Ng Hing");
		stud2.setAge(-23);

		System.out.println("Student: name="+stud1.getName() + 
							", age=" + stud1.getAge());
		System.out.println("Student: name="+stud2.getName() + 
							", age=" + stud2.getAge());
	}
}




 

