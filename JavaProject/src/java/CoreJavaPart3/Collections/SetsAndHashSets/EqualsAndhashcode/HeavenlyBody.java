package java.CoreJavaPart3.Collections.SetsAndHashSets.EqualsAndhashcode;

import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody {
	private final String name;
	private final double orbitalPeriod;
	private final Set<HeavenlyBody> satellites;
	public HeavenlyBody(String name, double orbitalPeriod) {
		this.name=name;
		this.orbitalPeriod=orbitalPeriod;
		this.satellites=new HashSet<>();
	}
	public String getName() {
		return name;
	}
	public boolean addMoon(HeavenlyBody moon) {
		return this.satellites.add(moon);
	}
	public double getOrbitalPeriod() {
		return orbitalPeriod;
	}
	public Set<HeavenlyBody> getSatellites() {
		return new HashSet<>(satellites);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		
		System.out.println("OBJ: "+obj.getClass());
		System.out.println("OBJ: "+this.getClass());
		if((obj==null) || (obj.getClass()!=this.getClass()))
			return false;
		String objName=((HeavenlyBody)obj).getName();
		return this.name.equals(objName);
	}
	
	public int hashCode() {
		return this.name.hashCode();
	}
	
	// karthik 2323
	// karthik 2323
	
	

}
