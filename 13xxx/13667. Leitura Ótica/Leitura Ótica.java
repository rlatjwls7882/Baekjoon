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
        
        while(true) {
        	
        	// 답안지의 질문의 수 N 입력
        	int N = Integer.valueOf(br.readLine());
        	if(N==0) break;
        	
        	while(N-->0) {
        		
        		// 각 답변 대안에 대한 평균 그레이 레벨 값 입력
        		StringTokenizer st = new StringTokenizer(br.readLine());
        		int[] question = new int[5];
        		
        		for(int i=0;i<5;i++)
        			question[i] = Integer.valueOf(st.nextToken());
        		
        		// 색칠한 칸의 위치와 개수 계산
        		int answer=0, num=0;
        		
        		for(int i=0;i<5;i++)
        			if(question[i]<=127) {
        				answer=i;
        				num++;
        			}
        		
        		// 색칠한 칸이 올바른지 출력
        		if(num==1)
        			bw.write((char)(65+answer)+"\n");
        		else
        			bw.write("*\n");
        	}
        }
        
        bw.close();
    } // end of main
} // end of Main class