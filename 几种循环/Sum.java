public class Sum  
{
	public static void main(String[] args) 
	{    //for—≠ª∑
		/*int Sum=0,i=1;
		for(i=1;i<=100;i++)
			Sum+=i;
		
		
		}
		System.out.println("1+2+3...+100="+Sum);*/ 
       //while—≠ª∑
		/*int	Sum=0;
		 int  i=1;
		while(i<=100)
		{
		  Sum=Sum+i;
		  i=i+1;


		}
		System.out.println("1+2+3...+100="+Sum);*/


		//do..while—≠ª∑
		int Sum=0;
		int i=1;
		do
		{
			Sum=Sum+i;
			i=i+1;
		}
		while (i<101);
		
        System.out.println("1+2+3...+100="+Sum);
		
	}
}
