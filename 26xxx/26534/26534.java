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
		int[] dice1 = new int[6];
		for(int i=0;i<6;i++) {
			dice1[i] = Integer.valueOf(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		int[] dice2 = new int[6];
		for(int i=0;i<6;i++) {
			dice2[i] = Integer.valueOf(st.nextToken());
		}
		
		int win1=0, win2=0;
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(dice1[i]>dice2[j]) {
					win1++;
				} else if(dice1[i]<dice2[j]) {
					win2++;
				}
			}
		}
		
		if(win1+win2==0) {
			bw.write("0.00000");
		} else {
			bw.write(String.format("%.05f", win1/(double)(win1+win2)));
		}
		
		bw.close();
	} // end of main()
} // end of Main class