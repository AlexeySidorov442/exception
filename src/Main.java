import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try {
            int a = 30, b = 0;
            int c = a/b;  // cannot divide by zero
            System.out.println ("Result = " + c);

            String s = null; //null value
            System.out.println(s.charAt(0));

            File file = new File("C://file.txt");
            FileReader fr = new FileReader(file);
        }
        catch(ArithmeticException e) {
            System.out.println ("Can't divide a number by 0");
        }
        catch (NullPointerException e){
            System.out.println("NullPointerException...");
        }
        catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }
        finally {
            System.out.println("Anyway program is working");
        }
    }
}