package pkg_one;

public class Person {
	
	private String name;
	private int age;
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "My name is " + this.name + " and I'm " + this.age + " years old.";
	}

}
