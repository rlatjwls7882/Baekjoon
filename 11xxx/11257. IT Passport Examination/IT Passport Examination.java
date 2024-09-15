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
		StringTokenizer st;

		int N = Integer.valueOf(bf.readLine());
		
		while(N--!=0) {
			st = new StringTokenizer(bf.readLine());
			int id = Integer.valueOf(st.nextToken());
			int A = Integer.valueOf(st.nextToken());
			int B = Integer.valueOf(st.nextToken());
			int C = Integer.valueOf(st.nextToken());
			int sum = A+B+C;
			
			bw.write(id+" ");
			bw.write(sum+" ");
			
			if(A>=35*0.3&&B>=25*0.3&&C>=40*0.3&&sum>=55)
				bw.write("PASS\n");
			
			else
				bw.write("FAIL\n");
		}
		
		bw.close();
	} // end of main
} // end of main class