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
		for(int i=0;i<n;i+=2) {
			if(i==0) bw.write(n*n/2+" ");
			else bw.write(i*n/2+" ");
			for(int j=1;j<n;j++) bw.write(i*n/2+j+" ");
			bw.write("\n");
			for(int j=0;j<n;j++) bw.write(i*n/2+j+1+" ");
			bw.write("\n");
		}
		
        bw.close();
    } // end of main
} // end of Main