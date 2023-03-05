package practice;

public class revNo {
	public static void main(String[] args) {
		
		int a=138;
		int b=0;
		
		for(int i=138; i>0; i=i/10)
		{
		int	rem=i%10;
		b=b*10+rem;
			
		}
		System.out.println(b);
	}

}
