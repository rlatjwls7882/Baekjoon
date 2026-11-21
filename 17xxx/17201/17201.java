import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.valueOf(br.readLine());
		String magnet = br.readLine();
		
		// N개의 자석이 모두 인력으로 연결되어 있는지 확인
		boolean isConnected=true;
		
		for(int i=2;i<N*2;i+=2)
			if(magnet.charAt(i)==magnet.charAt(i-1)) {
				isConnected=false;
				break;
			}
		
		bw.write(isConnected?"Yes":"No");
		
		bw.close();
	} // end of main()
} // end of Main class