import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class File implements Component {
    private String name;
    private int size;
    private int count;

    private boolean fileExists;


    public File(String name, int size) {
        this.name = name;
        this.size = size;
        this.count = count;
        this.fileExists = fileExists;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getCount() {
        return count;
    }

    public String display(String prefix) {
        String fileDisplay = "";
        fileDisplay = prefix+this.getName()+"("+this.getSize()+")"+"\n"+"("+this.getCount()+")"+"\n";
        return fileDisplay;
    }
    public Component search(String name){
    if (this.getName().equals(name))
        return this;
        return null;
    }
        public String toString () {
            return name;
        }
    }

