package piglatin;

public class piglatin {
public static void main( String[] args){
		

		for(int i=0;i<args.length;i++)
		{
		
			if(args[i].charAt(0)=='a'||args[i].charAt(0)=='e'
					||args[i].charAt(0)=='i'||args[i].charAt(0)=='o'||args[i].charAt(0)=='u')
			{
				if(args[i].length()==1)
				System.out.print(args[i].toUpperCase()+"ay");
				
				else	System.out.print(args[i].substring(0,1).toUpperCase()
						+args[i].substring(1)+"ay");
					
			}
			else
				
			{
				if(args[i].length()==1)
					System.out.print(args[i].toUpperCase()+"ay");
				else
				System.out.print(args[i].substring(1,2).toUpperCase()
						+args[i].substring(2)+args[i].substring(0, 1)+"ay");
			}
			
			if(i<args.length-1)System.out.print(" ");
		}
		
		
	} 

}
