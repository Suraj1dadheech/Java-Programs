package CoreJavaPart3.LambdaExpressions.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main{
	public static void main(String ars[])
	{
		
		List<String> list=Arrays.asList("N40","N36","B12","B6","G53","G49","G60","G50","g80","I26","I17","I29","071");
		list.sort((s1,s2)->s1.compareTo(s2));
		list.forEach(value->{
			if(value.toUpperCase().startsWith("G"))
				System.out.println(value);
		});
		
		
		List<String> gNumbers=new ArrayList<>();
		
		list.forEach(value->{
			if(value.toUpperCase().startsWith("G"))
				gNumbers.add(value);
		});
		
		gNumbers.sort((s1,s2)->s1.compareTo(s2));
		
		System.out.println("****************************************");
		gNumbers.forEach(value->System.out.println(value));
		
		
		System.out.println("***********************Printint using stream****************************");
		
		list									//we have normal list and returned to stream
			.stream()							//passing the list in the stream returned to map
			.map(String::toUpperCase)			//doing mapping where all the  stream elements which are of string type convert to uppercase and now stream containing uppercase list now returns to filter it uses the  apply method of function interface
			.filter((s)->s.startsWith("G"))		//elements in the list are filtered now using predicate interface test method which takes arguments and provide the boolean value returns to sorted method
			.sorted()							//sort the stream which contains only filtered elements return to foreach loop to print
			.forEach(System.out::println);		//it accepts the value using accept method which contain the argument  but return nothing so 
												//chain has to end here so this last forEach method  is called  terminal operations which return nothing and End the chain of stream.
	
		
		System.out.println("**********************************Concat then find  distinct then print and then count*********************************");
		Stream<String> ioNumberStream=Stream.of("I26","I17","I29","071");
		Stream<String> inNumberStream=Stream.of("N40","N36","I26","I17","I29","071");
		Stream<String> concatStream=Stream.concat(ioNumberStream, inNumberStream);
		System.out.println(concatStream.
							distinct()
							.peek(System.out::println) //peek prints the value  and returns the stream where forEach only print the value and return void
							.count());
		
		System.out.println("------------------------");
		List<String>  numb=list
				.stream()
				.map(String::toUpperCase)
				.filter(t->t.startsWith("G"))
				.sorted()
				.collect(Collectors.toList());
		numb.add("22");
		
		System.out.println("-------With ArrayList-----------------");
		List<String>  numb1=list
				.stream()
				.map(String::toUpperCase)
				.filter(t->t.startsWith("G"))
				.sorted()
				.collect(ArrayList::new,ArrayList::add,ArrayList::addAll);
		
		System.out.println(numb1);
		
		
		System.out.println("****************Flow of  the Program******************");
		
		List<String> names=Arrays.asList("April","Ben","Charlie","David","Benildus","Christian");
		
		
		names.stream()
			.peek(System.out::println)
			.filter(s->{
				System.out.println("Filter 1: "+s);
				return s.startsWith("B")|| s.startsWith("C");
			})
			.filter(s->{
				System.out.println("Filter 2: "+s);
				return s.length()>3;
			})
//			.limit(1)    //for Limiting purpose we use LIMIT
			.forEach(System.out::println);
		
		
		Map<Integer,String> l=new HashMap<>();
		l.put(1, "Suraj");
		l.put(2, "Suraj1");
		l.put(3, "Suraj2");
		l.put(4, "Suraj3");
		l.put(4, "Suraj4");
		
		Set<Entry<Integer, String>> h=l.entrySet();
		
		Optional<Integer> g=Stream.of(4,3,2,7,5,8)
				.min((s,s1)->s-s1);
				
		
		g.ifPresent(System.out::println);
		
		
		System.out.println("*********************Combiner and Accumulator***************************************");
		
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
		
		System.out.println("********************Collect(Collector)*****************************");
		
		String s=Arrays.asList("Suraj","is","a","Good","Boy")
				.stream()
				.collect(Collectors.joining(", "));
		
		System.out.println(s);
		
		Double StringValue=Arrays.asList("Suraj","is","a","Good","Boy")
				.stream()
				.collect(Collectors.averagingInt(p->p.length()));
		
		
		System.out.println(StringValue);
		
		
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
		
		
		TreeMap<String,Integer>  treeValue=Arrays.asList("cake","Biscuits","cake","cookies","dfdf")
				.stream()
				.collect(Collectors.toMap(t->t,                      //Key in String
												t1->t1.length(),						 //value  in length
												(a,b)->a+b,					//Merge Function:when two keys are same use only one and in value print the length of both.
												()->new TreeMap<>()));			//providing the  memory to the TreeMap<>();
		
		System.out.println(treeValue);
		
		
		System.out.println("******************Grouping by **********************");
		
		Map<Integer,List<String>> grpby=Arrays.asList("Joe","Tom","Tom","Alen","Peter")
				.stream()
				.collect(Collectors.groupingBy(String::length));
		
		System.out.println(grpby);
		
		
		System.out.println("************GroupBy in map<Integer,set<String>>****************************");
		
		Map<Integer,Set<String>> grpby1=Arrays.asList("Joe","Tom","Tom","Alen","Peter")
				.stream()
				.collect(Collectors.groupingBy(String::length,
												Collectors.toSet())); //keeps only unique elements
		
		System.out.println(grpby1);
		
		
		System.out.println("******************************providing memory to treeMap and send generics in list******************************************");
		
		TreeMap<Integer,List<String>> grpby2=Arrays.asList("Joe","Tom","Tom","Alen","Peter")
				.stream()
				.collect(Collectors.groupingBy(String::length,
												TreeMap::new,      //same as ()->new TreeMap<>()
												Collectors.toList())); //keeps only unique elements
		
		
		
		System.out.println(grpby2);
		
		
		
		System.out.println("**********************Partitioning By**************************************");
		
		Map<Boolean,List<String>> grpby3=Arrays.asList("Joe","Tom","Tem","Alen","Peter")
				.stream()
				.collect(Collectors.partitioningBy(
						t->t.startsWith("T"))); 
		
	
		System.out.println(grpby3);
		
		
		Map<Boolean,List<String>> grpby4=Arrays.asList("Joe","Tom","Tem","Alen","Peter")
				.stream()
				.collect(Collectors.partitioningBy(
						t->t.length()>3)); 
		
	
		System.out.println(grpby4);
		
		
//		Optional<Double> optAvg=Stream().calcAverage(50,60,70);
		
		
		
		
		System.out.println("***************Sorting the String*************************");
		
		List<String>  l1=Arrays.asList("Amelia","Olivia","Isla","Jack","harry")
				.stream()
				.map(s1->s1.substring(0, 1).toUpperCase()+s1.substring(1))
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println(l1);
		
		
		
		long  addCount=Arrays.asList("Amelia","Olivia","Asla","Jack","Aarry")
				.stream()
				.filter(t1->t1.startsWith("A"))
				.count();
		
		System.out.println(addCount);
		
		
		
		
		
		

		
		
		

	}//Main method end	

}// Main class End
