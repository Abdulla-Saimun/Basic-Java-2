package linked.list.example;

import javax.lang.model.element.Name;

public class Student {
	int id;
	String name, className;
	public Student(int id, String name, String className) {
		this.id = id;
		this.name = name;
		this.className = className;
	}
	
	 void getInfo() {
		System.out.println("name: "+ this.name+" className: "+this.className);
	}
	

}
