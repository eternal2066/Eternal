public class BUbbleSort
 
{
	public static void main(String[] args) 
	{
		int i,j;
		int intArray[]={235,-65,70,35,97};//����һ�����鲢��ʼ��
		int len=intArray.length;//������ĳ��ȸ�ֵ��len
		for(i=0;i<len;i++)
        System.out.println(intArray[i]+" ");//�������ǰ������
       System.out.println();
	   //����
	   for(i=0;i<len-1;i++)//���ѭ��
		   for(j=i+1;j<len;j++)//�ڳ�ѭ��
		   if(intArray[i]>intArray[j])//�Ƚϴ�С
		{
	      int t=intArray[i];
		  intArray[i]=intArray[j];
		  intArray[j]=t;//�������λ��
	   }
	   //�������������
	   for(i=0;i<len;i++)
		System.out.println(intArray[i]+"  ");//�������
	}
}
