package designPattern.Decorator;

public class Main {

	public static void main(String[] args) {
		IFoodMaker foodMaker=new FoodMaker();
		System.out.println(foodMaker.Prepare("Maggie"));
		
		System.out.println("*********************************");
		
		
//		IFoodMaker vfoodMaker=new VoiceFoodMaker(foodMaker);
//		System.out.println(vfoodMaker.Prepare("Soup"));
		
	}

}
