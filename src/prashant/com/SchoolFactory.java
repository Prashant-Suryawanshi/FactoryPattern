package prashant.com;

public class SchoolFactory {
	public Student createStudent() {
		return new Student();
	}
	public Teacher createTeacher() {
		return new Teacher();
	}
	public BabuMama createBabuMama() {
		return new BabuMama();
	}
}
