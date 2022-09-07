package designPattern.Singleton;


class ABC{
	public static ABC obj=new ABC();
	private ABC() {
		System.out.println("Instance Created");
	}
	
	public static ABC getInstance() {
//		if(obj==null)
//			obj=new ABC();
		
		return obj;
	}
}

public class Main {

	public static void main(String[] args) {
		
		ABC.getInstance();
		ABC.getInstance();
		
		
		
	
		
		
		
		
//		Thread t1=new Thread(new Runnable() {
//			public void run() {
//				ABC obj=ABC.getInstance();
//			}
//		});
		
//		Thread t2=new Thread(new Runnable() {
//			public void run() {
//				ABC obj=ABC.getInstance();
//			}
//		});
		
		
//		t1.start();
		
//		try{Thread.sleep(1000);}catch(Exception e) {}
		
//		t2.start();
		
	}

}
