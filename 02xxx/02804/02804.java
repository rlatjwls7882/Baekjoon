import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		String A = st.nextToken();
		String B = st.nextToken();
		int Alength = A.length();
		int Blength = B.length();
		
		// 겹치는 문자 확인
		int idxA=0, idxB=0;
		end: for(int i=0;i<Alength;i++)
				for(int j=0;j<Blength;j++)
					if(A.charAt(i)==B.charAt(j)) {
						idxA=i;
						idxB=j;
						break end;
					}

		// 출력
		for(int i=0;i<Blength;i++) {
			if(i==idxB) {
				bw.write(A);
			} else {
				for(int j=0;j<Alength;j++) {
					if(j!=idxA) bw.write(".");
					else bw.write(B.charAt(i));
				}
			}
			bw.write("\n");
		}

		bw.close();
	} // end of main
} // end of Main class