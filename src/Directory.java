import java.util.ArrayList;
import java.util.Iterator;

public class Directory implements Component {
    private String name;
    private int size;
    private int count;
    private ArrayList<Component> directories;

    public Directory(String name) {
        this.name = name;
        directories = new ArrayList<Component>();
    }
    public String getName() {
        return this.name;
    }

    public int getSize() {

        int totalSize=0;
        //Define an iterator contains all the component
        Iterator<Component> iterator = this.directories.iterator();
        Component c=null;
        //Add the all the files'size
        while(iterator.hasNext())
        {
            c=iterator.next();
            totalSize+=c.getSize();
        }
        return totalSize;
    }

    public int getCount() {
        int count = 0;
        count = directories.size();
        return count;
    }

    public String display(String prefix) {
        String directoryDisplay = this.getName();
        for (Component directory : directories) {

            directoryDisplay += "\n";
            if (directory instanceof Directory) {
                directoryDisplay += prefix + directory.display(prefix);
            } else if (directory instanceof File) {
                prefix += "\t";
                directoryDisplay += directory.display(prefix);
            }
        }
        return directoryDisplay;
    }

    public Component search(String lname) {
        for (Component directory : directories) {
            Component searchResult = directory.search(lname);
            if (searchResult!= null)
                return searchResult;
        }
        return null;
    }
  //  for every directory call seearch on that directory
    public void remove(Component directory) {
        directories.remove(directory);
    }

    public void add(Component directory) {
        directories.add(directory);
    }
}


