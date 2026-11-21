import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		
		while(N-->0) {
			
			// G명의 학번
			int G = Integer.valueOf(br.readLine());
			int[] student = new int[G];
			for(int i=0;i<G;i++) {
				student[i] = Integer.valueOf(br.readLine());
			}
			
			// 학번을 m으로 나눈 나머지가 모두 다른 m 계산
			int m=1;
			while(true) {
				HashSet<Integer> remainder = new HashSet<>();
				for(int i=0;i<G;i++) {
					if(!remainder.add(student[i]%m)) {
						break;
					}
				}
				
				if(remainder.size()==G) {
					break;
				} else {
					m++;
				}
			}
			bw.write(m+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class