import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int n = Integer.valueOf(br.readLine());
		
		// 잘못 배치된 냄비의 위치 확인
		ArrayList<Integer> pos = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=1;i<=n;i++) {
			if(Integer.valueOf(st.nextToken())%2!=i%2) {
				pos.add(i);
				if(pos.size()>2) {
					break;
				}
			}
		}
		
		// 출력
		if(pos.size()==2&&pos.get(0)%2!=pos.get(1)%2) {
			bw.write(pos.get(0)+" "+pos.get(1));
		} else if(pos.isEmpty()&&n>2) {
			bw.write("1 3");
		} else {
			bw.write("-1 -1");
		}
		
		bw.close();
	} // end of main()
} // end of Main class