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
        
        // 테스트 케이스의 수
        int NumCases = Integer.valueOf(br.readLine());
        
        while(NumCases-->0) {
        	
        	// 조각의 수
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int piece = Integer.valueOf(st.nextToken());
        	
        	// 기물의 위치 입력
        	int[][] board = new int[8][8];
        	
        	while(piece-->0)
        		board[Integer.valueOf(st.nextToken())-1][Integer.valueOf(st.nextToken())-1]++;
        	
        	// 한 행의 최대 기물 수 계산
        	int max=0;
        	
        	for(int i=0;i<8;i++) {
        		
        		int row=0;
        		
        		for(int j=0;j<8;j++)
        			row += board[j][i];
        		
        		if(row>max) max=row;
        	}
        	
        	// 한 행의 최대 기물 수 출력
        	bw.write(max+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class