package coreJavaCode.CoreJavaPart2.InnerClass;

public class Main {

	public static void main(String[] args) {
		GearBox gb=new GearBox(8);
		GearBox.Gear ig=gb.new Gear(3,2.3);
		ig.show();
		ig.update();
		ig.show();
		


	}

}
