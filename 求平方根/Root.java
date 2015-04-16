import java.io.*;
public class Root 
{
	public static void main(String[] args) 
	{
		float a,b;
		float x;
		String str1=" ";
		String str2=" ";
		int i=3;
		//InputStreamReader ist= new  InputStreamReader(System.in);
		try
		{
		BufferedReader input1=new BufferedReader(new  InputStreamReader(System.in));
		str1=input1.readLine();
		BufferedReader input2=new BufferedReader(new  InputStreamReader(System.in));
		str2=input2.readLine();
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
		
		a=Float.parseFloat(str1);
        b=Float.parseFloat(str2);
		//if(Math.abs(a)>0.000001)
         if(a!=0)
		{
		x=-b/a;
		System.out.println("x="+x);
		}
		
	}
}
