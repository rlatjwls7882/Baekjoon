import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String string = "";
		
		while((string = bf.readLine())!=null) {
			StringTokenizer st = new StringTokenizer(string);
			int num0=0, num1=0;
			
			while(st.hasMoreTokens()) {
				int n = Integer.valueOf(st.nextToken());
				if(n==0) num0++;
				else num1++;
			}
			if(num0==0) bw.write("E\n"); //모
			else if(num0==1) bw.write("A\n"); //도
			else if(num0==2) bw.write("B\n"); //개
			else if(num1==1) bw.write("C\n"); //걸
			else bw.write("D\n"); //윷
		}
		
		bw.close();
	} // end of main
} // end of main class