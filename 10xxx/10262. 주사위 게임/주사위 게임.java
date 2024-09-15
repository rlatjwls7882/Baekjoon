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
		int[] a = new int[4];
		for(int i=0;i<4;i++) {
			a[i] = Integer.valueOf(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		int[] b = new int[4];
		for(int i=0;i<4;i++) {
			b[i] = Integer.valueOf(st.nextToken());
		}
		
		int winA=0, winB=0;
		for(int i=a[0];i<=a[1];i++) {
			for(int j=a[2];j<=a[3];j++) {
				for(int k=b[0];k<=b[1];k++) {
					for(int l=b[2];l<=b[3];l++) {
						if(i+j>k+l) {
							winA++;
						} else if(i+j<k+l) {
							winB++;
						}
					}
				}
			}
		}
		
		if(winA>winB) {
			bw.write("Gunnar");
		} else if(winA<winB) {
			bw.write("Emma");
		} else {
			bw.write("Tie");
		}
		
		bw.close();
	} // end of main()
} // end of Main class