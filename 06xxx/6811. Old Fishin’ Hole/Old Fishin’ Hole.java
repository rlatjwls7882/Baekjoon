import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int trout = Integer.valueOf(br.readLine());
		int pike = Integer.valueOf(br.readLine());
		int pickerel = Integer.valueOf(br.readLine());
		int total = Integer.valueOf(br.readLine());
		
		int cnt=0;
		for(int i=0;i*trout<=total;i++) {
			for(int j=0;i*trout+j*pike<=total;j++) {
				for(int k=0;i*trout+j*pike+k*pickerel<=total;k++) {
					if(i!=0||j!=0||k!=0) {
						bw.write(String.format("%d Brown Trout, %d Northern Pike, %d Yellow Pickerel\n", i, j, k));
						cnt++;
					}
				}
			}
		}
		bw.write("Number of ways to catch fish: "+cnt);
		
		bw.close();
	} // end of main()
} // end of Main class