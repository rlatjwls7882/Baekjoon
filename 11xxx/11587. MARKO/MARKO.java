import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int[] key = {2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9};
		
		int N = Integer.valueOf(br.readLine());
		String[] strings = new String[N];
		for(int i=0;i<N;i++) {
			strings[i] = br.readLine();
		}
		
		String S = br.readLine();
		
		int cnt=0;
		for(int i=0;i<N;i++) {
			boolean chk=true;
			for(int j=0;j<S.length();j++) {
				if(S.length()!=strings[i].length()||S.charAt(j)-'0'!=key[strings[i].charAt(j)-'a']) {
					chk=false;
					break;
				}
			}
			if(chk) {
				cnt++;
			}
		}
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
} // end of Main class