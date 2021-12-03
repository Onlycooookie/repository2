public class LinearEquation_11 {
    private double a,b,c,d,e,f;
    
    //一个参数为a,b,c的构造方法
    public LinearEquation_11(double a,double b,double c,double d,double e,double f) {
    	this.a=a;
    	this.b=b;
    	this.c=c;
    	this.d=d;
    	this.e=e;
    	this.f=f;
    }
    
    //获取a,b,c,d,e,f的三个方法
    public double get_A() {
    	return a;
    }
    public double get_B() {
    	return b;
    }
    public double get_C() {
    	return c;
    }
    public double get_D() {
    	return d;
    }
    public double get_E() {
    	return e;
    }
    public double get_F() {
    	return f;
    }
    
    //判别a*d-b*c
    public boolean isSolvable() {
    	if (a*d==b*c)
    		return false;
    	else
    		return true;
    }
    
    //返回方程解
    public double getX() {
    	double x=(e*d-b*f)/(a*d-b*c);
    	return x;
    }
    public double getY() {
    	double y=(a*f-e*c)/(a*d-b*c);
    	return y;
    }
    
}
