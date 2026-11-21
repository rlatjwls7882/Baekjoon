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
			
			int N = Integer.valueOf(bf.readLine());
			int P1=0, P2=0;
			
			while(N--!=0) {
				
				StringTokenizer st = new StringTokenizer(bf.readLine());
				String C1 = st.nextToken();
				String C2 = st.nextToken();
				
				if((C1.equals("R")&&C2.equals("S"))||(C1.equals("S")&&C2.equals("P"))||(C1.equals("P")&&C2.equals("R")))
					P1++;
				else if((C1.equals("R")&&C2.equals("P"))||(C1.equals("S")&&C2.equals("R"))||(C1.equals("P")&&C2.equals("S")))
					P2++;
			} // end of while(N--!=0)
			
			if(P1>P2)
				bw.write("Player 1\n");
			else if(P2>P1)
				bw.write("Player 2\n");
			else
				bw.write("TIE\n");
			
		} // end of while(T--!=0)
		
		bw.close();
	} // end of main
} // end of main class