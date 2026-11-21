import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			
			// 녹음된 소리
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			// 다른 동물들의 울음소리 입력
			HashSet<String> set = new HashSet<String>();
			
			while(true) {
				String string = br.readLine();
				StringTokenizer st2 = new StringTokenizer(string);
				st2.nextToken();
				st2.nextToken();
				
				String sound = st2.nextToken();
				
				if(string.equals("what does the fox say?")) {
					break;
				}
				set.add(sound);
			}
			
			// 여우의 울음소리 출력
			while(st.hasMoreTokens()) {
				String sound = st.nextToken();
				
				if(!set.contains(sound)) {
					bw.write(sound);
					bw.write(' ');
				}
			}
			
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class