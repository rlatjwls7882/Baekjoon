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
		
		int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
		boolean[] line = new boolean[101];
		for(int i=0;i<3;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.valueOf(st.nextToken());
			int y = Integer.valueOf(st.nextToken());
			min = Math.min(min, y-x);
			max = Math.max(max, y-x);
			while(x<y) {
				line[x++]=true;
			}
		}
		
		boolean chk=false;
		int cnt=0;
		for(int i=0;i<=100;i++) {
			if(line[i]) {
				if(!chk) {
					cnt++;
				}
				chk=true;
			} else {
				chk=false;
			}
		}
		bw.write(cnt+"\n"+min+" "+max);
		
		bw.close();
	} // end of main()
} // end of Main class