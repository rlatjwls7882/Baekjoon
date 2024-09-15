import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		String[] sing = {"baby", "sukhwan", "tururu", "turu", "very", "cute", "tururu", "turu", "in", "bed", "tururu", "turu", "baby", "sukhwan"};
		int N = Integer.valueOf(br.readLine())-1;
		
		// 석환이가 N번째로 부를 단어 출력
		if(N%14%4==2&&N/14+2>=5) {
			bw.write(String.format("tu+ru*%d", N/14+2));
		} else if(N%14%4==3&&N/14+1>=5) {
			bw.write(String.format("tu+ru*%d", N/14+1));
		} else {
			bw.write(sing[N%14]);
			if(N%14%4==2||N%14%4==3) {
				for(int i=N/14;i>0;i--) {
					bw.write("ru");
				}
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class