package offer;

import java.util.Scanner;

//��ά�����еĲ���
public class ID03
{
//	public static int[] search(int[][] a,int number){
//		int[] result=new int[3];
//		int flag = 0; //δ�ҵ���־λ��Ϊ0
//		int col = a[0].length-1, row = 0;//
//		while(flag==0){
//			if(a[row][col]==number){
//				flag =1;
//			}else if(a[row][col]>number){
//				col--;//���������
//			}else
//			{
//				row++;//���±�����
//			}
//		}
//		result[0] = flag;
//		result[1] = row + 1;
//		result[2] = col + 1;
//		
//		
//		return result;
//	}
	
	//�ڶ��棬û�п��ǵ��������ֱ�Ӹ����к��У�����Ӧ�ö��к��м�������������ֹ����Խ������
	public static int[] search(int[][] a, int rows,int columns,int number){
		int[] result = new int[3];//����flag�������ҵ����к��к�
		int flag = 0;//δ�ҵ�ʱ�ĸ�ֵ
		if(a!=null && rows > 0&& columns > 0){
			int row = 0;
			int column = columns -1; //��λ�����Ͻ�
			while(row < rows && column >=0)  //���������ս���
			{
				if(a[row][column]== number){
					flag = 1;
					break;
				}else if(a[row][column] > number)
				{
					column--;//�����
				}else
				{
					row++;//������
				}
			}
			result[0] = flag;
			result[1] = row+1;
			result[2] = column +1;
		}
		
		return result;
		
		
	}
	
	public static void main(String[] args)
	{
		int[] result = new int[3];
		int n = 0;
		int[][] array ={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		result = search(array,4,4,n);
		if(result[0]==1){
			System.out.println("Yes,Find it!");
			System.out.println("the position is in row: " + result[1] +" col:" +result[2]);
		}
		else
			System.out.println(" Not exit");
		
	}
	
	
	
	

}
