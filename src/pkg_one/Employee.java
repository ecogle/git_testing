package pkg_one;

import java.math.BigDecimal;

public class Employee extends Person {
	private BigDecimal salary;
	public Employee(String name, int age, BigDecimal salary){
		super(name,age);
		this.salary = salary;
		
	}

}
