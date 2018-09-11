package lab3;

public class Animal{
	String name;
	int legs;
	public Animal(String name, int legs) {
		this.name=name;
		this.legs=legs;
	}
	int getLegs() {
		return legs;
	}
	public String toString() {
		return name +" has " +legs+" legs";
	}
}
