import java.util.*;
class SchoolReportCard {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        //Enter the the marks of five subject 
        System.out.println("Enter the subject marks");
        System.out.println("Enter the marks of Physics:");
        int P =sc.nextInt();
        System.out.println("Enter the marks of Maths:");
        int M =sc.nextInt();
        System.out.println("Enter the marks of Geography:");
        int G =sc.nextInt();
        System.out.println("Enter the marks of History:");
        int H =sc.nextInt();
        System.out.println("Enter the marks of Biology:");
        int B =sc.nextInt();

        //Calculate Total marks obtained
        int Total_Marks_Obtained= P+M+G+H+B;
        int Total_Marks =500;

        // calculate Percentage 
        float Per=((Total_Marks_Obtained*100)/500);
       
        //calculate grade using Ternary Operator
        String Grade = (Per <100 && Per>85) ? ("A"):((Per<85 && Per>65) ? ("B"): ((Per<65 && Per>45) ? ("C"):((Per<45 && Per>35)?("E"):("F"))));

        // caluculate remark using ternary Operator 
        String Remarks= (Grade=="A") ? ("Very Good"):((Grade=="B") ?("Good"): ((Grade=="C")? ("Need To Improve"): (Grade=="E") ? ("Work Hard"):("Fail")));
        
        //print report card
        System.out.println("**************************************REPORT CARD****************************************");
        System.out.println();
        System.out.println("                                      k.v.rheSchool");
        System.out.println( );
        System.out.println("                                      Board:SSC");
        System.out.println();
        System.out.println("Name: Prafull Suryawanshi                                 Date:21-02-2024");
        System.out.println();
        System.out.println("Roll No: 4567                             sec:B               Exam:End-sem Exam");
        System.out.println();
        System.out.println("*******************************************************************************************");

        System.out.println("Subject                               Full Marks                        Marks Obtained");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Physics                                  100                                     "+P         );
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Maths                                    100                                     "+M         );
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Geography                                100                                     "+G         );
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("History                                  100                                     "+H         );
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Biology                                  100                                     "+B         );
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Total:500                                                        Total Marks Obtained:"+Total_Marks_Obtained);
        System.out.println();
        System.out.println("Percentage:"+Per +"                                                  Grade:"+Grade );
        System.out.println();
        System.out.println("Remarks:"+Remarks +"                                                     Sign:");
        System.out.println();
        System.out.println("******************************************************************************************");
    }
    
}
/*output=compiletime =success
         Runtime =Sucess
         o/pEnter the subject marks
Enter the marks of Physics:
78
Enter the marks of Maths:
97
Enter the marks of Geography:
67
Enter the marks of History:
78
Enter the marks of Biology:
89
**************************************REPORT CARD****************************************

                                      k.v.rheSchool

                                      Board:SSC

Name: Prafull Suryawanshi                                 Date:21-02-2024

Roll No: 4567                             sec:B               Exam:End-sem Exam

*******************************************************************************************
Subject                               Full Marks                        Marks Obtained
------------------------------------------------------------------------------------------
Physics                                  100                                     78
------------------------------------------------------------------------------------------
Maths                                    100                                     97
------------------------------------------------------------------------------------------
Geography                                100                                     67
-------------------------------------------------------------------------------------------
History                                  100                                     78
-------------------------------------------------------------------------------------------
Biology                                  100                                     89
-------------------------------------------------------------------------------------------

Total:500                                                        Total Marks Obtained:409

Percentage:81.0                                                  Grade:B

Remarks:Good                                                     Sign:

******************************************************************************************


