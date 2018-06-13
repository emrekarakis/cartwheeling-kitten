
public class Main {
	
	static Hacker hacker = new Hacker("Emre");
	public static void main(String[] args) {

		someMethod(hacker);
		System.out.println(hacker.getName());
	}
	
	
	public static void someMethod(Hacker hacker){
		hacker = new Hacker("Serkan");
		hacker.setName("Cansu");
		
	}
	
	
}
