import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		HashMap<Character, Character> map = new HashMap<>();
		map.put('@', 'a');
		map.put('[', 'c');
		map.put('!', 'i');
		map.put(';', 'j');
		map.put('^', 'n');
		map.put('0', 'o');
		map.put('7', 't');
		
		int N = Integer.valueOf(br.readLine());
		
		while(N-->0) {
			String string = br.readLine();
			int length = string.length();
			
			// 단어 해석
			StringBuilder sb = new StringBuilder();
			int cnt=0;
			for(int i=0;i<length;i++) {
				if(i+2<length&&string.substring(i, i+3).equals("\\\\'")) {
					sb.append('w');
					i+=2;
					cnt++;
				} else if(i+1<length&&string.substring(i, i+2).equals("\\'")) {
					sb.append('v');
					i+=1;
					cnt++;
				} else if(map.containsKey(string.charAt(i))) {
					sb.append(map.get(string.charAt(i)));
					cnt++;
				} else {
					sb.append(string.charAt(i));
				}
			}
			
			// 출력
			if(cnt*2>=sb.length()) {
				bw.write("I don't understand\n");
			} else {
				bw.write(sb.toString()+"\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class