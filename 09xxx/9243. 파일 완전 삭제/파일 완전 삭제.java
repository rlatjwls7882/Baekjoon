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
		String string1 = br.readLine();
		String string2 = br.readLine();
		
		
		// 파일 삭제에 성공했는지 확인
		if(N%2==0) {
			if(string1.equals(string2))
				bw.write("Deletion succeeded");
			else
				bw.write("Deletion failed");
		} else {
			boolean isReversed=true;
			for(int i=0;i<string1.length();i++)
				if(string1.charAt(i)==string2.charAt(i)) {
					isReversed=false;
					break;
				}
			
			if(isReversed)
				bw.write("Deletion succeeded");
			else
				bw.write("Deletion failed");
		}
		
		bw.close();
	} // end of main
} // end of Main class