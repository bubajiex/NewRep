package Les3;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
// пункт 1
////        File file = new File("123/4");
////        file.mkdir();
//
        // замерил время

//    long t = System.currentTimeMillis();
//    try (FileInputStream in = new FileInputStream("123/1.txt")){
//
//         byte [] arr = new byte[50];
//        int x;
//        while ( ( x = in.read(arr)) != -1){
//            System.out.println(new String(arr,0,x));
//        }
//        System.out.println(System.currentTimeMillis() - t);
//    }
//
//    catch (FileNotFoundException e) {
//        e.printStackTrace();
//    } catch (IOException e) {
//        e.printStackTrace();
//    }


        // пункт 2
        ArrayList<InputStream> al = new ArrayList<>();

        try {
            al.add(new FileInputStream("123/1.txt"));
            al.add(new FileInputStream("123/2.txt"));
            al.add(new FileInputStream("123/3.txt"));
            al.add(new FileInputStream("123/4.txt"));
            al.add(new FileInputStream("123/5.txt"));

            SequenceInputStream in = new SequenceInputStream(Collections.enumeration(al));

            int x;
            while ((x = in.read()) != -1) {

                System.out.print((char) x);


            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
