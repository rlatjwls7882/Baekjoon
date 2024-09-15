import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int[] card = {0, 0, 4, 4, 4, 4, 4, 4, 4, 4, 16, 4};
		int N = Integer.valueOf(br.readLine());
		
		int sum=0;
		while(N-->0) {
			int pop = Integer.valueOf(br.readLine());
			card[pop]--;
			sum += pop;
		}
		
		int low=0, up=0, remain=21-sum;
		for(int i=2;i<=Math.min(11, remain);i++) {
			low += card[i];
		}
		for(int i=remain+1;i<=11;i++) {
			up += card[i];
		}
		
		if(low>up) {
			bw.write("VUCI");
		} else {
			bw.write("DOSTA");
		}
		
		bw.close();
	} // end of main()
} // end of Main class