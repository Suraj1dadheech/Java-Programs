package designPattern.Observer;

public class Subscriber implements ISubscriber {
	private String name;
	private Channel channel;
	
	public Subscriber(String name) {
		super();
		this.name=name;
	}
	
	@Override
	public void update() {
		System.out.println("Hey "+name+", Video Uploaded: "+channel.title);
	}
	
	@Override
	public void subscribeChannel(Channel ch) {
		channel = ch;
	}
	

}
