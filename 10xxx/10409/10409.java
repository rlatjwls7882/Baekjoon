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
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int n = Integer.valueOf(st.nextToken());
		int T = Integer.valueOf(st.nextToken());
		int WorkNum=0;
		st = new StringTokenizer(bf.readLine());
		
		while(n--!=0&&T>=0) {
			T -= Integer.valueOf(st.nextToken());
			
			if(T>=0)
				WorkNum++;
		} // end of while(n--!=0)
		
		bw.write(WorkNum+"");
		bw.close();
	} // end of main
} // end of main class