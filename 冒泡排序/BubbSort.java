 public class BubbSort
   
{
	public static void main(String[] args) 
	{
	 int intArray[]=new int[]{785,84,65,748,5};
	 for(int i=0;i<intArray.length-1;i++)
		{
	
		System.out.print(intArray[i]+"        ");
	
	}
	 for(int i=0;i<intArray.length;i++)
	 {
		for(int j=0;j<intArray.length-1;j++)
		{
		
         if(intArray[j]>intArray[j+1])
			{
		 
		    int temp=intArray[j];
			intArray[j]=intArray[j+1];
			
            intArray[j+1]=temp;
		 }
		}
	
	
	}
	
	for(int i=0;i<intArray.length;i++)
		{
	
		System.out.print(intArray[i]+" ");
	
	}
	
  }
}
