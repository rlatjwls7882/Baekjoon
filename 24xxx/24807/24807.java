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
		
		// 세 동물의 다리 수 a b c, 총 다리의 수 l
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.valueOf(st.nextToken());
		int b = Integer.valueOf(st.nextToken());
		int c = Integer.valueOf(st.nextToken());
		int l = Integer.valueOf(st.nextToken());
		
		// 가능한 모든 정답 계산
		StringBuilder sb = new StringBuilder();
		int first=0;
		for(int i=0;first<=l;i++) {
			first=i*a;
			
			int second=0;
			for(int j=0;first+second<=l;j++) {
				second=j*b;
				
				int third=0;
				for(int k=0;first+second+third<=l;k++) {
					third=k*c;
					
					if(first+second+third==l) {
						sb.append(i).append(' ').append(j).append(' ').append(k).append("\n");
					}
				}
			}
		}
		
		if(sb.isEmpty()) {
			bw.write("impossible");
		} else {
			bw.write(sb.toString());
		}
		
		bw.close();
	} // end of main()
} // end of Main class