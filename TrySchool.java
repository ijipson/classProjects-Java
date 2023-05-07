
public class TrySchool {

	public static void main(String[] args) {
		School Padua=new School();
		Student jane= new Student ("123","Jane","female",120,16);
		Padua.addStudent(jane);
		Student sam= new Student ("456","Samantha","female",130,17);
		Padua.addStudent(sam);
		Student bill= new Student ("789","William","male",160,17);
		Padua.addStudent(bill);
		
		Padua.printStudents();
		Padua.removeStudentWithAdminNo(jane.adminNo);
		Padua.printStudents();
		
		

	}

}
