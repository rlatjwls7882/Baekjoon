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
		String string = br.readLine();
		
		int cnt=0;
		for(int i=0;i<N;i++) {
			if(i%2==0&&string.charAt(i)!='I'||i%2==1&&string.charAt(i)!='O') {
				cnt++;
			}
		}
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
} // end of Main class