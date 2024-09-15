import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			char firstChar = st.nextToken().toUpperCase().charAt(0);
			if(firstChar=='*') {
				break;
			}
			
			// 문장이 Tautogram인지 확인
			boolean isTautogram=true;
			
			while(st.hasMoreTokens()) {
				if(firstChar!=st.nextToken().toUpperCase().charAt(0)) {
					isTautogram=false;
					break;
				}
			}
			
			bw.write(isTautogram?"Y\n":"N\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class