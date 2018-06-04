package Bigint;

public class Subtraction implements IOperation{
	
public  String perform(String num1, String num2){
		
		//System.out.print(num1+"\n"+num2+"\n");
		
		String ans="",tmp2;
		
		int num1digit =num1.length(); 
		int num2digit =num2.length();
		
		int now1,now2,tmp;
		int borrow = 0;
		
		String newdigit;
		
		if(num1digit<num2digit){
			int j =num2digit-num1digit;
			
			for(int i =0;i<j;i++)
			{
				num1 = "0"+num1;++num1digit;
			} 
			
		}
		else if(num1digit>num2digit){
			int j =num1digit-num2digit;
			for(int i =0;i<j;i++)
			{
				num2 = "0"+num2;++num2digit;
			}
			
		}
	//------------------------always big-small
		int firstdigit1 =  Character.getNumericValue(num1.charAt(0)),firstdigit2 =  Character.getNumericValue(num2.charAt(0));
		boolean flag = false;
		int flag2=0;
		if(num1.length()<num2.length())flag2=1;
		
		if(num1.length()==num2.length())
				{
					for(int i=0;i<num1.length();i++)
					{
						if(Character.getNumericValue(num1.charAt(i))<Character.getNumericValue(num2.charAt(i))) {flag2=1; break;}
						else if(Character.getNumericValue(num1.charAt(i))>Character.getNumericValue(num2.charAt(i))) {flag2=0; break;}
						else ;
					}
				}
		
		if(flag2 ==1){
			tmp2=num1;num1=num2;num2=tmp2;
			tmp=num1digit;num1digit=num2digit;num2digit=tmp;
			flag = true ;
		} 
		
		
//-------------------------------------------------------		
	//	System.out.println(num1digit+"\n"+num2digit+"\n");

		while(num1digit!=0 && num2digit!=0){
			//System.out.print(num1digit+"\n");
			now1 = Character.getNumericValue(num1.charAt(--num1digit));
			now2 = Character.getNumericValue(num2.charAt(--num2digit));
			
			tmp = now1 - now2 - borrow;
			
			if(tmp<0){borrow = 1;tmp +=10;}
			else borrow = 0;
			
			
			Integer.toString(tmp);
			
			 ans = tmp+ans;
		}
		
		//System.out.println(ans);
		
		if(flag == false)return ans;
		
		else return "-"+ans;
		
		
		
	}

}
