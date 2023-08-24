//Declare a double variable weightKgs and take input from the user in kilograms. Also,
// Create a method convert(double kgs) and convert the weight to grams and milligrams.
import java.util.Scanner;
public class weight {
    public static void main(String[] args) {
        double weightKgs;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weights in kilograms");
        weightKgs = sc.nextDouble();
        convert(weightKgs);
    }
    public static void convert(double kgs){
        //weight to gms
        double gms = kgs * 1000;
        System.out.println("Weight in Grams : "+gms);
        //weight in milligrams
        double mgms = kgs * 1000000;
        System.out.println("Weight in Milligrams : "+mgms);
    }
}
