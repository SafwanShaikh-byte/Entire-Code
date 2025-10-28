package String;

public class StringBuilderandStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Java");
        sb.append(" Selenium");
        sb.insert(4, " &");
        sb.replace(0, 4, "Automation");
        sb.reverse();
        System.out.println(sb);

        StringBuffer sbuf = new StringBuffer("ThreadSafe");
        sbuf.append(" Buffer");
        System.out.println(sbuf);

	}

}
