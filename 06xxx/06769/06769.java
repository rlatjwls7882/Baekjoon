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
		
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		String string = br.readLine();
		int cnt=0;
		for(int i=0;i<string.length();i+=2) {
			if(i+3<string.length()&&map.get(string.charAt(i+1))<map.get(string.charAt(i+3))) {
				cnt -= (string.charAt(i)-'0')*map.get(string.charAt(i+1));
			} else {
				cnt += (string.charAt(i)-'0')*map.get(string.charAt(i+1));
			}
		}
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
} // end of Main class