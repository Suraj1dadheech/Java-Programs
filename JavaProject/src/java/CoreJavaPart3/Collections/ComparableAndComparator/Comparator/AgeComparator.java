package java.CoreJavaPart3.Collections.ComparableAndComparator.Comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<User> {

	@Override
	public int compare(User o1, User o2) {
		return o1.age-o2.age;
	}
	

}
