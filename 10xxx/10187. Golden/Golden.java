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
        
        // 데이터 세트의 수 N
        int N = Integer.valueOf(br.readLine());
        
        while(N-->0) {
        	
        	// 2개의 소수 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	double A = Double.valueOf(st.nextToken());
        	double B = Double.valueOf(st.nextToken());
        	
        	// 황금비인지 확인
        	double golden = 1.61803399;
        	double diff = golden*.01;
        	
        	if(golden-diff<=A/B&&A/B<=golden+diff)
        		bw.write("golden\n");
        	else
        		bw.write("not\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class