package designPattern.Decorator;

public class VoiceFoodMaker implements IFoodMaker{
		private IFoodMaker _foodMaker=null;
		
		public VoiceFoodMaker(IFoodMaker maker) {
			_foodMaker=maker;
		}
		
		public String Prepare(String type) {
			_foodMaker.Prepare(type);
			playSound();
			return type+" is prepared with Music";
			
		}

		private void playSound() {
			System.out.println("Music is Playing");
		}
}
