import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int n = Integer.valueOf(br.readLine());
		while(n-->0) {
			String pronounced = br.readLine();
			
			int w = Integer.valueOf(br.readLine());
			String replace="";
			int minCnt=129;
			
			while(w-->0) {
				String string = br.readLine();
				
				int cnt=0;
				for(int i=0;i<string.length();i++) {
					if(pronounced.charAt(i)!=string.charAt(i)) {
						cnt++;
					}
				}
				
				if(cnt<minCnt) {
					replace=string;
					minCnt=cnt;
				}
			}
			bw.write(replace+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class