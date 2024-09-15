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
        
        while(true) {
        	try {
				
        		// 커브의 반지름 R, 경사 S
        		StringTokenizer st = new StringTokenizer(br.readLine());
        		double R = Double.valueOf(st.nextToken());
        		double S = Double.valueOf(st.nextToken());
        		
        		// 최대 속도 계산
        		bw.write(Math.round(Math.sqrt(R*(S+0.16)/0.067))+"\n");
			} catch (Exception e) { break; }
        }
        
        bw.close();
    } // end of main
} // end of Main class