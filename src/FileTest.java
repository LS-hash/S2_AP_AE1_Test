import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class FileTest {
    public static void main(String[] args) {
        File courseworkpdf = new File("courseworkpdf",1);
        File courseworkzip = new File("coursework zip file",2);

        Directory coursework = new Directory("coursework");
        coursework.add(courseworkpdf);
        coursework.add(courseworkzip);

        Directory unittests = new Directory("unit tests");
        File test1 = new File("unit test 1",56);
        unittests.add(test1);

        coursework.add(unittests);
        coursework.remove(courseworkzip);
        System.out.println(courseworkpdf.display("\t"));
        System.out.println(unittests.search("unit test 1"));
//        try{
//            coursework.search("unit test 1");
//        } catch {
//        }

        //  System.out.println( coursework.search("unit test 1").getName());

    }
}

//Test Driver Output
//coursework: (count=2, size=57)
//        courseworkpdf (1)
//        unit tests: (count=1, size=56)
//        unit test 1 (56)
//        unit tests


