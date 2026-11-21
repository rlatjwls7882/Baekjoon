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
                                                                                           
        // T개의 테스트 케이스 수행                                                                  
        int T = Integer.valueOf(br.readLine());                                            
                                                                                           
        for(int caseNum=1;caseNum<=T;caseNum++) {                                          
        	                                                                               
        	// 마지막 레벨 N, 현재 레벨 K, 검의 위치 S 입력                                               
        	StringTokenizer st = new StringTokenizer(br.readLine());                       
        	int N = Integer.valueOf(st.nextToken());                                       
        	int K = Integer.valueOf(st.nextToken());                                       
        	int S = Integer.valueOf(st.nextToken());                                       
        	                                                                               
        	// 게임을 끝내는 데 필요한 최소 시간 출력                                                      
        	                                                                               
        	// 뒤로 돌아갔다 오는데 걸리는 시간 : (K-1)+(K-S)+(N+1-S)                                    
        	// 처음부터 시작해서 오는데 걸리는 시간 : (K-1)+(N+1)                                          
        	if(K<S*2)                                                                      
        		bw.write(String.format("Case #%d: %d\n", caseNum, N+(K-S)*2));             
        	else                                                                           
        		bw.write(String.format("Case #%d: %d\n", caseNum, N+K));                   
        }                                                                                  
                                                                                           
        bw.close();                                                                        
    } // end of main                                                                       
} // end of Main class                                                                     