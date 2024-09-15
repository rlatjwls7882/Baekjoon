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
		
		while(true) {
			int N = Integer.valueOf(br.readLine());
			if(N==0) {
				break;
			}
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] arr = new int[N];
			for(int i=0;i<N;i++) {
				arr[i] = Integer.valueOf(st.nextToken());
			}
			
			int startMoving=0;
			if(arr[0]>arr[1]) {
				startMoving=-1;
			} else {
				startMoving=1;
			}
			
			int endMoving=0;
			if(arr[N-2]>arr[N-1]) {
				endMoving=-1;
			} else {
				endMoving=1;
			}
			
			int cnt=0;
			if(startMoving==endMoving) {
				cnt=2;
			} else {
				cnt=1;
			}
			
			for(int i=0;i<N-2;i++) {
				if(arr[i]>arr[i+1]&&arr[i+1]<arr[i+2]||arr[i]<arr[i+1]&&arr[i+1]>arr[i+2]) {
					cnt++;
				}
			}
			bw.write(cnt+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class