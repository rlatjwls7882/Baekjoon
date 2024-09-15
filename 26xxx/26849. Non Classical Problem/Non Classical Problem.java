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
        
        // 멀티셋의 크기 N 입력
        int N = Integer.valueOf(br.readLine());
        
        // a/b의 최소, 최대, 합 계산
        double sum=0, min=2000000000, max=0;
        
        while(N-->0) {
        	
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	double tmp = Double.valueOf(st.nextToken())/Double.valueOf(st.nextToken());
        	
        	if(tmp>max) max=tmp;
        	if(tmp<min) min=tmp;
        	sum += tmp;
        }
        
        // a/b의 최소, 최대, 합 출력
        bw.write(String.format("%f %f %f", min, max, sum));
        
        bw.close();
    } // end of main
} // end of Main class