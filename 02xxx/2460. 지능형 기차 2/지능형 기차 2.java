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
		int maxnum = 0, currnum = 0;
		
		for(int i=0;i<10;i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			
			currnum+=Integer.valueOf(st.nextToken())*(-1)+Integer.valueOf(st.nextToken());
			
			if(maxnum<currnum) maxnum=currnum;
		}
		
		bw.write(maxnum+"");
		bw.close();
	} // end of main
} // end of main class