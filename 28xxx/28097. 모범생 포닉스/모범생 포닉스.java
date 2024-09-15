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
		st = new StringTokenizer(bf.readLine());
		int day=0, hour=0;
		
		while(true) {
			hour += Integer.valueOf(st.nextToken());
			
			while(hour>23) {
				hour-=24;
				day+=1;
			}
			
			if(--N==0) break;
			
			hour+=8;
		} //end of while N
		
		bw.write(day+" "+hour);
		bw.close();
	} // end of main
} // end of main class