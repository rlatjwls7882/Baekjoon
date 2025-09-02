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
    	
    	// 참가자 수 N 입력
    	int N = Integer.valueOf(br.readLine());
    	
    	// N명의 참가자의 값 입력
    	int[][] Score = new int[N][3];
    	
    	for(int i=0;i<N;i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		for(int j=0;j<3;j++)
    			Score[i][j] = Integer.valueOf(st.nextToken());
    	}
    	
    	// 1등 참가자 계산
    	int max=0;
    	
    	for(int i=1;i<N;i++) {
    		if(Score[i][0]>Score[max][0])
    			max=i;
    		
    		else if(Score[i][0]==Score[max][0]&&Score[i][1]<Score[max][1])
    			max=i;
    		
    		else if(Score[i][0]==Score[max][0]&&Score[i][1]==Score[max][1]&&Score[i][2]<Score[max][2])
    			max=i;
    	}
    	
    	// 1등 참가자의 번호 출력
    	bw.write(max+1+"");
    	bw.close();
    } // end of main
} // end of Main class