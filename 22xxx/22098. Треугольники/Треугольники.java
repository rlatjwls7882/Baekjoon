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
		
		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] length = new int[4];
			for(int i=0;i<length.length;i++) {
				length[i] = Integer.valueOf(st.nextToken());
			}
			Arrays.sort(length);
			
			int[] cnt = new int[3];
			for(int i=0;i<4;i++) {
				for(int j=i+1;j<4;j++) {
					for(int k=j+1;k<4;k++) {
						if(length[k]<length[i]+length[j]) {
							if(length[k]*length[k]==length[i]*length[i]+length[j]*length[j]) {
								cnt[0]++;
							} else if(length[k]*length[k]<length[i]*length[i]+length[j]*length[j]) {
								cnt[1]++;
							} else {
								cnt[2]++;
							}
						}
					}
				}
			}
			
			for(int i=0;i<3;i++) {
				bw.write(cnt[i]+" ");
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class