import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			int N = Integer.valueOf(br.readLine());
			
			// B진법으로 나타냈을때 팰린드롬이 될 수 있는지 확인
			boolean chk=false;
			for(int radix=2;radix<=64;radix++) {
				if(isPalinedrome(N, radix)) {
					bw.write("1\n");
					chk=true;
					break;
				}
			}
			
			if(!chk) {
				bw.write("0\n");
			}
		}
		
		bw.close();
	} // end of main()
	
	static boolean isPalinedrome(int N, int radix) {
		ArrayList<Integer> string = new ArrayList<>();
		
		while(N>0) {
			string.add(N%radix);
			N/=radix;
		}
		
		int length = string.size();
		for(int i=0;i<length/2;i++) {
			if(string.get(i)!=string.get(length-1-i)) {
				return false;
			}
		}
		
		return true;
	} // end of isPalinedrome()
} // end of Main class