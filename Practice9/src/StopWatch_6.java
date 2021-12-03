
public class StopWatch_6 {
    private long startTime,endTime;
    
    public StopWatch_6(){
    	startTime=System.currentTimeMillis();
    }
    
    public void start() {
    	this.startTime=System.currentTimeMillis();
    }
    
    public void stop() {
    	this.endTime=System.currentTimeMillis();
    }
    
    public long getElaspsedTime() {
    	return this.endTime-this.startTime;
    }
}
