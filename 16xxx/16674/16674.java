import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// N의 구성요소
		int N = Integer.valueOf(br.readLine());
		int[] num = new int[10];
		
		while(N!=0) {
			num[N%10]++;
			N/=10;
		}
		
		// 2018과의 관련도 확인
		int relationship=0;
		
		if(num[3]+num[4]+num[5]+num[6]+num[7]+num[9]==0) {
			relationship=1;
			
			if(num[2]>0&&num[0]>0&&num[1]>0&&num[8]>0) {
				relationship=2;
				
				if(num[2]==num[0]&&num[0]==num[1]&&num[1]==num[8])
					relationship=8;
			}
		}
		
		bw.write(relationship+"");
		
		bw.close();
	} // end of main
} // end of Main class