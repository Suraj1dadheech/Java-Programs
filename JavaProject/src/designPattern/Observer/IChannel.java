package designPattern.Observer;

public interface IChannel {

	void subscriber(Subscriber sub);

	void unSubscriber(ISubscriber sub);

	void notifySubscribers();

	void uplaod(String title);

}