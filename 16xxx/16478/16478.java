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
		double Pab = Double.valueOf(st.nextToken());
		double Pbc = Double.valueOf(st.nextToken());
		double Pcd = Double.valueOf(st.nextToken());
		
		// Pad 계산
		// Pab*Pcd = Pbc*Pad
		bw.write(Double.toString(Pab*Pcd/Pbc));
		
		bw.close();
	} // end of main()
} // end of Main class