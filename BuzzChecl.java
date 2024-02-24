import java.util.Scanner;
class BuzzChecl{
   public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    String ans=(a>99 ||a<9)?("Invalid Number"):(a%10==7|| a%77==0?("Buzz Number"):("Not Buzz Number"));
    System.out.println(ans);
    sc.close();
  }
}
  /* compile time =success
     runtime =success
     output:78
            Not Buzz Number*/
