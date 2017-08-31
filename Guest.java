package bmp;

public class Guest extends Person{
	static int due= Policy.dueto*2;
	String visit;
	public Guest(String name, int age, String address, String visit) {
		super();
		super.status = "guest";
		super.name = name;
		super.age = age;
		super.address = address;
		this.visit = visit;
	}
}
