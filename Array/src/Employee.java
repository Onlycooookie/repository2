public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] time = {
                {2,4,3,4,5,8,8},
                {7,3,4,3,3,4,4},
                {3,3,4,3,3,2,2},
                {9,3,4,7,3,4,1},
                {3,5,4,3,6,3,8},
                {3,4,4,6,3,4,4},
                {3,7,4,8,3,8,4},
                {6,3,5,9,2,7,9}
        };
        int[] employee = new int[8];
        int[] flag = new int[8];
        
        for (int i=0;i<8;i++) {
            for (int j=0;j<7;j++) {
                employee[i]+=time[i][j];
            }
            flag[i]=i;
        }
        
        //Ñ¡ÔñÅÅÐò½øÐÐ½µÐòÅÅÐò
        int temp;
        for (int i=0;i<7;i++){
            int maxposition=i;
            for (int j=i+1;j<8;j++){
                if (employee[j]>employee[maxposition]) {
                	maxposition=j;
                }
            }
            temp = employee[i];
            employee[i] = employee[maxposition];
            employee[maxposition] = temp;
            
            temp = flag[i];
            flag[i] = flag[maxposition];
            flag[maxposition] = temp;
	    }
        
        for (int i=0;i<8;i++){
            System.out.println("Employee" + flag[i] + "'s total time is " + employee[i]);
        }
	}
}
