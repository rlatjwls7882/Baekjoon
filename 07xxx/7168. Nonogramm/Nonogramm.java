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
        
        // 행 N, 열 M 크기의 그리드 생성
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.valueOf(st.nextToken());
        int M = Integer.valueOf(st.nextToken());
        
        String[] grid = new String[N];
        
        for(int i=0;i<N;i++)
        	grid[i] = br.readLine();
        
        // 행 앞의 숫자 출력
        for(int i=0;i<N;i++) {
        	int cnt=0;
        	boolean isPrint=false;
        	
        	for(int j=0;j<M;j++) {
        		
        		if(grid[i].charAt(j)=='#')
        			cnt++;
        		
        		else {
        			if(cnt!=0) {
        				bw.write(cnt+" ");
        				isPrint=true;
        			}
        			cnt=0;
        		}
        	}
        	
        	if(!isPrint||cnt!=0)
        		bw.write(cnt+"\n");
        	else
        		bw.write("\n");
        }
        
        // 열 앞의 숫자 출력
        for(int i=0;i<M;i++) {
        	int cnt=0;
        	boolean isPrint=false;
        	
        	for(int j=0;j<N;j++) {
        		
        		if(grid[j].charAt(i)=='#')
        			cnt++;
        		
        		else {
        			if(cnt!=0) {
        				bw.write(cnt+" ");
        				isPrint=true;
        			}
        			cnt=0;
        		}
        	}
        	
        	if(!isPrint||cnt!=0)
        		bw.write(cnt+"\n");
        	else
        		bw.write("\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class