package coreJavaCode.CoreJavaPart3.LambdaExpressions.Stream.Challege1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface 
interface Demo{
	public String[] fun(String str);
}
public class Main {

	public static void main(String[] args) {
		
		

		
		Demo d=(str)->{
			String part[]=str.split(" ");
			return part;
		};
		
		String[] arr=d.fun("i am suraj Dadheech");
		
		for(String value:arr)
			System.out.println(value);
		
		
				

	}

}
