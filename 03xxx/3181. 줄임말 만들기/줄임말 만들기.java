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

		// 줄임말 출력
		String[] notImportant = {"i", "pa", "te", "ni", "niti", "a", "ali", "nego", "no", "ili"};

		for(int i=0;st.hasMoreTokens();i++) {
			String word = st.nextToken();
			boolean isImportant=true;

			if(i!=0) {
				for(int j=0;j<10;j++)
					if(word.equals(notImportant[j])) {
						isImportant=false;
						break;
					}
			}

			bw.write(isImportant?(char)(word.charAt(0)-32)+"":"");
		}

		bw.close();
	} // end of main
} // end of Main class