package CoreJavaPart3.Collections.SetsAndHashSets.Challenge1.WithInnerClass;

public class Planet extends HeavenlyBody {
	public Planet(String name, double orbitalPeriod) {
		super(name,orbitalPeriod, BodyTypes.PLANET);
	}
	public boolean addSatellite(HeavenlyBody moon) {
		if(moon.getKey().getBodyType()==BodyTypes.MOON)
			return super.addSatellite(moon);
		else
			return false;
	}
	
}
