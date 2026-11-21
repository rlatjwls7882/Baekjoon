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
		
		// 기념일의 날짜 계산
		int Y=2014, M=4, D=1;
		while(N-->0) {
			D++;
			
			// 1, 3, 5, 7, 8, 10, 12월
			if(D==32&&(M==1||M==3||M==5||M==7||M==8||M==10||M==12)) {
				D=1;
				M++;
				if(M==13) {
					M=1;
					Y++;
				}
			}
			
			// 4, 6, 9, 11월
			else if(D==31&&(M==4||M==6||M==9||M==11)) {
				D=1;
				M++;
			}
			
			// 2월(윤년)
			else if(M==2&&D==30&&(Y%4==0&&Y%100!=0||Y%400==0)) {
				D=1;
				M++;
			}
			
			// 2월(평년)
			else if(M==2&&D==29&&!(Y%4==0&&Y%100!=0||Y%400==0)) {
				D=1;
				M++;
			}
		}
		
		bw.write(String.format("%04d-%02d-%02d", Y, M, D));
		
		bw.close();
	} // end of main()
} // end of Main class