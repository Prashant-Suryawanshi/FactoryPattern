package prashant.com;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SchoolFactory factory = new SchoolFactory();
		
		Student s1 = factory.createStudent();
		
		
		Teacher t1 = factory.createTeacher();
		System.out.println(t1);
		
	}

}
