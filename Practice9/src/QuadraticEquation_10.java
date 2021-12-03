public class QuadraticEquation_10 {
private double a,b,c;
    
    //һ������Ϊa,b,c�Ĺ��췽��
    public QuadraticEquation_10(double a,double b,double c) {
    	this.a=a;
    	this.b=b;
    	this.c=c;
    }
    
    //��ȡa,b,c����������
    public double get_A() {
    	return a;
    }
    
    public double get_B() {
    	return b;
    }
    
    public double get_C() {
    	return c;
    }
    
    //�����б�ʽ
    public double getDiscriminant() {
    	double discriminant=b*b-4*a*c;
    	return discriminant;
    }
    
    //���ص�ʽ��������
    public double getRoot1() {
    	if (getDiscriminant()>=0) {
    		double root1=(-b+Math.sqrt(getDiscriminant()))/(2*a);
    		return root1;
    	}
    	else
    		return 0;
    }
    public double getRoot2() {
    	if (getDiscriminant()>=0) {
    		double root2=(-b-Math.sqrt(getDiscriminant()))/(2*a);
    		return root2;
    	}
    	else
    		return 0;
    }
}
