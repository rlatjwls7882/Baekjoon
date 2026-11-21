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
        
        // 봉우리의 수 N 입력
        int N = Integer.valueOf(br.readLine());
        
        // 봉우리 입력
        int[] mountain = new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++)
        	mountain[i] = Integer.valueOf(st.nextToken());
        
        // 최고의 활잡이가 처치한 적의 수 계산
        int bestKill=0;
        
        for(int i=0;i<N-1;i++) {
        	
        	// i번째 활잡이가 처치하는 적의 수
        	int iKill=0;
        	for(int j=i+1;j<N&&mountain[j]<mountain[i];j++)
        		iKill++;
        	
        	if(bestKill<iKill)
        		bestKill=iKill;
        }
        
        // 최고의 활잡이가 처치한 적의 수 출력
        bw.write(bestKill+"");
        bw.close();
    } // end of main
} // end of Main class
