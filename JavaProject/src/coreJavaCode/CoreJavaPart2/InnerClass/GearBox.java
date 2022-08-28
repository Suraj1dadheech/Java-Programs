package coreJavaCode.CoreJavaPart2.InnerClass;

import java.util.ArrayList;

public class GearBox {
	private ArrayList<Gear> gear;
	private int maxGears;
	private int gearNumber;
	
	public GearBox(int maxGears) {
		this.maxGears=maxGears;
		this.gear=new ArrayList<>();
		Gear neutral=new Gear(0,0.0);
		this.gear.add(neutral);
	}
	public class Gear{
		private int gearNumber;
		private double ratio;
		public Gear(int gearNumber,  double ratio) {
			this.gearNumber=gearNumber;
			this.ratio=ratio;
		}
		public void show() {
			System.out.println(gearNumber+"  "+ratio);
		}
		public void update() {
			this.ratio=this.ratio*1000;
		}
	}
}
