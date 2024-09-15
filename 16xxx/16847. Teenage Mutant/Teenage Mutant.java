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
		
		int K = Integer.valueOf(br.readLine());
		for(int i=1;i<=K;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.valueOf(st.nextToken());
			int k = Integer.valueOf(st.nextToken());
			
			char[][] data = new char[n+1][k];
			for(int j=0;j<=n;j++) {
				data[j] = br.readLine().toCharArray();
			}
			
			int cnt=0;
			for(int a=0;a<k;a++) {
				boolean chk=true;
				for(int b=1;b<=n;b++) {
					if(data[0][a]==data[b][a]) {
						chk=false;
						break;
					}
				}
				if(chk) {
					cnt++;
				}
			}
			bw.write("Data Set "+i+":\n"+cnt+"/"+k+"\n\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class