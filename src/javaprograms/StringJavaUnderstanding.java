package javaprograms;

public class StringJavaUnderstanding {
	public static void main(String[] args) {
		String s="welcome";
		String s1="WELCOME";
		//char charac=s.charAt(6);
		//System.out.println(charac);
		//int index=s.indexOf('w');
		//System.out.println(index);
		//boolean equals = s.equals(s1);
		//System.out.println(equals);
		//int compareTo = s.compareTo(s1);
		//System.out.println(compareTo);
		//int lastIndexOf=s.lastIndexOf('e');
		//System.out.println(lastIndexOf);
		//boolean sw = s.startsWith(s1);
		//System.out.println(sw);
		//boolean ew=s.endsWith(s1);
		//System.out.println(ew);
		//boolean isE=s.isEmpty();
		//System.out.println(isE);
		//boolean con=s.contains("wel");
		//System.out.println(con);
		//String trm=s.trim();
		//System.out.println(trm);
		//int length=s.length();
		//System.out.println(length);
		//String substr=s.substring(6);
		//System.out.println(substr);
		//String substr1=s.substring(0, 4);
		//System.out.println(substr1);
		//String rep=s.replace("e","k");
		//System.out.println(rep);
		//String repAll=s.replaceAll("e","z");
		//System.out.println(repAll);
		//String upc=s.toUpperCase();
		//System.out.println(upc);
		//String lwc=s1.toLowerCase();
		//System.out.println(lwc);
		boolean ignorecase=s.equalsIgnoreCase(s1);
		System.out.println(ignorecase);
		
		
		

	}

}
