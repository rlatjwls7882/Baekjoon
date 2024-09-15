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
        	
        	// D, Resolution_Horizontal Resolution_Vertical 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	double D = Double.valueOf(st.nextToken());
        	double Resolution_Horizontal = Double.valueOf(st.nextToken());
        	double Resolution_Vertical = Double.valueOf(st.nextToken());
        	
        	// 0 0 0 입력시 종료
        	if(D==0&&Resolution_Horizontal==0
        			&&Resolution_Vertical==0)
        		break;
        	
        	// W, H 생성
        	double W = 16*D/Math.sqrt(337);
        	double H = 9*W/16;
        	
        	// 가로 DPI, 세로 DPI 출력
        	bw.write(String.format("Horizontal DPI: %.02f\n"
        			, Resolution_Horizontal/W));
        	
        	bw.write(String.format("Vertical DPI: %.02f\n"
        			, Resolution_Vertical/H));
        }
        
        bw.close();
    } // end of main
} // end of Main class