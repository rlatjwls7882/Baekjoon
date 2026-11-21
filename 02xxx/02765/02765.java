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
    	
    	for(int i=1;;i++) {
    		
    		// 지름 diameter, 회전수 rotation, 시간 hour
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		double diameter = Double.valueOf(st.nextToken());
    		double rotation = Double.valueOf(st.nextToken());
    		double hour = Double.valueOf(st.nextToken())/60/60;
    		
    		// 회전수가 0일때 종료
    		if(rotation==0) break;
    		
    		// 마일과 MPS 계산
    		double Miles = diameter*Math.PI*rotation/12/5280;
    		double MPS = Miles/hour;
    		
    		// 마일과 MPS 출력
    		bw.write("Trip #"+i+": "+String.format("%.2f", Miles)
    		+" "+String.format("%.2f", MPS)+"\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class