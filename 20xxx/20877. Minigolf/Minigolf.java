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
        
        // 코스의 수 N 입력
        int N = Integer.valueOf(br.readLine());
        
        // 타수와 파수 계산
        StringTokenizer st = new StringTokenizer(br.readLine());
        int Ta=0, Pa=0;
        
        for(int i=1;i<=N;i++) {
        	if(i%2==1)
        		Pa+=2;
        	else
        		Pa+=3;
        	
        	int tmpTa = Integer.valueOf(st.nextToken());
        	if(tmpTa>7)
        		Ta+=7;
        	else
        		Ta+=tmpTa;
        }
        
        // 오버 파 / 언더 파 기준 최종 결과 출력
        bw.write(Ta-Pa+"");
        bw.close();
    } // end of main
} // end of Main class