package java.CoreJavaPart3.Collections.SetsAndHashSets.Challenge;

public class Dog {
	private final String name;

	public Dog(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	
//	Here we keep equals as final so that it can't override in the child class
//	by this when we call equals method in main Class using child object then by default it goes to 
//	override method equal of child class only and checks 
//	if(obj(parent class object) instanceof childclass) so it gives false but we don't
//	want this that's why we make final over equals method in parent class so when it  
//	comes to parent class equal method and there we have
//	if(obj(Parent class object) instanceof parentclass) is true
//	so in those cases we use this kind of approach
	@Override
	public final boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj instanceof Dog) {
			System.out.println("sim");
			String name=((Dog)obj).getName();
			return this.name.equals(name);
		}
		return false;
	}
	

}
