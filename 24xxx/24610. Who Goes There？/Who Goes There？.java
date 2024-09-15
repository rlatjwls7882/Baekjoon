import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int m = Integer.valueOf(st.nextToken());
		
		int[] teams = new int[m];
		for(int i=0;i<m;i++) {
			teams[i] = Integer.valueOf(br.readLine());
		}
		
		int[] invite = new int[m];
		
		int chk=0;
		for(int i=0;n>0&&chk!=m;i++) {
			if(i>=m) {
				i%=m;
				chk=0;
			}
			
			if(teams[i]>invite[i]) {
				invite[i]++;
				n--;
			} else {
				chk++;
			}
		}
		
		for(int i=0;i<m;i++) {
			bw.write(invite[i]+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class