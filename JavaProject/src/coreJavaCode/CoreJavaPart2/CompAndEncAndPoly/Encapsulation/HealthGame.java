package coreJavaCode.CoreJavaPart2.CompAndEncAndPoly.Encapsulation;


class Demo{
	public int health=10;
	public void damageFun(int damage) {
		this.health=this.health-damage;
		if(health<1)
			System.out.println("Out");
		else
			System.out.println("health remaining: "+health);
	}
		
}
public class HealthGame {
	public static void main(String []arg) {
		Demo demo=new Demo();
//		demo.health=100;
		demo.damageFun(4);
		demo.damageFun(4);
		demo.damageFun(40);
		
		
	}
}