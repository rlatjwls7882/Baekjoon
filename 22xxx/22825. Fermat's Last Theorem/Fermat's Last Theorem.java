import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		while(true) {
			int z = Integer.valueOf(br.readLine());
			if(z==0) {
				break;
			}
			int z3 = z*z*z;
			
			int min=z3;
			for(int i=1;i<z;i++) {
				int i3 = i*i*i;
				for(int j=1;j<z;j++) {
					int j3 = j*j*j;
					if(i3+j3>z3) {
						break;
					}
					min = Math.min(min, z3-i3-j3);
				}
			}
			bw.write(min+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class