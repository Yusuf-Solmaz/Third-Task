package thirdTask;

public class StudentManager extends UserManager{

	@Override
	public void addCourse(String [] course) {
		
		for(String courses :course) {
		System.out.println(courses+ " has been added to cart.");
	}
		}
	
	
}
