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

		char[] original = {'.','O','-','|','/','\\','^','<','v','>'};
		char[] changed = {'.','O','|','-','\\','/','<','v','>','^'};
		
		// 그림의 크기 N*M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		String[] paint = new String[N];
		for(int i=0;i<N;i++)
			paint[i] = br.readLine();
		
		// 그림을 왼쪽으로 넘어뜨렸을때의 모습 출력
		for(int i=M-1;i>=0;i--) {
			for(int j=0;j<N;j++)
				for(int k=0;k<10;k++)
					if(paint[j].charAt(i)==original[k])
						bw.write(changed[k]);
			bw.write("\n");
		}
		
		bw.close();
	} // end of main
} // end of Main class