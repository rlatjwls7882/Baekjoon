import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		/*
		 * 1(0):
		 * 2(2):11 2
		 * 3(3):111 12 21
		 * 4(5) : 1111 211 121 112 22
		 * 5(8) : 11111 2111 1211 1121 1112 221 212 122
		 * ...
		 */
		
		// n명이 악수를 하는 방법의 수 계산
		int n = Integer.valueOf(br.readLine());
		int[] method = new int[n+3];
		method[2]=2;
		method[3]=3;
		
		for(int i=4;i<=n;i++) {
			method[i]=(method[i-1]+method[i-2])%10;
		}
		
		bw.write(Integer.toString(method[n]));
		
		bw.close();
	} // end of main()
} // end of Main class