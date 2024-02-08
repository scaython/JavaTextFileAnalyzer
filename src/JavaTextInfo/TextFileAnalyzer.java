package JavaTextInfo;

public class TextFileAnalyzer {


	public static void main(String[] args) {
		
		TxtAnalyzer analyzer = new TxtAnalyzer();
		analyzer.info("/Users/e/Desktop/op_systems/operating-systems-java/src/JavaTextInfo/testdata");

		System.out.println(analyzer.info("/Users/e/Desktop/op_systems/operating-systems-java/src/JavaTextInfo/testdata"));
	}

}
