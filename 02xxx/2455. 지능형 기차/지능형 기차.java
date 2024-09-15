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
		int max=0, people=0;
		
		for(int i=0;i<4;i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			people+= Integer.valueOf(st.nextToken())*(-1) + Integer.valueOf(st.nextToken());
			
			if(max<people) max = people;
		}
		
		bw.write(max+"");
		bw.close();
	} // end of main
} // end of main class