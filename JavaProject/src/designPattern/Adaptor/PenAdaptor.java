package designPattern.Adaptor;

public class PenAdaptor implements Pen {

	PilotPen pp=new PilotPen();
	@Override
	public void write(String str) {
		pp.marker(str);
		
	}
	

}
