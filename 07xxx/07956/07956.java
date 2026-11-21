import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
	public static void main(String[] args) throws IOException {
		int z = Integer.valueOf(br.readLine());
		while(z-->0) solve();
		
        bw.close();
    } // end of main
	
	public static void solve() throws IOException {
		String binaryString = new BigInteger(br.readLine().trim()).toString(2);
		
		int diff=0;
		for(int i=0;i<(binaryString.length()+1)/2;i++) {
			if(binaryString.charAt(i)!=binaryString.charAt(binaryString.length()-1-i)) {
				diff++;
			}
		}
		if(diff==0 || diff==(binaryString.length()+1)/2) bw.write("TAK\n");
		else bw.write("NIE\n");
	} // end of solve
} // end of Main