import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 마라톤 참가자의 수 N
		int N = Integer.valueOf(br.readLine());
		HashSet<String> marathon = new HashSet<>();
		
		// 완주하지 못한 참가자 확인
		for(int i=1;i<2*N;i++) {
			String end = br.readLine();
			if(marathon.contains(end)) {
				marathon.remove(end);
			} else {
				marathon.add(end);
			}
		}
		
		bw.write(marathon.iterator().next());
		
		bw.close();
	} // end of main
} // end of Main class