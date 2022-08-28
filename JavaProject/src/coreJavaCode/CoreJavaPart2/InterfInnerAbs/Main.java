package coreJavaCode.CoreJavaPart2.InterfInnerAbs;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
			ISaveable s=new Player("suraj",34,100);
			System.out.println(s);
			System.out.println(s.write()); 
			ISaveable s1=new Monster("suraj",34,100);
			System.out.println(s1);
			System.out.println(s1.write());
			
		
			
	}

}
