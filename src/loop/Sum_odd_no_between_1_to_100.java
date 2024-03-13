package loop;

public class Sum_odd_no_between_1_to_100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1; i<=100; i++)
			
		{
			if(i%2!=0)
				
				sum+=i;
		}
			
			System.out.print(sum+ " ");
		
	}

}
