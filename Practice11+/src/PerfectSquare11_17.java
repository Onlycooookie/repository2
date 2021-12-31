import java.util.ArrayList;
import java.util.Scanner;
public class PerfectSquare11_17 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("Enter an integer m:");
		int m=input.nextInt();
		int n,M=m;
		ArrayList<Integer> list=new ArrayList<Integer>();
			
		//找出m的所有约数(1和m除外)
		for(int i=2;m>1;i++){
			if(m%i==0){
				list.add(i);
				m=m/i;
				i=1;
			}
		}
		n=cfcs(list);
		System.out.println("The smallest number n for m*n to be a perfect square is "+n);
		System.out.println("m*n is "+M*n);
			
	}
		
	public static int cfcs(ArrayList<Integer> list){
		int mul=1;
		@SuppressWarnings("unused")
		ArrayList<Integer> List=new ArrayList<Integer>();
			
		//将m的约数集筛选，把偶数次的数据都去除，奇数次的数据只留一个
		for(int i=0;i<list.size();i++){
			for(int j=i+1;j<list.size();j++){
				if(list.get(i)==list.get(j)){
					list.remove(j);
					list.remove(i);
					j--;
				}
				else
					continue;
			}
		}
		//把奇数次的数据相乘得n
		for(int i=0;i<list.size();i++){
			mul*=list.get(i);
		}
		return mul;
	}
}