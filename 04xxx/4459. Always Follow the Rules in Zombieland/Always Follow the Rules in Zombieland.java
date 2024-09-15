import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 규칙의 수 입력
        int N = Integer.valueOf(br.readLine());
        
        // N개의 규칙 생성
        String[] rules = new String[N];
        
        for(int i=0;i<N;i++)
        	rules[i] = br.readLine();
        
        // 출력할 규칙의 수 입력
        int M = Integer.valueOf(br.readLine());
        
        // M개의 규칙 검색
        for(int i=0;i<M;i++) {
        	
        	// 검색할 규칙의 번호 입력
        	int index = Integer.valueOf(br.readLine());
        	
        	// index 번째의 규칙 출력
        	if(1<=index&&index<=N)
        		bw.write(String.format("Rule %d: %s\n", index, rules[index-1]));
        	else
        		bw.write(String.format("Rule %d: No such rule\n", index));
        }
        
        bw.close();
    } // end of main
} // end of Main class