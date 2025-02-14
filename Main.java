import java.util.Scanner;
public class Main{
    public static void main(String[] args){Scanner Sc =new Scanner(System.in);
        System.out.println("maths");
        float sub1 = Sc.nextFloat();
        System.out.println("english");
        float sub2 = Sc.nextFloat();
        System.out.println("hindi");
        float sub3=Sc.nextFloat();
        System.out.println("sst");
        float sub4 =Sc.nextFloat();
        System.out.println("science");
        float sub5=Sc.nextFloat();
        float sum=sub1+sub2+sub3+sub4+sub5;
        float average=sum*100/500;
        System.out.println("percentage"+average);
        }
}