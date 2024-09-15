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
        
        // 아파트의 방의 개수와 단위면적당 비용 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.valueOf(st.nextToken());
        double c = Double.valueOf(st.nextToken());
        	
        // 모든 방의 면적, 침실의 면적, 계산면적 계산
        int totalroomArea=0, bedroomArea=0;
        double calculationArea=0;
        
        while(n--!=0) {
        	
        	// 방의 면적과 방의 종류 입력
        	st = new StringTokenizer(br.readLine());
        	double ai = Double.valueOf(st.nextToken());
        	String ti = st.nextToken();
        	
        	// 종류가 발코니인 경우
        	if(ti.equals("balcony"))
        		calculationArea -= ai/2;
        	
        	// 종류가 침실인 경우
        	else if(ti.equals("bedroom")) {
        		bedroomArea += ai;
        	}
        	
        	calculationArea += ai;
        	totalroomArea += ai;
        }
        
        // 모든 방의 총 면적, 침실의 총 면적, 아파트의 비용 출력
        bw.write(String.format("%d\n%d\n%f", totalroomArea, bedroomArea, calculationArea*c));
        bw.close();
    } // end of main
} // end of Main class