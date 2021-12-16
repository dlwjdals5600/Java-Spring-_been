package iaccess.di.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
public class Person implements Comparable<Person> {

	private String name;
	private int age;
	
	

	@Override
	public int compareTo(Person arg0) {
		// TODO Auto-generated method stub
		return (this.age - arg0.getAge())*-1;
	}



	public String getName() {
		return name;
	}



	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}


	

}