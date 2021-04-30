package thirdTask;

public class Main {

	
	public static void main(String []args) {
	
		Student student = new Student("Ayþe", "Kara", "123456", "ayse@gmail.com");
		
		Instructor instructor = new Instructor("Engin", "Demiroð", "45678", "engin@gmail.com");
		
		
		UserManager userManager = new UserManager();
		
		userManager.showInformation(instructor);
		
		userManager.showInformation(new User("Mehmet","Su","159753","mehmet@gmail.com"));
		
		
		InstructorManager instructorManager = new InstructorManager();
		String [] addingCourse = {"Java",  "C #"};
		instructorManager.addCourse(addingCourse);
		
		StudentManager studentManager = new StudentManager();
		String [] addingCourse2 = {"Java"};
		studentManager.addCourse(addingCourse2);
	}
}