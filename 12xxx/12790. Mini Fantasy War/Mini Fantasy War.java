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
			int HP = Integer.valueOf(st.nextToken());
			int MP = Integer.valueOf(st.nextToken());
			int ATT = Integer.valueOf(st.nextToken());
			int DEF = Integer.valueOf(st.nextToken());
			
			HP += Integer.valueOf(st.nextToken());
			MP += Integer.valueOf(st.nextToken());
			ATT += Integer.valueOf(st.nextToken());
			DEF += Integer.valueOf(st.nextToken());
			
			if(HP<1) HP=1; if(MP<1) MP=1;
			if(ATT<0) ATT=0;
			
			bw.write(HP+MP*5+ATT*2+DEF*2+"\n");
		}
		
		bw.close();
	} // end of main
} // end of main class