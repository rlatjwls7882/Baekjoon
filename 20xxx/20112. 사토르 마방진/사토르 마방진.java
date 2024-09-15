import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 마방진 입력
		int N = Integer.valueOf(br.readLine());
		
		String[] strings = new String[N];
		for(int i=0;i<N;i++)
			strings[i] = br.readLine();
		
		// 사토르 마방진인지 확인
		boolean isSator=true;
		
		for(int i=0;i<N;i++)
			for(int j=0;j<N;j++)
				if(strings[i].charAt(j)!=strings[j].charAt(i)) {
					isSator=false;
					i=N;
					j=N;
				}
		
		bw.write(isSator?"YES":"NO");
		
		bw.close();
	} // end of main()
} // end of Main class