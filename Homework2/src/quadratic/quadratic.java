package quadratic;
import java.util.Scanner;
import java.lang.Math; 
import java.text.DecimalFormat;

public class quadratic {
	
	public static void main(String[] args){ 
	
	Scanner keyboard =new Scanner(System.in);
	
	double a = keyboard.nextDouble(); 
	double b = keyboard.nextDouble();
	double c = keyboard.nextDouble();
	DecimalFormat form=new DecimalFormat(keyboard.next());
	
	double d = (b*b-4*a*c);
	
	double x1=(-b+Math.pow(d,0.5))/(2*a);
	double x2=(-b-Math.pow(d,0.5))/(2*a);
	double ans1,ans2;
	
	if(a>0){
		if(x1>=x2)
		{ans1=x1;ans2=x2;}
		else
		{ans1=x2;ans2=x1;}
		
	}
	else {
		if(x1<=x2)
		{ans1=x1;ans2=x2;}
		else
		{ans1=x2;ans2=x1;}
	}
	
	System.out.println(form.format(ans1));
	System.out.print(form.format(ans2));
	
}

}
