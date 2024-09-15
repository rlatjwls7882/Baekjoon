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
        	
        	// 동창의 수 N, 조직된 저녁 식사의 수 D 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int N = Integer.valueOf(st.nextToken());
        	int D = Integer.valueOf(st.nextToken());
        	
        	if(N==0) break;
        	
        	// 동창들의 저녁식사 참가횟수 계산
        	int[] participation = new int[N];
        	
        	for(int i=0;i<D;i++) {
        		
        		st = new StringTokenizer(br.readLine());
        		
        		for(int j=0;j<N;j++)
        			participation[j] += Integer.valueOf(st.nextToken());
        	}
        	
        	// 모든 저녁식사에 참가한 동창이 있는지 확인
        	String everytime = "no";
        	
        	for(int i=0;i<N;i++)
        		if(participation[i]==D) {
        			everytime = "yes";
        			break;
        		}
        	
        	bw.write(everytime+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class