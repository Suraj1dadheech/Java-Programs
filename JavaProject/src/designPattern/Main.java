package designPattern;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

class Journal
{
  private final List<String> entries = new ArrayList<>();

  private static int count = 0;

  public void addEntry(String text)
  {
    entries.add("" + (++count) + ": " + text);
  }

  @Override
  public String toString() {
    return String.join(System.lineSeparator(), entries);
  }

//  // here we break SRP
//  public void save(String filename) throws Exception
//  {
//    try (PrintStream out = new PrintStream(filename))
//    {
//      out.println(toString());
//    }
//  }

}

// handles the responsibility of persisting objects
class Persistence
{

	  public void saveToFile(Journal journal,String filename, boolean overwrite) throws Exception
	  {
	    if (overwrite || new File(filename).exists())
	      try (PrintStream out = new PrintStream(filename)) {
	        out.println(journal.toString());
	      }
	  }
}

class SRPDemo
{
  public static void main(String[] args) throws Exception
  {
    Journal j = new Journal();
    j.addEntry("I cried today");
    j.addEntry("I ate a bug");
    System.out.println(j);

    Persistence p = new Persistence();
    String filename = "c:\\temp\\raju.txt";
    p.saveToFile(j, filename, true);

//    // windows!
    Runtime.getRuntime().exec("notepad.exe " + filename);
  }
}