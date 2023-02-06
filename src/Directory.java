import java.util.ArrayList;

public class Directory implements Component {
    private String name;
    private int size;
    private int count;

//    private boolean fileExists;
    private ArrayList<Component> directories;

    public Directory(String name) {
        this.name = name;
        this.size = size;
        this.count = count;
        directories = new ArrayList<Component>();
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
//        String fileDisplay = name;
//        for (Component a : files) {
//            fileDisplay = String.valueOf(a);
//        }
//        return fileDisplay;
//    }

//    public boolean FileExists(String prefix) {
//        for (Component file : files) {
//            if (file.getName().equals(name))
//                return fileExists;
//        }
//        return true; }
//
//    public Component search(String name){ //instanceof
//        for (Component file : files) {
//            if (file.getName().equals(name))
//                return file;
//        }
//        return null;
//    }
    public String display(String prefix) {
        String directoryDisplay = name;
        for (Component a : directories) {
            directoryDisplay = String.valueOf(a);
        }
        return directoryDisplay;
    }
    public Component search(String name){ //instanceof
        for (Component directory : directories) {
            if (directory.getName().equals(name))
                return directory;
        }
        return null;
    }
//        throw new Exception("File not found")
//    }

//        Iterator<Component> iterator = files.iterator();
//        File test = null;
//        while (iterator.hasNext()) {
//            test = (File) iterator.next();
//            System.out.print("-> ");
//            System.out.print(iterator.next());
//
//            if (test.getName() == name.toString()) {
//                System.out.println(test.getSize() + test.getCount());
//
//            }
//        }
//        return test;
//    }

//        public void add (Component a){
//            files.add(a);
//        }

        public void add (Component a){
            directories.add(a);
        }

//        public void remove (Component a){
//            files.remove(a);
//        }

        public void remove (Component a){
            directories.remove(a);
        }
    }


//    public String display2(String prefix) {
//        LinkedList<Component> LLFiles = new LinkedList<>(files);
//        LLFiles.add((Component) files);
//        LLFiles.removeLast();
//        LLFiles.addFirst((Component) files);
//
//        System.out.print("Display the linked list forward: ");
//        ListIterator<Component> listIterator = LLFiles.listIterator();
//        while (listIterator.hasNext()) {
//            System.out.print(listIterator.next() + " ");
//        }
//        System.out.println();
//
//        return listIterator.toString();
//    }
//    public String display3(String prefix) {
//        ArrayList<Component> ArrayListFiles = new ArrayList<>(files);
//        ArrayListFiles.add((Component) files);
//        ArrayListFiles.remove((Component) files);
//        System.out.print("Display the linked list forward: ");
//        ListIterator<Component> listIterator = ArrayListFiles.listIterator();
//        while (listIterator.hasNext()) {
//            System.out.print(listIterator.next() + " ");
//        }
//        System.out.println();
//
//        return listIterator.toString();


//1.  do we need a two string if we already have a display method?
//2.  i put the files arraylist in the directory, should i put the directories
// array in the same place?
//3. what should i display or search in the File class which implements Component
// if I can only do that using the files arrayList which is in the directory
//4. why does the search method work if i dont use the iterator? What is
// the iterator for then?
//5. Should I construct the directories in the FileTest file or create
// classes that extend directory?
//6. I wanted the search method to throw an exeption if the file im looking
// for is not there but if i throw it in the directory class then i have to
// catch it somewhere right? where?


