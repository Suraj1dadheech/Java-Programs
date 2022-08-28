package coreJavaCode.externalTasks.challenge1;

import java.util.HashMap;
import java.util.Map;

import coreJavaCode.externalTasks.challenge1.Image.fileType;
import coreJavaCode.externalTasks.challenge1.Video.fileTypes;

public class Main {
	public static Map<String, ? super PhotoAlbum> files=new HashMap<>();
	public static int check(String data) {
		
		for(fileType value:fileType.values()) {
			if(data.equals(String.valueOf(value)))
				return 1;
		}
		for(fileTypes value:fileTypes.values()) {
			if(data.equals(String.valueOf(value)))
				return 2;
		}
		return 0;
	}
	public static void main(String[] args) {
		Image itemp;
		Video vtemp;
		
		String A0="Car Jpeg 34 C:\\Users\\costrategix\\Car.jpeg";
		String A1="Swimming Avi 900 C:\\Users\\infosys\\Swimming.avi";
		String A2="Krishna Png 100 D:\\Users\\suraj\\Krishna.png";
		String A3="Playing Mkv 800 E:\\Admin\\hanish\\Playing.mkv";
		String A4="Building Tiff 220 F:\\HR\\My\\Building.tiff";
		String A5="Eating Err 232 E:\\system\\costrategix\\Eating.err";
		String A6="Document Pdf 300 E:\\Self\\Harish\\Document.pdf";
		String A7="Dancing Mov 1000 F:\\your\\seal\\Dancing.mov";
		String A8="Acting Www 509 C:\\Users\\Snesaha\\Acting.www";
		String A9="Shop Gif 300 D:\\Users\\costrategix\\Shop.gif";
		
		String []arr=new String[10];
		arr[0]=A0;
		arr[1]=A1;
		arr[2]=A2;
		arr[3]=A3;
		arr[4]=A4;
		arr[5]=A5;
		arr[6]=A6;
		arr[7]=A7;
		arr[8]=A8;
		arr[9]=A9;
		
		int i=0;
		while(i<10) 
		{
			if(i==10)
				break;
			String data=arr[i];			
			String[] value=data.split(" ");
			if(check(value[1])==1) {
				itemp=new Image(value[0],fileType.valueOf(value[1]),Double.parseDouble(value[2]),value[3]);
				files.put(itemp.getName(), itemp);
				System.out.println("Image Object is Added: "+itemp.getName());
			}else if(check(value[1])==2) {
				vtemp=new Video(value[0],fileTypes.valueOf(value[1]),Double.parseDouble(value[2]),value[3]);
				files.put(vtemp.getName(), vtemp);
				System.out.println("Video Object is Added: "+vtemp.getName());
			}
			else {
				System.out.println("fileType did't Match with Image and Audio: Name:"+value[0]+" format:"+value[1]);
			}
			i++;
		}
		System.out.println("---------------------All the Images and Video Files-------------------------");
		for(String Key:files.keySet())
			System.out.println(Key+" : "+files.get(Key));
	
	}

}

