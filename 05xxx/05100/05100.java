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
			int N = Integer.valueOf(br.readLine());
			if(N==0) {
				break;
			}
			
			int[] size = new int[5];
			while(N-->0) {
				String string = br.readLine();
				if(string.equals("M")||string.equals("L")) {
					size[0]++;
				} else if(string.equals("S")) {
					size[3]++;
				} else if(string.equals("X")) {
					size[4]++;
				} else if(Integer.valueOf(string)>=12) {
					size[1]++;
				} else {
					size[2]++;
				}
			}
            
			for(int i=0;i<5;i++) {
				bw.write(size[i]+" ");
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class