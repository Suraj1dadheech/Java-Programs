package java.externalTasks.challenge1;

public class Image extends PhotoAlbum {
	protected final String name;
	protected final fileType type;
	
	static enum fileType{
		Jpeg,
		Png,
		Tiff,
		Gif,
		Pdf
	};
	public Image(String name, fileType type , double size, String location) {
		super(size,location);
		this.name=name;
		this.type=type;
	}
	public fileType getType() {
		return type;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Image [name=" + name + ", type=" + type + ", size="+super.getSize()+", location="+super.getLocation()+ "]";
	}
	
	

}
