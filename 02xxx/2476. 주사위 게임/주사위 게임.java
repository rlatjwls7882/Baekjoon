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
		
		int N = Integer.valueOf(bf.readLine());
		int maxMoney=0;
		
		while(N--!=0) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int A = Integer.valueOf(st.nextToken());
			int B = Integer.valueOf(st.nextToken());
			int C = Integer.valueOf(st.nextToken());
			int currMoney=0;
			
			if(A==B&&B==C)
				currMoney=10000+1000*A;
			else if(A==B)
				currMoney=1000+100*A;
			else if(A==C)
				currMoney=1000+100*A;
			else if(B==C)
				currMoney=1000+100*B;
			else if(A>=B&&A>=C)
				currMoney=100*A;
			else if(B>=C)
				currMoney=100*B;
			else
				currMoney=100*C;
			
			if(maxMoney<currMoney) maxMoney=currMoney;
		}
		
		bw.write(maxMoney+"");
		bw.close();
	} // end of main
} // end of main class