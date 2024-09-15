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
		int[] num = new int[3];
		for(int i=0;i<3;i++) {
			num[i] = Integer.valueOf(st.nextToken());
		}
		Arrays.sort(num);
		int x = Integer.valueOf(br.readLine());
		
		int idx=1;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<3;k++) {
					if(i!=j&&j!=k&&i!=k) {
						if(num[i]*100+num[j]*10+num[k]==x) {
							bw.write(idx+"");
						} else {
							idx++;
						}
					}
				}
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class