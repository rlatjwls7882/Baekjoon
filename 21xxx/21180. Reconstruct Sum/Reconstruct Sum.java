import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int n = Integer.valueOf(br.readLine());
		
		int[] arr = new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			arr[i] = Integer.valueOf(br.readLine());
			sum += arr[i];
		}
		
		boolean chk=false;
		for(int i=0;i<n;i++) {
			if(arr[i]*2==sum) {
				chk=true;
			}
		}
		
		if(chk) {
			bw.write(Integer.toString(sum/2));
		} else {
			bw.write("BAD");
		}
		
		bw.close();
	} // end of main()
} // end of Main class