import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.security.MessageDigest;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception {
		String s = br.readLine();
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		byte[] hash = md.digest(s.getBytes());
		
		for(byte e:hash) {
			bw.write(String.format("%02x", e));
		}
		
		bw.close();
	} // end of main
} // end of Main