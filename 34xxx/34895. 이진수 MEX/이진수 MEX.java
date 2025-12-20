import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		int n = Integer.valueOf(br.readLine());
		String s = br.readLine();
		
		Set<Integer> set = new HashSet<>();
		for(int i=1;i<=20;i++) {
			for(int j=0;i+j<=n;j++) {
				String cur = s.substring(j, i+j);
				set.add(Integer.valueOf(cur, 2));
			}
		}
		
		for(int i=1;;i++) {
			if(!set.contains(i)) {
				bw.write(Integer.toString(i, 2));
				break;
			}
		}
		bw.close();
	} // end of main
} // end of Main