package logical_programs;

public class Reverse_Array {

	public static void main(String[] args) {
		
		int a[]= {12,76,34,98};
		
		for(int i=0; i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}
		for(int i=0; i<(a.length/2); i++)
		{
			int c=a[i];
			a[i]=a[(a.length-1)-i];//a[i]=a[LastIndex-i]
			a[(a.length-1)-i]=c;
			
		}

		System.out.println();
		for(int i=0; i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}
	}

}
