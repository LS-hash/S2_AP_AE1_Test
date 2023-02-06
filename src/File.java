import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class File implements Component {
    private String name;
    private int size;
    private int count;

    private boolean fileExists;
    private ArrayList<Component> files;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
        this.count = count;
        this.fileExists = fileExists;
        this.files = new ArrayList<Component>();
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

    //    public String display(String prefix) {
//        String fileInfo = name + ", " + size;
//        return fileInfo;
//    }
    public String display(String prefix) {
        String fileDisplay = name;
        for (Component a : files) {
            fileDisplay = String.valueOf(a);
        }
        return fileDisplay;}

    public boolean FileExists(String prefix) {
        for (Component file : files) {
            if (file.getName().equals(name))
                return fileExists;
        }
        return true; }

    public Component search(String name){ //instanceof
        for (Component file : files) {
            if (file.getName().equals(name))
                return file;
        }
        return null;
    }
//    public void add(Component a){
//        files.add(a);
//    }
//    public void remove(Component a){
//        files.remove(a);
//    }

//    public Component search(String name){ //instanceof
//        for (Component file : files) {
//            if (file.getName().equals(name))
//                return file;
//        }
//        return null;
//    }


        public String toString () {
            return name;
        }


    }

