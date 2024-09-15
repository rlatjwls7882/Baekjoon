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
        
        // 우주선의 수 입력
        int n = Integer.valueOf(br.readLine());
        
        // 바키찬이 있는 좌표 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int b1 = Integer.valueOf(st.nextToken());
        int b2 = Integer.valueOf(st.nextToken());
        
        // 우주선이 바키찬이 멈춘 위치에 착륙했는지 확인
        boolean spaceShip = false;
        
        while(n-->0) {
        	
        	st = new StringTokenizer(br.readLine());
        	int lx = Integer.valueOf(st.nextToken());
        	int ly = Integer.valueOf(st.nextToken());
        	int hx = Integer.valueOf(st.nextToken());
        	int hy = Integer.valueOf(st.nextToken());
        	
        	if(lx<=b1&&b1<=hx&&ly<=b2&&b2<=hy) {
        		spaceShip = true;
        		break;
        	}
        }
        
        // 우주선이 착륙했는지 출력
        if(spaceShip)
        	bw.write("Yes");
        else
        	bw.write("No");
        
        bw.close();
    } // end of main
} // end of Main class