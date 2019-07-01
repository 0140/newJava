package com.sbr.homework;

import java.util.ArrayList;

public class Person {
	
	public static final String school = "UNC";
	private String name = "UFG Coleege";
	private int age = 34;
	private String ssn;
	
	
	
	public Person() {
		this.name = "John";
		this.age = 23;			
	}
	
	public Person(String name, int age, String ssn) {
		this.name = name;
		this.age =age;
		this.ssn = ssn;
	}

	public String getName() {
		return name;
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

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("VV");
		p.setAge(23);
		p.setSsn("5478547854");
		
		ArrayList<Person> al = new ArrayList<Person>();
		al.add(p);
		
		Person p2 = new Person();
		p2.setName("Dave");
		p2.setAge(76);
		p2.setSsn("6767");
		
		al.add(p2);
		
		Person p3 = new Person("Kepler", 4, "6478");
		
	}
	
	@Override
	public boolean equals(Object o) {
		
		if (o == null) return false;
		if(!(o instanceof Person) ) return false;
		
		Person p = (Person) o;
		
		if ( !name.equals(p.getName())) return false;
		if( age != p.getAge()) return false;
		if(!ssn.equals(p.getSsn()) ) return false;
		
		return true;
	}
	
	@Override
	public int hashCode() {
		int hash = name.hashCode();
		hash = hash + age * 30;
		hash = hash + ssn.hashCode(); 
		
		return hash ;
		
		
	}
	
/*	@Override
    public int hashCode() {
        final int seed = 37;
        int result = 1;
        result = seed * result + ((name == null) ? 0 : name.hashCode());
        result = seed * result + age;
        return result;
    }*/

	
	public String toString() {
		return (name + age + ssn.hashCode());
	}
	

}
