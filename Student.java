
public class Student {
String adminNo;
String name;
String gender;
int weight;
int age;

public Student (String newAdminNo, String newName, String newGender,
		int newWeight, int newAge) {
		adminNo=newAdminNo;
		name = newName;
		gender = newGender;
		weight = newWeight;
		age = newAge;
	}
public String getStudentCategory() {
	String category;
	if (age<12) {
		category="Primary School Student";
	}
	else if (age<17) {
		category="Secondary School Student";
	}
	else {
		category="College Student";
	}
	return category;
}
public void printStudentDetails() {
	System.out.println("Name:"+name+"\nGender: "+gender+ "\nAge: "+age+ "\nWeight: "+weight);
	
}

}
