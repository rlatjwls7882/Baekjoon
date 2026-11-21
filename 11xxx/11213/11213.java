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
		
		int N = Integer.valueOf(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] idx = new int[6];
		int[] dice = new int[6];
		for(int i=1;i<=N;i++) {
			int tmp = Integer.valueOf(st.nextToken())-1;
			dice[tmp]++;
			idx[tmp]=i;
		}
		
		int num=-1;
		for(int i=5;i>=0;i--) {
			if(dice[i]==1) {
				num=i;
				break;
			}
		}
		
		if(num==-1) {
			bw.write("none");
		} else {
			bw.write(Integer.toString(idx[num]));
		}
		
		bw.close();
	} // end of main()
} // end of Main class