package coreJavaCode.CoreJavaPart3.RegularExpressions;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {

	public static void main(String[] args) {
		String sent="ibam suraj i and i";
		System.out.println(sent.replaceAll("i", "you"));    //you am suraj you and you
		
		System.out.println(sent.replaceAll(".","Y"));      //YYYYYYYYYYYYYYYYYY
		
		System.out.println(sent.replaceAll("ibam","QQ"));      //QQ suraj i and i  //Caret Boundry Matcher
		
		
		String secondString="abcDeeeF12hhabcDeeeiiiijkl99z";
		System.out.println(secondString.replaceAll("^abc", "ll"));
		
		System.out.println(secondString.matches("^hello"));			//false   entire string should match otherwise it will print false
		
		System.out.println(secondString.matches("^abcDeeeF12hhabcDeeeiiiijkl99z"));			//true
		
		
		System.out.println(secondString.replaceAll("kl99z$", "pp"));			//abcDeeeF12hhabcDeeeiiiijpp         checks from end and print
		
		System.out.println(secondString.replaceAll("[DFei]", "X"));			//abcXXXXX12hhabcXXXXXXXXjkl99z        removes all the characters which are D F e i
		
		System.out.println(secondString.replaceAll("[DFi][1ej]", "X"));			//abcXeeX2hhabcXeeiiiXkl99z       removes all the characters which are D F e i if they are followed by [1ej]
		
		
		System.out.println("herry".replaceAll("[Hh]erry", "Herry"));		//irespective of h or H is followed by erry then replace with Herry
		
		String newString="abcDeeeF12hhabcDeeeiiiijkl99z";
		System.out.println(newString.replaceAll("[^eai]", "X"));		//now the caret is character class not a boundary matcher when it is  inside square brackets so 
																		//any charachter except e a i convert to X actully it is negeting the match of e a i.   aXXXeeeXXXXXaXXXeeeiiiiXXXXXX
		
		System.out.println(newString.replaceAll("[a-f,A-F,3-8]", "X"));	//Range from a-f, A-F,3-8 it removes all value
	
		
//		System.out.println(newString.replaceAll("[]", "X"));			//if we pass nothing it gives runtime error
		
		

		System.out.println(newString.replaceAll("(?i)[a-f3-8]", "X"));   //(Case Sensitivity)removes all characters which come in given range irrespective of any case because of (?i)
		
		
		
		System.out.println(newString.replaceAll("\\d", "X"));   //converts all digits in X it uses d character class same as [1-9]
		
		System.out.println(newString.replaceAll("\\D", "X"));   //converts all non-digits in X it uses d character class same as [A-Za-z]
		
		
		String whiteSpace="I want	to remnove		whitespace";
		
		
		System.out.println(whiteSpace.replaceAll("\\s", " "));		//it removes all whitespace into " ".
		
		
		System.out.println(whiteSpace.replaceAll("\t", "X"));		//wherever we have Tab space it converts it to X
		
		
		System.out.println(whiteSpace.replaceAll("\\S", ""));		//all non whitespace characters are removed and only space removed
		
		System.out.println(whiteSpace.replaceAll("\\W", "X"));		//wherever we have Tab space and normal space it converts it to X(space to X and Tab to XX)
		
		System.out.println(whiteSpace.replaceAll("\\w", "X"));		//it convert all characters except symbols in X except space and tab Space.
		
		System.out.println(whiteSpace.replaceAll("\\b", "X"));		//make boundry to all words not symbols by X  -> XIX XwantX	XtoX XremnoveX		XwhitespaceX
		
		
		System.out.println(newString);
		System.out.println(newString.replaceAll("^abcDe{3}", "YY"));  //here we use Quantifier it indicates preceding charachter of quantifier should be matched with no.
																	//then only executes ex. in newString abcDe{3} means it is accepting abcDeee 3 e's so that it selects
																   //the whole value. which is abcDeee which is equal to  abcDe{3} 
		
		
		
		System.out.println(newString.replaceAll("^abcDe+", "YY"));  //this quantifier checks any character like e in the string afterwards if find then match until that
																   //and replace with YY ex. ^abcDe+ in this it check if any e is there after ^abcDe+ then it goes until that
																  // and replace takes another ex ^abcD+ we know D is not there after ^abcD+ so it only replace ^abcD this only
		
		System.out.println(newString.replaceAll("^abcDe*", "YY"));  //removes ^abcDe* untill e occurance ^abcD* removes if D have  more occurance otherwise replace only given.
		
		
		System.out.println(newString.replaceAll("^abcDe{2,5}", "YY"));  //it finds preceding characters if range in 2 to 5 then match with that and replace with given. 
																	   //like: abcDe{2,5} here if e comes in range of 2 to 5 then matches with and replace with given.
		
		
		System.out.println(newString.replaceAll("e+i*j", "Y"));		//in this it  takes any e which have i's it can be any no. that's why we apply i+ then *j mean followed 
																   // by 1 J if this think occur then we find the  match and we can delete that

		
		
		System.out.println("**************************************************************");
		
		StringBuilder htmlText=new StringBuilder("<h1>this is heading<h1>");
		htmlText.append("<h2>this is summary<h2>");
		htmlText.append("<p>this is underParagraph<p>");
		
		System.out.println(htmlText);
		
		String h2Pattern="<h2>";
		Pattern pattern=Pattern.compile(h2Pattern);
		Matcher matcher=pattern.matcher(htmlText);
		System.out.println("Matching: "+ matcher.matches());
		
		matcher.reset();
		int  count=0;
		while(matcher.find()) {
			count++;
			System.out.println("Occurance: "+count+" : "+matcher.start()+" to "+matcher.end());
		}
		
		
		
		System.out.println("**********************Pattern Matching*******************************");
		
		// ? -> characters occurs for  one or more time
		
		System.out.println(Pattern.matches("[ayx]?", "a"));       //true a occurs for one time
		System.out.println(Pattern.matches("[ayx]?", "ybby"));       //false should come for the one time only
		
		System.out.println(Pattern.matches("[xyz]*", "x"));

		
		
		System.out.println("****************************And,or,Not**********************************");
		
		
		System.out.println("harry".replaceAll("[H|h]arry", "Larry"));
		System.out.println("harry".replaceAll("[H|h]arry", "Larry"));
		
		

		String match="t[^v]";  //this expression check t that should no followed by v.
		Pattern pattern1=Pattern.compile(match);
		Matcher match2=pattern1.matcher("tstvtkt");
//		Matcher match2=Pattern.compile("t[^v]").matcher("tstvtkt");  //we can also write in this way
		
		count=0;
		while(match2.find()) {
			count++;
			System.out.println("Occurance: "+count+" : "+match2.start()+" : "+match2.end());
		}
		
		
		Matcher match3=Pattern.compile("t[?!t]").matcher("tstvtkt");  //this expression check t should no followed by v but if  t comes at  end then  it should  included
		
		count=0;
		while(match3.find()) {
			count++;
			System.out.println("Occurance: "+count+" : "+match3.start()+" : "+match3.end());
		}
		
		
		System.out.println("*************************Phone no. Matcher**********************************");
		
		System.out.println("4444444444444444".matches("^4[0-9]{12}([0-9]{3})?$"));
		
		
		System.out.println("Abbc".matches("^[A-z]+"));
		
		System.out.println("abcd.135uvqz.7tzik.999".matches("^[A-z]{4}\\.\\d{3}[a-z]{4}\\.\\d{1}[a-z]{4}\\.\\d+$"));
		
		System.out.println("a\b".matches("^[a-z]\\[a-z]"));
		
		System.out.println("44444-4444".matches("^\\d{5}-\\d{4}"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
