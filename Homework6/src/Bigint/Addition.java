package Bigint;

public class Addition implements IOperation {

	public  String perform(String num1, String num2){
		
		//System.out.print(num1+"\n"+num2+"\n");
		
		String ans="";
		
		int num1digit =num1.length(); 
		int num2digit =num2.length();
		
		int now1,now2,tmp;
		int carry = 0;
		
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
		
	//	System.out.println(num1digit+"\n"+num2digit+"\n");

		while(num1digit!=0 && num2digit!=0){
			//System.out.print(num1digit+"\n");
			now1 = Character.getNumericValue(num1.charAt(--num1digit));
			now2 = Character.getNumericValue(num2.charAt(--num2digit));
			
			tmp = now1 + now2+carry;
			
			carry = tmp /10;
			tmp =tmp%10;
			
			Integer.toString(tmp);
			
			 ans = tmp+ans;
		}
		
		if(carry==1)return "1"+ans;
		else return ans;
		
		
		
	}

}
