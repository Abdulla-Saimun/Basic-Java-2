package linked.list.example;

import java.util.LinkedList;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Student> list = new LinkedList<>();
		Student s1 = new Student(1, "janal", "eight");
		Student s2 = new Student(2, "karim", "ten");
		Student s3 = new Student(3, "rahim", "eleven");
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		for(Student sb: list) {
			sb.getInfo();
		}

	}

}
