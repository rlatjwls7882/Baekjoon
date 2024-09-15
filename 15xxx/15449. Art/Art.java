import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] l = new int[5];
		for(int i=0;i<5;i++) {
			l[i] = Integer.valueOf(st.nextToken());
		}
		Arrays.sort(l);
		
		int cnt=0;
		for(int i=0;i<5;i++) {
			for(int j=i+1;j<5;j++) {
				for(int k=j+1;k<5;k++) {
					if(l[k]<l[i]+l[j]) {
						cnt++;
					}
				}
			}
		}
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
} // end of Main class