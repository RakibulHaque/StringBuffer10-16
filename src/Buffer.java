
public class Buffer {

	public static void main(String[] args)
	{
		StringBuffer word = new StringBuffer("SUNCoLtd");
		int length = word.length();
		int capacity = word.capacity();
		
		System.out.println("length: "+length);
		
		System.out.println("capacity: "+capacity);
		
		
	}
}
