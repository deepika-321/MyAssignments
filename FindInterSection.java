package week1.day2;

public class FindInterSection {
	
	public static void main(String[] args) {
		
	
	
	int [] number1= {3,2,11,4,6,7};
	int [] number2= {1,2,8,4,9,7};
	int l1=number1.length;
	int l2=number2.length;
	
	for(int i=0;i<l1;i++)
	{
		for(int j=0;j<l2;j++)
		{
			if(number1[i]==number2[j])
			{
				
			 System.out.println(number1[i]);
			}
			
			}
		
	    }
    }
 }


