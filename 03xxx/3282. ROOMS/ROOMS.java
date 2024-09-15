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
		int N = Integer.valueOf(st.nextToken());
		int G = Integer.valueOf(st.nextToken());
		
		int[] room = new int[N];
		int first1Idx=0, first0Idx=0;
		while(G-->0) {
			int num = Integer.valueOf(br.readLine());
			while(num>=2&&first0Idx<N) {
				room[first0Idx++]=2;
				num-=2;
			}
			
			while(num>=1) {
				if(first0Idx<N) {
					room[first0Idx++]=1;
				} else {
					for(int i=first1Idx;i<N;i++) {
						if(room[i]==1) {
							room[i]=2;
							first1Idx=i;
							break;
						}
					}
				}
				num--;
			}
		}
		
		for(int i=0;i<N;i++) {
			bw.write(room[i]+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class