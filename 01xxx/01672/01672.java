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
		char[] arr = br.readLine().toCharArray();
		
		// 최종 염기 계산
		for(int i=N-2;i>=0;i--) {
			if(arr[i]=='A'&&arr[i+1]=='G'||arr[i]=='G'&&arr[i+1]=='A') {
				arr[i]='C';
			} else if(arr[i]=='A'&&arr[i+1]=='C'||arr[i]=='C'&&arr[i+1]=='A') {
				arr[i]='A';
			} else if(arr[i]=='A'&&arr[i+1]=='T'||arr[i]=='T'&&arr[i+1]=='A') {
				arr[i]='G';
			} else if(arr[i]=='G'&&arr[i+1]=='C'||arr[i]=='C'&&arr[i+1]=='G') {
				arr[i]='T';
			} else if(arr[i]=='G'&&arr[i+1]=='T'||arr[i]=='T'&&arr[i+1]=='G') {
				arr[i]='A';
			} else if(arr[i]=='C'&&arr[i+1]=='T'||arr[i]=='T'&&arr[i+1]=='C') {
				arr[i]='G';
			}
		}
		
		bw.write(arr[0]);
		
		bw.close();
	} // end of main()
} // end of Main class