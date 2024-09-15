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
		
		String[] message = {"2", "22", "222", "3", "33", "333", "4", "44", "444", "5", "55", "555", "6", "66", "666", "7", "77", "777", "7777", "8", "88", "888", "9", "99", "999", "9999"};
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] key = new int[10];
		for(int i=1;i<=9;i++) {
			key[Integer.valueOf(st.nextToken())] = i;
		}
		
		String string = br.readLine();
		for(int i=0;i<string.length();i++) {
			if(i>=1&&message[string.charAt(i)-'a'].charAt(0)==message[string.charAt(i-1)-'a'].charAt(0)) {
				bw.write('#');
			}
			
			for(int j=0;j<message[string.charAt(i)-'a'].length();j++) {
				bw.write(key[message[string.charAt(i)-'a'].charAt(0)-'0']+"");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class