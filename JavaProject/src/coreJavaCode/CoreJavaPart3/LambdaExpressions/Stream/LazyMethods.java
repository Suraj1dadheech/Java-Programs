package coreJavaCode.CoreJavaPart3.LambdaExpressions.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
class User{
	String name;
	int age;
	public List<String> NickName;
	public User(String name,int age) {
		this.name=name;
		this.age=age;
		NickName=new ArrayList<>();
	}
	
	
	public int getAge() {
		return age;
	}

	public void addNickName(String name) {
		NickName.add(name);
	}
	public String getName() {
		return name;
	}
	public List<String> getUserlist() {
		return new ArrayList<>(NickName);
	}


	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
	
}
public class LazyMethods {

	public static void main(String[] args) {
		
		System.out.println("************************LazyMethods**********************************************");
		List<Integer> list=Arrays.asList(24,20,16,25,21);
		
		System.out.println(list.stream()
							.filter(i->{ System.out.println("in method:"+i);  return i%5==0;})
							.map(t->t*2)
							.findFirst()
							.orElse(0));
		
		
		System.out.println("**********************FlatMap**********************************");
		List<User> UserData=new ArrayList<>();
		User suraj=new User("Suraj",30);
		suraj.addNickName("Sun");
		suraj.addNickName("Sun1");
		suraj.addNickName("Sun2");
		
		User ravish=new User("Ravish",30);
		ravish.addNickName("Ravish1");
		ravish.addNickName("Ravish2");
		ravish.addNickName("Ravish3");
		
		UserData.add(suraj);
		UserData.add(ravish);
		
		List<String> allData=UserData
				.stream()
				.flatMap(t->t.getUserlist().stream())
				.collect(Collectors.toList());
		
		allData.forEach(System.out::println);
		
		Map<Integer,List<User>> map=UserData
				.stream()
//				.flatMap(users->users.getUserlist().stream())
				.collect(Collectors.groupingBy(users->users.getAge()));
		
		System.out.println("MapList: "+map);
		
		System.out.println("*****************Combiner and Accumulator************************************");
		
		Integer size=Arrays.asList(1,2,3,4,5)
				.stream()
				.reduce(0, (a,b)->a+b); //here using identity  and accumulator
		System.out.println(size);
		
		
		Integer  wordSize=Arrays.asList("No","Suraj","Yes","God")
				.stream()
				.reduce(0, 
						(a,b)->a+b.length(),  //accumulator
						(s1,s2)->s1+s2);      //combiner
		
		System.out.println(wordSize);
		
		
		StringBuilder str=Arrays.asList("No","Suraj","Yes","God")
				.stream()
				.reduce(new StringBuilder(),
						(s1,s2)->s1.append(s2),   //Accumulator
						(n1,n2)->n1.append(n2));  //Combiner
		
		System.out.println(str);
		
		

		System.out.println("*****************toMap***************");
		
		Map<String,Integer> mapValue=Arrays.asList("Suraj","is","a","Good","Boy")
				.stream()
				.collect(Collectors.toMap(t->t, t1->t1.length()));
		
		System.out.println(mapValue);
		
		
		System.out.println("*****************Handling  dublicate keys in Map**************************");
		Map<Integer,String>  mapDubValue=Arrays.asList("cake","Biscuits","tart")
				.stream()
				.collect(Collectors.toMap(t->t.length(),                      //Key in length
												t1->t1,						 //value  in String
												(a,b)->a+", "+b));			//Merge Function:merge function for when  we have duplicate value
		
		System.out.println(mapDubValue);
		
		System.out.println();
		

	}

}
