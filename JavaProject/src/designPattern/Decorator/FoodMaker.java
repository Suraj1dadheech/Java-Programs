package designPattern.Decorator;

public class FoodMaker implements IFoodMaker{

	@Override
	public String Prepare(String type) {
			//Gather Ingredients
			//Prepare Food
			
		return type+" is Prepared" ;
	}
	

}
