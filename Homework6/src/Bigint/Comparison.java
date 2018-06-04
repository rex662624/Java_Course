package Bigint;

public class Comparison implements IOperation{
	
	public  String perform(String num1, String num2){
		
		int flag1 ,flag2;
		String now1,now2;
		
		if(num1.equals(num2))return "0";
		
		if(num1.charAt(0)=='-'&&num2.charAt(0)!='-')return "-1";
		else if(num1.charAt(0)!='-'&&num2.charAt(0)=='-')return "1";
		else if(num1.charAt(0)=='-'&&num2.charAt(0)=='-'){flag1 = 1;now1 = num1.substring(1);now2 = num2.substring(1);}
		else {flag1 = 0;now1 = num1;now2 = num2;}
//---------------------above:sign below:number----------------------------------------------
		flag2 = number(now1,now2);
		
		if(flag1==1&&flag2==1)return "-1";//negative and n1>n2 => num1<num2
		else if	(flag1==1&&flag2==-1)return "1";//negative and n1<n2 =>num1>num2
		else if (flag1==0&&flag2==-1)return "-1";//positive and n1<n2 =>num1<num2
		else if (flag1==0&&flag2==1)return "1";//positive and n1>n2 =>num1>num2
		else return "0";//none
		
		
		
	}
	
	public static int number(String n1,String n2){
		
		if(n1.length()<n2.length())return -1 ;
		else if(n1.length()>n2.length())return 1 ;
		
		for(int i=0;i<n1.length();i++)
		{
			if(Character.getNumericValue(n1.charAt(i))<Character.getNumericValue(n2.charAt(i))) return -1;
			else if(Character.getNumericValue(n2.charAt(i))<Character.getNumericValue(n1.charAt(i))) return 1;
			else ;
		}
		
		return 0;//none
		
	}

}
