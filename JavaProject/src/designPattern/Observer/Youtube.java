package designPattern.Observer;

public class Youtube {

	public static void main(String[] args) {
		Channel surajClips=new Channel();
		
		Subscriber s1=new Subscriber("Mahesh");
		Subscriber s2=new Subscriber("Raju");
		Subscriber s3=new Subscriber("Srikant");
		Subscriber s4=new Subscriber("Ravi");
		Subscriber s5=new Subscriber("Raghu");
		Subscriber s6=new Subscriber("Vaishali");
		
		surajClips.subscriber(s1);
		surajClips.subscriber(s2);
		surajClips.subscriber(s3);
		surajClips.subscriber(s4);
		surajClips.subscriber(s5);
		surajClips.subscriber(s6);
		
		
		s1.subscribeChannel(surajClips);
		s2.subscribeChannel(surajClips);
		s3.subscribeChannel(surajClips);
		s4.subscribeChannel(surajClips);
		s5.subscribeChannel(surajClips);
		s6.subscribeChannel(surajClips);
		
		surajClips.uplaod("Desing Pattern in java !! ");
		

	}

}
