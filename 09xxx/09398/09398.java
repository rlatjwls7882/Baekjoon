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
			
			int length=Integer.MAX_VALUE;
			for(int i=0;i<string.length()-2;i++) {
				boolean lower=false, upper=false, digit=false;
				for(int j=i;j<string.length();j++) {
					if(string.charAt(j)>='a') {
						lower=true;
					} else if(string.charAt(j)>='A') {
						upper=true;
					} else {
						digit=true;
					}
					if(lower&&upper&&digit) {
						length=Math.min(length, j-i+1);
						break;
					}
				}
			}
            
			if(length==Integer.MAX_VALUE||string.length()<6) {
				bw.write("0\n");
			} else {
				bw.write(Math.max(6, length)+"\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class