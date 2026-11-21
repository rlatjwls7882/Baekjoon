import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 성민이가 필기한 내용 확인
		String S = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<S.length();i++)
			if(S.charAt(i)>=65)
				sb.append(S.charAt(i));
		
		// 필기한 내용에 키워드가 존재하는지 확인
		String keyword = br.readLine();
		bw.write(sb.indexOf(keyword)!=-1?"1":"0");
		
		bw.close();
	} // end of main
} // end of Main class