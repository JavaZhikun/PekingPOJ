package poj;

import java.math.BigDecimal;
import java.util.Scanner;




public class ID1001
{
	public static void main(String[] args)throws Exception
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			BigDecimal R = sc.nextBigDecimal();
			int n = sc.nextInt();
			BigDecimal result = R.pow(n);
			String s = result.stripTrailingZeros().toPlainString();
			if(s.startsWith("0."))
			
				s = s.substring(1);
			
			System.out.println(s);
		}
	}
}
	
	
	
	
	
	
	
	
	
	

