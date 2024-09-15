import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		while(true) {
			String string = br.readLine();
			if(string.equals("0")) {
				break;
			}
			
			int max=0, idx=0;
			for(int i=0;i<string.length();i++) {
				if(string.charAt(i)>max) {
					max=string.charAt(i);
					idx=i;
				}
			}
			
			if((max-'0')%2==1) {
				string = string.substring(0, idx)+"0"+string.substring(idx+1);
			} else {
				string = string.substring(0, idx)+(max-'0'+4)%10+string.substring(idx+1);
			}
			bw.write(Integer.valueOf(string)+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class