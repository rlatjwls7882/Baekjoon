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
		
		int t = Integer.valueOf(br.readLine());
		while(t-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int m = Integer.valueOf(st.nextToken());
			int n = Integer.valueOf(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			int[] color = new int[m];
			int pos=0, dir=0;
			
			for(int i=0;i<m;i++) {
				color[i] = Integer.valueOf(st.nextToken());
				if(color[i]==2) {
					pos=i;
					dir=1;
				} else if(color[i]==3) {
					pos=i;
				}
			}
			
			int cnt=0;
			while(n-->0) {
				if(dir==1) {
					if(pos==m-1) {
						dir=0;
						pos--;
					} else {
						pos++;
					}
				} else {
					if(pos==0) {
						dir=1;
						pos++;
					} else {
						pos--;
					}
				}
				if(color[pos]==0) {
					cnt++;
				}
			}
			bw.write(cnt+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class