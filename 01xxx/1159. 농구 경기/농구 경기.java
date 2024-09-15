import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 선수의 수 N
		int N = Integer.valueOf(br.readLine());
		
		// 성의 첫글자가 나온 횟수 계산
		int[] name = new int[26];
		
		while(N-->0)
			name[br.readLine().charAt(0)-'a']++;
		
		// 선발할 수 있는 선수의 성 목록
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<26;i++)
			if(name[i]>=5)
				sb.append((char)(i+'a'));
		
		// 선발할 수 있는 선수의 성 출력
		if(!sb.isEmpty())
			bw.write(sb.toString());
		else
			bw.write("PREDAJA");

		bw.close();
	} // end of main
} // end of Main class
