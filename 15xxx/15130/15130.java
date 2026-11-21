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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[10];
		
		int first=-1, second=-1;
		for(int i=0;i<10;i++) {
			arr[i] = Integer.valueOf(st.nextToken());
			if(first==-1&&arr[i]!=0) {
				first=i;
			} else if(second==-1&&arr[i]!=0) {
				second=i;
			}
		}
		
		if((arr[second]-arr[first])%(second-first)!=0) {
			bw.write("-1");
		} else {
			int d = (arr[second]-arr[first])/(second-first);
			
			for(int i=first-1;i>=0;i--) {
				arr[i]=arr[i+1]-d;
			}
			for(int i=first+1;i<10;i++) {
				arr[i]=arr[i-1]+d;
			}
			
			for(int i=0;i<10;i++) {
				bw.write(arr[i]+" ");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class