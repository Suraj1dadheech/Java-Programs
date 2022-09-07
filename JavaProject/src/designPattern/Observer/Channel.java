package designPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements IChannel {
	private List<Subscriber> subs=new ArrayList<>();
	String title;    //title of the video
	
	@Override
	public void subscriber(Subscriber sub) {
		subs.add(sub);
	}
	
	@Override
	public void unSubscriber(ISubscriber sub) {
		subs.remove(sub);
	}
	
	@Override
	public void notifySubscribers() {
		for(ISubscriber sub : subs)
			sub.update();
	}
	
	@Override
	public void uplaod(String title) {
		this.title=title;
		notifySubscribers();
	}
}
