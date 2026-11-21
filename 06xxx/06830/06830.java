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
        
        // 온도가 가장 낮은 도시 찾기
        String lowest_city="";
        int lowest_temp=1;
        
        while(true) {
        	
        	// 도시 이름과 온도 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	String city = st.nextToken();
        	int temp = Integer.valueOf(st.nextToken());
        	
        	// 온도 확인
        	if(temp<lowest_temp) {
        		lowest_city = city;
        		lowest_temp = temp;
        	}
        	
        	// 워털루가 마지막 도시
        	if(city.equals("Waterloo"))
        		break;
        }
        
        // 온도가 가장 낮은 도시 출력
        bw.write(lowest_city+"");
        bw.close();
    } // end of main
} // end of Main class