package designPattern.Observer;

public interface ISubscriber {

	void update();

	void subscribeChannel(Channel ch);

}