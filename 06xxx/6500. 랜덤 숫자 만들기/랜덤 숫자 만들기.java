import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		while(true) {
			int a0 = Integer.valueOf(br.readLine());
			if(a0==0) {
				break;
			}
			
			HashSet<Integer> set = new HashSet<>();
			while(true) {
				if(!set.add(a0)) {
					break;
				}
				a0 = a0*a0;
				a0 = a0/100%10000;
			}
			
			bw.write(set.size()+"\n");
		}
		

		bw.close();
	} // end of main()
} // end of Main class