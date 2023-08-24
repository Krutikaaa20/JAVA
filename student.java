public class student {
    public static void main(String[] args) {
        String Name = "Krutika Naidu";
        int Marks = 100;
        grade(Marks);
        Display(Name,Marks);
    }

    public static void grade(int stud_marks) {
        if (stud_marks <= 100 && stud_marks >= 90) {
            System.out.println("A GRADE");
        }else if (stud_marks <= 90 && stud_marks >= 70) {
            System.out.println("B GRADE");
        }else if (stud_marks <= 70 && stud_marks >= 50) {
            System.out.println("C GRADE");
        }else if (stud_marks <= 50 && stud_marks >= 35) {
            System.out.println("D GRADE");
        }else
            System.out.println("FAIL");
    }
    public static void Display(String Name,int Marks){
        System.out.println("Name of the Student : "+Name);
        System.out.println("Marks Obtained : "+Marks);
    }
}
