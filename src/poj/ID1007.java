package poj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class ID1007
{
	static class Node implements Comparable{
		String str="";
		int id =0;
		static int sortN=0;
		
		Node(String str, int id, int sortN)
		{
			this.str = str;
			this.id = id;
			this.sortN = sortN;
		}
		
		public int compareTo(Object o){
			Node node = (Node)o;
			//��С�Ƚϣ�ȷ���Ⱥ�˳��
			if(Node.sortN ==sortN){
				return node.id<id?1:(node.id==id?0:-1);
			}else
			{
				return node.sortN<sortN?1:-1;
			}
		}
	}
		
		public static int getSortN(String str)
		{//ans ��answer�ļ�д�����
			int len = str.length();
			int ans=0;
			for(int i = 0;i<len;i++)
			{
				for(int j = i+1;j<len;j++)
					if(str.charAt(i)>str.charAt(j))
						ans++;
			}
			return ans;
		}
		
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in );
			sc.nextInt();// ����
			int ncase = sc.nextInt();//case��
			List<Node> list = new ArrayList<Node>();
			//ÿ����һ���ڵ��һ�����,ͬʱ���sortNֵ
			for(int i = 0;i<ncase;i++){
				String str = sc.nextLine();
				list.add(new Node(str,i,getSortN(str)));
				
			}
			
			Collections.sort(list);
			for(Iterator<Node> it = list.iterator(); it.hasNext();){
				System.out.println(it.next().str);
			}
		}
	

}
