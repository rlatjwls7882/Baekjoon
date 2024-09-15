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
		map.put('H', 1);
		map.put('C', 12);
		map.put('N', 14);
		map.put('O', 16);
		
		String string = br.readLine();
		
		int mass=0;
		for(int i=0;i<string.length();i++) {
			if(i+1<string.length()&&string.charAt(i+1)<='9') {
				mass += map.get(string.charAt(i))*(string.charAt(i+1)-'0');
				i++;
			} else {
				mass += map.get(string.charAt(i));
			}
		}
		bw.write(mass+"");
		
		bw.close();
	} // end of main()
} // end of Main class