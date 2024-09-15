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
        
        // 물약의 개수 N 입력
        int N = Integer.valueOf(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        double V=0;
        
        while(N--!=0) {
        	
        	// 물약으로 인해 증가되는 방어율 무시 수치
        	double A = Double.valueOf(st.nextToken())/100;
        	
        	// 다음 방어율 무시 수치
        	V = 1-(1-V)*(1-A);
        	
        	// 마시면서 증가된 방어력 무시 수치 출력
        	bw.write(V*100+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class