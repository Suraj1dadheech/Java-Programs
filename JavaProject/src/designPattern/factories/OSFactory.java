package designPattern.factories;

public class OSFactory {
	public OS getInstance(String str) {
		if(str.equals("open"))
			return new Android();
		else if(str.equals("Closed"))
			return new IOS();
		else
			return new Windows();
	}

}
