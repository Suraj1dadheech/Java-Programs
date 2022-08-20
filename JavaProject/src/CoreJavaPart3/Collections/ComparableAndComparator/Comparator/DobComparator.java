package CoreJavaPart3.Collections.ComparableAndComparator.Comparator;

import java.util.Comparator;

public class DobComparator implements Comparator<User> {

	@Override
	public int compare(User o1, User o2) {
		String []DOB1=o1.getDob().split(":");
		int DD1=Integer.parseInt(DOB1[0]);
		int MM1=Integer.parseInt(DOB1[1]);
		int YY1=Integer.parseInt(DOB1[2]);
		
		String []DOB2=o2.getDob().split(":");
		int DD2=Integer.parseInt(DOB2[0]);
		int MM2=Integer.parseInt(DOB2[1]);
		int YY2=Integer.parseInt(DOB2[2]);
		
		if(YY1>YY2)
			return 1;
		else if(YY1<YY2)
			return -1;
		else {
			if(MM1>MM2)
				return 1;
			else if(MM1<MM2)
				return -1;
			else {
				if(DD1>DD2)
					return 1;
				else if(DD1<DD2)
					return -1;
				else
					return 0;
			}
		}
		
	}

}
