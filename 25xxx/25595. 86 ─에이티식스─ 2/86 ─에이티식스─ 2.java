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
		
		int N = Integer.valueOf(br.readLine());
		
		// 노우젠의 위치와 레기온이 있는 칸 확인
		int soldierPos=0;
		boolean roomType1=false, roomType2=false;
		
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int j=0;j<N;j++) {
				String room = st.nextToken();
				if(room.equals("1")) {
					if(i%2==j%2) {
						roomType1=true;
					} else if(i%2!=j%2) {
						roomType2=true;
					}
				} else if(room.equals("2")) {
					if(i%2==j%2) {
						soldierPos=1;
					} else if(i%2!=j%2) {
						soldierPos=2;
					}
				}
			}
		}
		
		// 모든 레기온을 해치울 수 있는지 확인
		if(roomType1&&roomType2||soldierPos==1&&roomType1||soldierPos==2&&roomType2) {
			bw.write("Kiriya");
		} else {
			bw.write("Lena");
		}
		
		bw.close();
	} // end of main()
} // end of Main class