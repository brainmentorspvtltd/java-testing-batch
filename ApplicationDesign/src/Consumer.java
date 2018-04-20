
public class Consumer {
public static void main(String[] args) {
	IProducer producer = new Producer();
	producer.x();
	//producer.y(10,20);
}
}
