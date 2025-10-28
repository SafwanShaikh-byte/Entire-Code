package String;

public class StringFormatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name = "John";
        int age = 30;
        double score = 95.6789;
        
        String formatted = String.format("Name: %s | Age: %d | Score: %.2f", name, age, score);
        System.out.println(formatted);
        
        // Using printf
        System.out.printf("Hex of 255: %x%n", 255);
	}

}
