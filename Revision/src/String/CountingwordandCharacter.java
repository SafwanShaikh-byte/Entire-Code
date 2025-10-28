package String;

public class CountingwordandCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Java Selenium Automation";
        String[] words = s.split("\\s+");
        int charCount = s.replace(" ", "").length();

        System.out.println("Words: " + words.length);
        System.out.println("Characters (excluding spaces): " + charCount);

	}

}
