import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		// 첫번째 사진의 크기
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 사진 입력
		String[] picture1 = new String[N];
		for(int i=0;i<N;i++) {
			picture1[i] = br.readLine();
		}
		
		String[] picture2 = new String[N];
		for(int i=0;i<N;i++) {
			picture2[i] = br.readLine();
		}
		
		// 첫번째 사진을 가로로 2배로 늘리면 두번째 사진이 되는지 확인
		boolean possible = true;
		for(int i=0;i<N;i++) {
			for(int j=0;j<M*2;j++) {
				if(picture1[i].charAt(j/2)!=picture2[i].charAt(j)) {
					possible=false;
					i=N;
					break;
				}
			}
		}
		
		bw.write(possible?"Eyfa":"Not Eyfa");
		
		bw.close();
	} // end of main()
} // end of Main class