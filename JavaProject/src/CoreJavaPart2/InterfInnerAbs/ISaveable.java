package CoreJavaPart2.InterfInnerAbs;

import java.util.List;

public interface ISaveable {
    // write code here
    List<String> write();
    
    void read(List<String> lst);
}