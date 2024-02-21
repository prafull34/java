public class NarrowingOp
{
public static void main(String[]args)
{
int age=130;
byte age1=(byte)age;
System.out.println(age1);//-126
//the range of byte is -128 to -127 so the values of age will go back to -128 after reaching last 127
//127  128  129  130
//127  -128  -127  -126
}
}
   /*output
     compiletime=success
     runtime=sucess
     o/p= -126*/