package coreJavaCode.CoreJavaPart3.Collections.ComparableAndComparator.Comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<User> {

	@Override
	public int compare(User o1, User o2) {
		return o1.name.compareTo(o2.name);
    }
}