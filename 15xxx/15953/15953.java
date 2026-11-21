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
		
		int T = Integer.valueOf(bf.readLine());
		
		while(T--!=0) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int A = Integer.valueOf(st.nextToken());
			int B = Integer.valueOf(st.nextToken());
			int totalGet=0;
			
			if(A==0);
			else if(A<=1)
				totalGet+=5000000;
			else if(A<=3)
				totalGet+=3000000;
			else if(A<=6)
				totalGet+=2000000;
			else if(A<=10)
				totalGet+=500000;
			else if(A<=15)
				totalGet+=300000;
			else if(A<=21)
				totalGet+=100000;
			
			if(B==0);
			else if(B<=1)
				totalGet+=5120000;
			else if(B<=3)
				totalGet+=2560000;
			else if(B<=7)
				totalGet+=1280000;
			else if(B<=15)
				totalGet+=640000;
			else if(B<=31)
				totalGet+=320000;
			
			bw.write(totalGet+"\n");
		}
		
		bw.close();
	} // end of main
} // end of main class