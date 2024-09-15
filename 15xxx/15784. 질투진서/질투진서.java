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
    	
    	// 행과 열의 수 N, 진서의 위치 a, b 1씩 줄여 입력
    	StringTokenizer st = new StringTokenizer(br.readLine()); 
    	int N = Integer.valueOf(st.nextToken());
    	int a = Integer.valueOf(st.nextToken())-1;
    	int b = Integer.valueOf(st.nextToken())-1;
    	
    	// 모든 행과 열에 학생들의 매력지수 입력
    	int[][] charm = new int[N][N];
    	
    	for(int i=0;i<N;i++) {
    		st = new StringTokenizer(br.readLine());
    		
    		for(int j=0;j<N;j++)
    			charm[i][j]=Integer.valueOf(st.nextToken());
    	}
    	
    	// 진서가 있는 행과 열에 진서보다 높은 매력지수가 있는지 확인
    	String isHappy="HAPPY";
    	
    	for(int i=0;i<N;i++)
    		
    		if(charm[i][b]>charm[a][b]||charm[a][i]>charm[a][b]) {
    			isHappy="ANGRY";
    			break;
    		}
    	
    	// 진서가 행복한지 출력
    	bw.write(isHappy);
    	bw.close();
    } // end of main
} // end of Main class