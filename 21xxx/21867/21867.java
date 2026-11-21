import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		String string = br.readLine();
		
		// JAVA Bitecode 계산
		StringBuilder JavaBitecode = new StringBuilder();
		
		for(int i=0;i<N;i++) {
			if(string.charAt(i)!='J'&&string.charAt(i)!='A'&&string.charAt(i)!='V') {
				JavaBitecode.append(string.charAt(i));
			}
		}
		
		if(JavaBitecode.isEmpty()) {
			bw.write("nojava");
		} else {
			bw.write(JavaBitecode.toString());
		}
		
		bw.close();
	} // end of main()
} // end of Main class