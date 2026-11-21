import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while(true) {
			String string = br.readLine();
			if(string==null) break;
            
			cantor(Integer.valueOf(string));
			sb.append('\n');
		}
		
		bw.write(sb.toString());
		
		bw.close();
	} // end of main
	
	/* 
	 * 0 : (0)
	 * 1 : 0 (1 0)
	 * 2 : 0 1 0 (2 0 1 0)
	 * 3 : 0 1 0 2 0 1 0 (3 0 1 0 2 0 1 0)
	 */
	
	static void cantor(int N) {
		for(int i=0;i<=N;i++) {
			
			if(i==0) {
				sb.append('-');
			} else {
				for(int j=0;j<Math.pow(3, i-1);j++)
					sb.append(' ');
				cantor(i-1);
			}
		}
	} // end of cantor
} // end of Main class