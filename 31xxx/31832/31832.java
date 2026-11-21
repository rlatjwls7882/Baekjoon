import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		
		while(N-->0) {
			String string = br.readLine();
			int lower=0, upper=0, other=0;
			for(int i=0;i<string.length();i++) {
				if('a'<=string.charAt(i)&&string.charAt(i)<='z') {
					lower++;
				} else if('A'<=string.charAt(i)&&string.charAt(i)<='Z') {
					upper++;
				}
				if(string.charAt(i)<'0' || string.charAt(i)>'9') {
					other++;
				}
			}
			if(upper>lower || string.length()>10 || other==0) continue;
			bw.write(string);
			break;
		}

		bw.close();
	} // end of main
} // end of Main class