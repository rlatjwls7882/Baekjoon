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
		
		int n = Integer.valueOf(br.readLine());
		
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			arr[i] = Integer.valueOf(st.nextToken());
		}
		
		boolean chk=false;
		for(int i=1;i<n;i++) {
			if(arr[i-1]>=arr[i]) {
				chk=true;
				break;
			}
		}
		
		if(chk) {
			bw.write(n+"\n");
			for(int i=1;i<=n;i++) {
				bw.write(i+" ");
			}
		} else {
			bw.write("0");
		}

		bw.close();
	} // end of main
} // end of Main class