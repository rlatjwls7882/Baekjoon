import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		
		int average=0;
		int[] piles = new int[N];
		for(int i=0;i<N;i++) {
			piles[i] = Integer.valueOf(br.readLine());
			average += piles[i];
		}
		average /= N;
		
		int move=0;
		for(int i=0;i<N;i++) {
			move += Math.abs(piles[i]-average);
		}
		bw.write(Integer.toString(move/2));
		
		bw.close();
	} // end of main()
} // end of Main class