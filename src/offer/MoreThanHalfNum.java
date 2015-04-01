package offer;

public class MoreThanHalfNum
{
	//判断输入的数组中出现最多次数的数字有没有超过一半次数
	public static boolean  checkMoreThanHalf(int[] number, int length, int theNumber){
		int times = 0;
		for(int i = 0; i<length; i++)
		{
			if(theNumber == number[i])
				times++;
		}
		boolean isMoreThanHalf = false;
		if(times*2>length)
		{
			isMoreThanHalf = true;
		}
		else 
			isMoreThanHalf =false;
		
		return isMoreThanHalf;
	}
	

	
    public static int moreThanHalfNum(int[] number){
    	int theNumber = number[0] ;
    	int count = 1;//计数 
    
    	for(int i = 1;i<  number.length;i++){//从第二个数开始
    		if(count==0){
    			//被计数的值消耗到0，将theNumber用新值替换掉重新开始
    			theNumber = number[i];
    			count =1;
    		}
    		if(number[i]==theNumber){
    			count++;          //某一个数继续重复，继续加1
    		}else{
    			count--;
    		}
    	}
    	
    	if(checkMoreThanHalf(number,number.length,theNumber)==false)
    	{
    		return 0;          //没有超过一半次数的数时，返回0
    	}
    	
    	return theNumber;
    }
	
    public static void main(String[] args)
	{
		int[] array={1,2,2,1,1,2,2,2,3,3,4};
		System.out.println(moreThanHalfNum(array));
	}
    
}