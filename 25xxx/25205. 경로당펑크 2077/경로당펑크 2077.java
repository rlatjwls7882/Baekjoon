import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 길이 N의 이름 입력
		int N = Integer.valueOf(br.readLine());
		String name = br.readLine();
		
		// 이름 마지막 글자에 받침이 있는지 확인
		char last = name.charAt(N-1);
		if(last=='k'||last=='i'||last=='j'||last=='u'||last=='h'||last=='y'||last=='n'||last=='b'||last=='m'||last=='l'||last=='o'||last=='p')
			bw.write("0");
		else
			bw.write("1");
		
		bw.close();
	} // end of main()
} // end of Main class