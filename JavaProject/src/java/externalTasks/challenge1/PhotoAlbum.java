package java.externalTasks.challenge1;

public abstract class PhotoAlbum {
	private final double size;
	private final String location;
	public PhotoAlbum(double size,String location) {
		this.size=size;
		this.location=location;
	}
	
	public String getLocation() {
		return location;
	}

	public double getSize() {
		return size;
	}
	
}
