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
        
        // 팀 구성원의 수 n, 급여의 고정 인상치 r 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.valueOf(st.nextToken());
        int r = Integer.valueOf(st.nextToken());
        
        // 고정 인상과 두배 인상을 원하는 선수의 수 계산
        int fixed=0, multiple=0;
        
        while(n-->0) {
        	int salary = Integer.valueOf(br.readLine());
        	
        	if(salary>r)
        		multiple++;
        	else if(salary<r)
        		fixed++;
        }
        
        // 어떤 경우를 더 선호하는지 출력
        if(fixed>multiple)
        	bw.write("1");
        else if(multiple>fixed)
        	bw.write("2");
        else
        	bw.write("0");
        
        bw.close();
    } // end of main
} // end of Main class