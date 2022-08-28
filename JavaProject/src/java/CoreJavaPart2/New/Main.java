package java.CoreJavaPart2.New;

public class Main {

	public static void main(String[] args) {
		Album al=new Album("raju","mahesh");
		System.out.println(al.addSong("rajjhana", 10.16));
		System.out.println(al.addSong("salid", 5.06));
		System.out.println(al.addSong("Rehana", 3.18));
		System.out.println(al.addSong("Nafisha", 8.12));
		System.out.println(al.addSong("Jakhana", 7.21));
		System.out.println("to check:");
		System.out.println(al.addSong("Rehana", 3.18));
		System.out.println("to Find song:");
		System.out.println(al.findSong("Nafisha"));
		System.out.println(al.findSong("ratu"));
		System.out.println("to print");
//		al.check();

	}

}
