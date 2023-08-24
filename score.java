//Declare a string variable student_name and a int variable student_score. calculate student division by using student_score variable.
//Student division can be calculated as :
//if student_score>=80, print "A" division
//else if student_score >=60 and <80, print "B" division
//else if student_score>=40 and <60, print "C" division
//else if student_score<40, print "F" division.
public class studentscore {
    public static void main(String[] args){
        String student_name;
        int student_score;
        DivisionCalculator(85);
        Display("Krutika",75);

    }
    public static void DivisionCalculator(int student_score){
        if (student_score>=80){
            System.out.println("A");
        }else if (student_score >=60 && student_score<80){
            System.out.println("B");
        }else if (student_score>=40 && student_score<60) {
            System.out.println("C");
        }else if(student_score<40){
            System.out.println("D");
        }else{
            System.out.println("Fail");
        }
        }
        public static void Display(String Name,int Score){
            System.out.println("Name of the student : "+Name);
            System.out.println("Score of the Student : "+Score);
        }
    }
