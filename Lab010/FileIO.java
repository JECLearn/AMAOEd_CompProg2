package Lab010;

/*
AMAOEd MIS6232 Computer Programming 2 (Java)

Author: J. E. Cunanan
Student No: 2022-0072254

Laboratory Exercise 010
*/

import java.io.File;

public class FileIO {
    public static void main(String[] args) {
        File dir = new File("Lab010/FileIO");
        File[] items = dir.listFiles();

        if (items != null) {
            for (File item : items) {
                if (item.isFile()) {
                    System.out.println(item.getName());
                }
            }
        } else {
            System.out.println("No files found in the directory.");
        }
    }
}
