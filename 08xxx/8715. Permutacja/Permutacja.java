import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		boolean[] arr = new boolean[N];

		boolean chk=true;
		for(int i=0;i<N;i++) {
			int idx = Integer.valueOf(st.nextToken())-1;

			if(idx>=N||idx<0||arr[idx]) {
				chk=false;
				break;
			} else {
				arr[idx]=true;
			}
		}
		bw.write(chk?"TAK":"NIE");

		bw.close();
	} // end of main()
} // end of Main class