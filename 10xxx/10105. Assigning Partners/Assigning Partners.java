import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		
		HashMap<String, String> partner = new HashMap<>();
		boolean chk=true;
		while(N-->0) {
			String str1 = st1.nextToken();
			String str2 = st2.nextToken();
			
			if(str1.equals(str2)||partner.containsKey(str1)&&!partner.get(str1).equals(str2)||partner.containsKey(str2)&&!partner.get(str2).equals(str1)) {
				chk=false;
				break;
			}
			partner.put(str1, str2);
			partner.put(str2, str1);
		}
		
		bw.write(chk?"good":"bad");
		
		bw.close();
	} // end of main()
} // end of Main class