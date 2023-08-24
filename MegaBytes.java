//Create a integer variable kiloBytes and take a input from the user in kiloBytes.
// Now, create a method named  printMegaBytes(int kiloBytes) and convert the kiloBytes into MegaBYtes.
//For example, if we divide the Kilobytes by 1024 , It will give the Megabytes(MB).
import java.util.Scanner;

public class megabytes {
    public static void main(String[] args){
        int kiloBytes;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight in kiloBytes");
        kiloBytes = sc.nextInt();
        printMegaBytes(kiloBytes);
    }
    public static void printMegaBytes(int kiloBytes){
        int MegaBytes = kiloBytes/1024;
        System.out.println("MegaBytes : "+MegaBytes);
    }
}
