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
        
        // 지시 횟수와 현재 좌표 입력
        int N = Integer.valueOf(br.readLine())-1;
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        double x = Double.valueOf(st.nextToken());
        double y = Double.valueOf(st.nextToken());
        
        // N번 움직이기
        while(N--!=0) {
        	
        	// 방향과 움직일 거리 입력
        	st = new StringTokenizer(br.readLine());
        	String dir = st.nextToken();
        	double d = Double.valueOf(st.nextToken());
        	
        	// 북쪽
        	if(dir.equals("N"))
        		y += d;
        	
        	// 남쪽
        	else if(dir.equals("S"))
        		y -= d;
        	
        	// 동쪽
        	else if(dir.equals("E"))
        		x += d;
        	
        	// 서쪽
        	else if(dir.equals("W"))
        		x -= d;
        	
        	// 북동쪽
        	else if(dir.equals("NE")) {
        		x += d/Math.sqrt(2);
        		y += d/Math.sqrt(2);
        	}
        	
        	// 북서쪽
        	else if(dir.equals("NW")) {
        		x -= d/Math.sqrt(2);
        		y += d/Math.sqrt(2);
        	}
        	
        	// 남동쪽
        	else if(dir.equals("SE")) {
        		x += d/Math.sqrt(2);
        		y -= d/Math.sqrt(2);
        	}
        	
        	// 남서쪽
        	else {
        		x -= d/Math.sqrt(2);
        		y -= d/Math.sqrt(2);
        	}
        }
        
        // 최종 장소의 좌표 출력
        bw.write(x+" "+y);
        bw.close();
    } // end of main
} // end of Main class