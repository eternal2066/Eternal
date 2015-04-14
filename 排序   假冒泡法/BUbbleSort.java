public class BUbbleSort
 
{
	public static void main(String[] args) 
	{
		int i,j;
		int intArray[]={235,-65,70,35,97};//定义一个数组并初始化
		int len=intArray.length;//把数组的长度赋值给len
		for(i=0;i<len;i++)
        System.out.println(intArray[i]+" ");//输出派序前的数组
       System.out.println();
	   //排序
	   for(i=0;i<len-1;i++)//外城循环
		   for(j=i+1;j<len;j++)//内城循环
		   if(intArray[i]>intArray[j])//比较大小
		{
	      int t=intArray[i];
		  intArray[i]=intArray[j];
		  intArray[j]=t;//如果交换位置
	   }
	   //输出排序后的数组
	   for(i=0;i<len;i++)
		System.out.println(intArray[i]+"  ");//输出数组
	}
}
