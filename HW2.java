/**
 * Created by Qursan on 23/08/22.
 */
import java.util.Scanner;
public class HW_HANAN {
    public static void main(String[] args) {

        // 1
        System.out.println(" 1 /////////////////////////////");
        double f;
        f=4.0*(1-(1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11));
        System.out.println(f);
        System.out.println(" 2 /////////////////////////////");

//2
        System.out.println("enter the Radius: ");
        Scanner in=new Scanner (System.in);
        double radius;
        radius=in.nextDouble();
        double perimeter=2* Math.PI *radius;
        double area = Math.PI * radius * radius;
        System.out.println("perimeter of the circle :"+perimeter );
        System.out.println("area of the circle  : "+area );
        System.out.println(" 3 /////////////////////////////");

//3
        double WIDTH, LENGTH , are,perimete;
        Scanner im=new Scanner(System.in);
        System.out.println("enter the Width: ");
        WIDTH=im.nextDouble();
        System.out.println("enter the Length: ");
        LENGTH=im.nextDouble();
        are=WIDTH * LENGTH;
        perimete= 2*(WIDTH+LENGTH);
        System.out.println("perimeter of the recangle is : "+perimete);
        System.out.println("area of the recangle is : "+are);
        System.out.println(" 4 /////////////////////////////");

//4
        int x,y,q,su,av;
        System.out.println("enter three numbers ");
        Scanner o=new Scanner(System.in);
        x=o.nextInt();
        y=o.nextInt();
        q=o.nextInt();
        su =x+y+q;
        av=su/3;
        System.out.println("the average of these number is: "+av);
        System.out.println(" 5 /////////////////////////////");

//5
        int w,v;
        Scanner u=new Scanner(System.in);
        System.out.println("enter number 1");
        w=u.nextInt();
        System.out.println("enter number 2");
        v=u.nextInt();
        w=w+v;
        v=w-v;
        w=w-v;
        System.out.println("number 1 :"+w);
        System.out.println("number 2 :"+v);
        System.out.println(" 6 /////////////////////////////");

//6
        String s="Hello";
        String t="World";
        System.out.println(s.length()+t.length());
        System.out.println(s.substring(1,2));
        System.out.println(s.substring(s.length()/2,s.length()));
        System.out.println(s+t);
        System.out.println(t+s);
        System.out.println(" 7 /////////////////////////////");

//7
        String name="hanan";
        System.out.println(name.substring(0,1));
        System.out.println(name.substring(4));
        System.out.println(name.substring(1));
        System.out.println(name.substring(0,4));
        System.out.println(" 8 /////////////////////////////");

//8
        int n;
        System.out.println("Enter number: ");
        Scanner is=new Scanner(System.in);
        n=is.nextInt();
        System.out.println("the square is: "+n*n);
        System.out.println("the cube is: "+n*n*n);
        System.out.println("the power is: "+Math.pow(n,4));
        System.out.println(" 9 /////////////////////////////");

//9
        int h,m,sum,avg,difference,prodoct,average,distance;
        System.out.println("enter two numbers ");
        Scanner it=new Scanner(System.in);
        h=it.nextInt();
        m=it.nextInt();
        sum =h+m;
        difference=h-m;
        prodoct=h*m;
        average=sum/2;
        if (difference<0)
            distance  =-(difference);
        else if (difference>=0);
        distance  =(difference);
        System.out.println("the sum of these number is: "+sum);
        System.out.println("the difference of these number is: "+difference);
        System.out.println("the prodoct of these number is: "+prodoct);
        System.out.println("the average of these number is: "+average);
        System.out.println("the distance of these number is: "+(distance ));
        System.out.println("the maximum of these number is: "+ Math.max(h,m));
        System.out.println("the minimum of these number is: "+ Math.min(h,m));
    }
}
