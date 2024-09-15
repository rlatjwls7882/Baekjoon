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

        // 테스트 케이스의 수 T 입력
        int T = Integer.valueOf(br.readLine());
        
        while(T--!=0) {
        	
        	// 후보자의 수 N, 투표 지역의 수 M 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int N = Integer.valueOf(st.nextToken());
        	int M = Integer.valueOf(st.nextToken());
        	
        	// 각 후보자의 투표수 계산
        	int[] votes = new int[N];
        	
        	while(M--!=0) {
        		st = new StringTokenizer(br.readLine());
        		
        		for(int i=0;i<N;i++)
        			votes[i] += Integer.valueOf(st.nextToken());
        	}
        	
        	// 투표수가 가장 많은 후보자 출력
        	int maxvotes=0, winner=0;
        	
        	for(int i=0;i<N;i++)
        		if(maxvotes<votes[i]) {
        			maxvotes = votes[i];
        			winner = i+1;
        		}
        	
        	bw.write(winner+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class