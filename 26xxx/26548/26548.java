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
        
        // 데이터 세트의 수 n 입력
        int n = Integer.valueOf(br.readLine());
        
        while(n-->0) {
        	
        	// a, b, c 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	double a = Double.valueOf(st.nextToken());
        	double b = Double.valueOf(st.nextToken());
        	double c = Double.valueOf(st.nextToken());
        	
        	// 근해공식의 해 2개 출력
        	bw.write(String.format("%.3f, %.3f\n", (-b+Math.sqrt(b*b-4*a*c))/(2*a)
                                   , (-b-Math.sqrt(b*b-4*a*c))/(2*a)));
        }
        
        bw.close();
    } // end of main
} // end of Main class