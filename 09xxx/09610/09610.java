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
		int Q1=0, Q2=0, Q3=0, Q4=0, AXIS=0;
		
		while(N--!=0) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int x = Integer.valueOf(st.nextToken());
			int y = Integer.valueOf(st.nextToken());
			
			if(x>0&&y>0)
				Q1++;
			else if(x<0&&y>0)
				Q2++;
			else if(x<0&&y<0)
				Q3++;
			else if(x>0&&y<0)
				Q4++;
			else
				AXIS++;
		}
		
		bw.write("Q1: "+Q1+"\nQ2: "+Q2+"\nQ3: "
		+Q3+"\nQ4: "+Q4+"\nAXIS: "+AXIS);
		
		bw.close();
	} // end of main
} // end of main class