package CoreJavaPart3.Collections.ComparableAndComparator.Comparator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;
import java.util.Date;

public class DobComparator implements Comparator<User>  {

	@Override
	public int compare(User o1, User o2) {
		
	    String sDate1=o1.getDob();  
	    String sDate2=o2.getDob();
	    SimpleDateFormat sd1=new SimpleDateFormat("yyyy-MM-dd");
	    try {
			Date date1=sd1.parse(sDate1);
			Date date2=sd1.parse(sDate2);
			return date1.compareTo(date2);
		} 
	    
	    catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return 1;
		
		
//		String []DOB1=o1.getDob().split(":");
//		int DD1=Integer.parseInt(DOB1[0]);
//		int MM1=Integer.parseInt(DOB1[1]);
//		int YY1=Integer.parseInt(DOB1[2]);
//		
//		String []DOB2=o2.getDob().split(":");
//		int DD2=Integer.parseInt(DOB2[0]);
//		int MM2=Integer.parseInt(DOB2[1]);
//		int YY2=Integer.parseInt(DOB2[2]);
		
//		if(YY1>YY2)
//			return 1;
//		else if(YY1<YY2)
//			return -1;
//		else {
//			if(MM1>MM2)
//				return 1;
//			else if(MM1<MM2)
//				return -1;
//			else {
//				if(DD1>DD2)
//					return 1;
//				else if(DD1<DD2)
//					return -1;
//				else
//					return 0;
//			}
//		}
				
	}

}
