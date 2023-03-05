package practice;

public class arm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int org=153;
		int a=0;
		
		for(int i=org;i>0;i=i/10)
		{
			int A1=i%10;
			a=a+A1*A1*A1;
		}
System.out.println(a);
	}

}
