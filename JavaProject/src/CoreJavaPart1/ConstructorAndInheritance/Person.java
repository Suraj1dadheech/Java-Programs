package CoreJavaPart1.ConstructorAndInheritance;

public class Person {
	private String firstName,lastName;
    private int age;
    
    public void setFirstName(String firstName){ this.firstName = firstName;}
    public void setLastName(String lastName){ this.lastName = lastName;}
    
    public String getFirstName(){ return firstName;}
    public String getLastName(){ return lastName;}
    public int getAge(){ return age;}
    
    public void setAge(int age)
    {
        if(age > 0 && age < 101)
            this.age = age;
        else
            this.age = 0;
    }
    
    public boolean isTeen()
    {
        if(age > 12 && age < 20)
            return true;
        return false;
    }
    public String getFullName()
    {
        if(!firstName.isEmpty() && !lastName.isEmpty())
            return firstName+" "+lastName;
        
        else if(!firstName.isEmpty() && lastName.isEmpty())
            return firstName;
        
        else if(firstName.isEmpty() && !lastName.isEmpty())
            return lastName;
        
        else
            return "";
    }
	public static void main(String[] args) 
	{
		Person person = new Person();
		person.setFirstName("");  
		person.setLastName("");   
		person.setAge(10);
		System.out.println("fullName= " + person.getFullName());
		System.out.println("teen= " + person.isTeen());
		person.setFirstName("John");
		person.setAge(18);
		System.out.println("fullName= " + person.getFullName());
		System.out.println("teen= " + person.isTeen());
		person.setLastName("Smith");
		System.out.println("fullName= " + person.getFullName());

	}

}
