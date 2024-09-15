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

		// 빨간 타일과 갈색 타일, 전체 타일의 수
		StringTokenizer st = new StringTokenizer(br.readLine());
		int R = Integer.valueOf(st.nextToken());
		int B = Integer.valueOf(st.nextToken());
		int total = R+B;
		
		// 상근이네 방의 크기 계산
		for(int L=1;L*L<=total;L++)
			if(total%L==0&&(L-2)*(total/L-2)==B) {
				bw.write(total/L+" "+L);
				break;
			}

		bw.close();
	} // end of main
} // end of Main class