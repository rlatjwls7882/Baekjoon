import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char[] arr = bf.readLine().toCharArray();
		
		for(int i=0;i<arr.length;) {
			bw.write(arr[i]+"");
			i+=arr[i]-'A'+1;
		}
		
		bw.close();
	} // end of main
} // end of main class