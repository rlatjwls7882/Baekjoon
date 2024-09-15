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
        
        // 음표의 수 N 입력
        int N = Integer.valueOf(br.readLine());
        
        // 총 음표의 길이 계산
        StringTokenizer st = new StringTokenizer(br.readLine());
        double length=0;
        
        while(N--!=0) {
        	double A = Double.valueOf(st.nextToken());
        	
        	if(A==0)
        		length += 2;
        	
        	else
        		length += 1/A;
        }
        
        // 총 음표의 길이 출력
        bw.write(length+"");
        bw.close();
    } // end of main
} // end of Main class