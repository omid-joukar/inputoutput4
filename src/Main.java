import java.io.File;

/**
 * Created by KPS on 7/18/2020.
 */
public class Main {
    public static void main(String[] args) {
        File path = new File("d:\\employee.txt");
        System.out.println("we can read  this file: "+path.canRead());
        System.out.println("we can write this file : "+path.canWrite());
    }
}
