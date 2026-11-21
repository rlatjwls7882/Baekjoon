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
		
		int posY=0, posX=0;
		for(int i=1;N>0;i++) {
			if(i%2==1) {
				if(i<N) {
					posY += i;
					N -= i;
				} else {
					posY += N;
					break;
				}
				
				if(i<N) {
					posX += i;
					N -= i;
				} else {
					posX += N;
					break;
				}
			} else {
				if(i<N) {
					posY -= i;
					N -= i;
				} else {
					posY -= N;
					break;
				}
				
				if(i<N) {
					posX -= i;
					N -= i;
				} else {
					posX -= N;
					break;
				}
			}
		}
		bw.write(posX+" "+posY);
		
		bw.close();
	} // end of main()
} // end of Main class