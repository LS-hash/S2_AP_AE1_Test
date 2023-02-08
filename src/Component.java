import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;

public interface Component {
    public String getName();
    public int getSize();
    public int getCount();
    public String display(String prefix);
    public Component search(String name);

}