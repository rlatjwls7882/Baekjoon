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
    	
    	// 경기의 수 N, 상대팀의 점수 Ai, 비누스팀의 점수 Bi 입력
    	int N = Integer.valueOf(br.readLine());
    	StringTokenizer Bi = new StringTokenizer(br.readLine());
    	StringTokenizer Ai = new StringTokenizer(br.readLine());
    	
    	// 비누스팀 점수 계산
    	int binusScore=0;
    	
    	while(N--!=0) {
    		int A = Integer.valueOf(Ai.nextToken());
    		int B = Integer.valueOf(Bi.nextToken());
    		
    		if(B>A) binusScore+=3;
    		else if(B==A) binusScore+=1;
    	}
    	
    	// 비누스팀 점수 출력
    	bw.write(binusScore+"");
    	bw.close();
    } // end of main
} // end of Main class