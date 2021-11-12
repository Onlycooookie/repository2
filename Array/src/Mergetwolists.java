import java.util.Scanner;
public class Mergetwolists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("Enter list1 size and contents:");
		int a[]=new int[20];
		int b[]=new int[20];
		a[0]=input.nextInt();
		int len1=a[0];
		for (int i=1;i<len1+1;i++) {
			a[i]=input.nextInt();
		}
		System.out.print("Enter list2 size and contents:");
		b[0]=input.nextInt();
		int len2=b[0];
		for (int i=1;i<len2+1;i++) {
			b[i]=input.nextInt();
		}
		
		System.out.print("list1 is:");
		for (int i=1;i<len1+1;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("\n");
		System.out.print("list2 is:");
		for (int i=1;i<len2+1;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.print("\n");
		System.out.print("The merge list is:");
		int c[]=merge(a,b);
		for (int i=0;i<len1+len2;i++) {
			System.out.print(c[i]+" ");
		}
	}
	//归并函数
	public static int[] merge(int[] list1,int[] list2) {
		int len1=list1[0];
		int len2=list2[0];
		int result[]=new int[len1+len2];
		int l1=1,l2=1,l3=0;//由于list[0]为元素个数，所以l1、l2要从1开始
		while(l1<=len1 && l2<=len2) {
			if (list1[l1]<list2[l2])
				result[l3++]=list1[l1++];
			else
				result[l3++]=list2[l2++];
		}
		while(l1<=len1) {
			result[l3++]=list1[l1++];
		}
		while(l2<=len2) {
			result[l3++]=list2[l2++];
		}
		return result;
	}
}
