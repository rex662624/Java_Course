package Bigint;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		
		String formula_before = keyboard.nextLine(); 
		
		String[] formula = formula_before.split(" ");
		
		
		/*for (int i = 0; i < formula.length; i++)
		System.out.print(formula[i]+" ");System.out.print("\n");
		*/
		
		IOperation add = new Addition();
		IOperation sub = new Subtraction();
		IOperation com = new Comparison();
		
		String num1=formula[0],num2=formula[2];
		
		String ansnow=formula[0];
		
		//System.out.print("add:"+compute(add,num1,num2)+"\n");
		//System.out.print("sub:"+compute(sub,num1,num2)+"\n");
		//System.out.println("compare:"+compute(com,num1,num2)+"\n");
		//System.out.print("leng:"+formula.length+"\n");
		
		if(formula[1].equals(">")||formula[1].equals("<")||formula[1].equals("="))
		{
			if(formula[1].equals(">")){
				if(compute(com,num1,num2).equals("1"))System.out.print("true");else System.out.print("false"); 
			}
			else if(formula[1].equals("<")){
				if(compute(com,num1,num2).equals("-1"))System.out.print("true");else System.out.print("false");
			}
			else {
				if(compute(com,num1,num2).equals("0"))System.out.print("true");else System.out.print("false");
			}
		}
		
		else
		{
			for(int i=2;i<=formula.length;i+=2){
				String operator = formula[i-1];
				String n2 =formula[i];
				
				if(operator.equals("+")){
					
					if(ansnow.charAt(0)=='-'&&n2.charAt(0)!='-')ansnow = compute(sub,n2,ansnow.substring(1));//- + +
					else if (ansnow.charAt(0)!='-'&&n2.charAt(0)=='-')ansnow = compute(sub,ansnow,n2.substring(1));//+ + -
					else if(ansnow.charAt(0)!='-'&&n2.charAt(0)!='-')ansnow = compute(add,ansnow,n2);//+ + +
					else if(ansnow.charAt(0)=='-'&&n2.charAt(0)=='-')ansnow = "-"+compute(add,ansnow.substring(1),n2.substring(1));//- + -
				}
				else{
					
					if(ansnow.charAt(0)=='-'&&n2.charAt(0)!='-')ansnow = "-"+compute(add,ansnow.substring(1),n2);//- - +
					else if (ansnow.charAt(0)!='-'&&n2.charAt(0)=='-')ansnow = compute(add,ansnow,n2.substring(1));//+ - -
					else if(ansnow.charAt(0)!='-'&&n2.charAt(0)!='-')ansnow = compute(sub,ansnow,n2);//+ - +
					else if(ansnow.charAt(0)=='-'&&n2.charAt(0)=='-')ansnow = compute(sub,n2.substring(1),ansnow.substring(1));//- - -
				}
				
				
			}			
			
			if(ansnow.charAt(0)=='-'){
				while(ansnow.length()>2&&ansnow.charAt(1)=='0')
					ansnow="-"+ansnow.substring(2);
			}
			else {
				while(ansnow.length()>1&&ansnow.charAt(0)=='0')
					ansnow=ansnow.substring(1);
			}
			
			System.out.print(ansnow);
		}
		
		
	}

	public static String compute(IOperation type, String num1, String num2) {
		return type.perform(num1, num2);

	}

}
