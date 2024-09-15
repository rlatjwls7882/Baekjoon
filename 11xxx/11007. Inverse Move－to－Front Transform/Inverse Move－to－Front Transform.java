import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		String string = "abcdefghijklmnopqrstuvwxyz";
		
		int T = Integer.valueOf(br.readLine());
		while(T-->0) {
			LinkedList<Character> list = new LinkedList<>();
			for(int i=0;i<26;i++) {
				list.add(string.charAt(i));
			}
			
			int N = Integer.valueOf(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(N-->0) {
				int idx = Integer.valueOf(st.nextToken());
				char tmp = list.get(idx);
				bw.write(tmp);
				list.remove(idx);
				list.addFirst(tmp);
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class