import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		// 엉터리 약분 사례 출력
		for(int i=101;i<1000;i++) {
			for(int j=i%10*100;j<1000;j++) {
				if(j<100||i%10!=j/100||i==j) {
					break;
				} else {
					if((i/10)/(double)(j%100)==i/(double)j) {
						bw.write(String.format("%d / %d = %d / %d\n", i, j, i/10, j%100));
					}
				}
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class