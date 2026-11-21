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
        
        // 물을 끓인 횟수 입력
        int N = Integer.valueOf(br.readLine());
        
        // 물이 끓기 시작한 최소 최대 시간 계산
        int first=0, last=1000;
        
        while(N-->0) {
        	
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int a = Integer.valueOf(st.nextToken());
        	int b = Integer.valueOf(st.nextToken());
        	
        	if(a>first) first=a;
        	if(b<last) last=b;
        }
        
        // 물이 끓는 것이 불가능한지 확인
        bw.write(first>last?"edward is right":"gunilla has a point");
        
        bw.close();
    } // end of main
} // end of Main class