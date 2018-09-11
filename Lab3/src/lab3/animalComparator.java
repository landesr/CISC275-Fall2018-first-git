package lab3;

import java.util.Comparator;

public class animalComparator implements Comparator<Animal> {
	@Override
	public int compare(Animal a, Animal b){
	    return a.getLegs() - b.getLegs();
	}
}
