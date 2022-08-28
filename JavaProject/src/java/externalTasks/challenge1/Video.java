package java.externalTasks.challenge1;

public class Video extends PhotoAlbum {
	protected final String name;
	protected final fileTypes types;
	
	public static enum fileTypes{
		Mpeg,
		Mov,
		Avi,
		Wmv,
		Mkv
	};
	public Video(String name,fileTypes types, double size, String location) {
		super(size,location);
		this.name=name;
		this.types=types;
	}
	public fileTypes getType() {
		return types;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Video [name=" + name + ", type=" + types + ", size="+super.getSize()+", location="+super.getLocation()+ "]";
	}
	
}
