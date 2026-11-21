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
		int[] arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i] = Integer.valueOf(st.nextToken());
		}
		
		boolean chk=false;
		for(int i=2;i<N;i++) {
			if(arr[i-2]!=arr[i-1]&&arr[i-2]!=arr[i]&&arr[i-1]!=arr[i]) {
				chk=true;
				break;
			}
		}
		bw.write(chk?"TAK":"NIE");
		
		bw.close();
	} // end of main()
} // end of Main class