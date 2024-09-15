import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		String[] rank = {"12 1600", "11 894", "11 1327", "10 1311", "9 1004", "9 1178", "9 1357", "8 837", "7 1055", "6 556", "6 773"};
		int N = Integer.valueOf(br.readLine());
		bw.write(rank[N-1]);
		
		bw.close();
	} // end of main()
} // end of Main class