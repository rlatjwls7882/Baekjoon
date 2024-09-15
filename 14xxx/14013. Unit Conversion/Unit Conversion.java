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

        // x:y 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        double x = Double.valueOf(st.nextToken());
        double y = Double.valueOf(st.nextToken());
        
        // 단위 변환
        int N = Integer.valueOf(br.readLine());
        
        while(N--!=0) {
        	
        	// 총량 z, 단위 q 입력
        	st = new StringTokenizer(br.readLine());
        	double z = Double.valueOf(st.nextToken());
        	String q = st.nextToken();
        	
        	// 변환된 단위 출력
        	if(q.equals("A"))
        		bw.write(z*y/x+"\n");
        	else
        		bw.write(z*x/y+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class