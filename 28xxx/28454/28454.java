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

		int cyear = Integer.valueOf(st.nextToken("-"));
		int cmon = Integer.valueOf(st.nextToken("-"));
		int cday = Integer.valueOf(st.nextToken("-"));
		
		int N = Integer.valueOf(bf.readLine());
		int num = 0;
		
		while(N--!=0) {
			st = new StringTokenizer(bf.readLine());
			
			int nyear = Integer.valueOf(st.nextToken("-"));
			int nmon = Integer.valueOf(st.nextToken("-"));
			int nday = Integer.valueOf(st.nextToken("-"));
			
			if(cyear<nyear) num++;
			else if(cyear==nyear&&cmon<nmon) num++;
			else if(cyear==nyear&&cmon==nmon&&cday<=nday) num++;
			else;
		}
		
		bw.write(num+"");
		bw.close();
	} // end of main
} // end of main class