import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.valueOf(br.readLine());
		
		// N이 3의 중복없는 거듭제곱의 합으로 나타낼 수 있는지 확인
		// = 3진법으로 나타냈을때 2가 있는지 확인
		boolean isSamSam=true;

		if(N==0) {
			isSamSam=false;
		} else {
			while(N>0) {
				if(N%3==2) {
					isSamSam=false;
				}
				N/=3;
			}
		}

		bw.write(isSamSam?"YES":"NO");

		bw.close();
	} // end of main()
} // end of Main class