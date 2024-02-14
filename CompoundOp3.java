class CompoundOp3{
public static void main(String []args){

double age1=2.5;
int age= 10;
/*
age=age*age1;
System.out.println(age);//compile time error
*/
age*=age1;
System.out.println(age);//12

}
}