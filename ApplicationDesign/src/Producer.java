
public class Producer implements IProducer{
public void x(){
	System.out.println("I am Expose to All Consumers...");
}
public void y(int x, int y){
	System.out.println("not Expose to Consumers "+(x+y));
}
}
