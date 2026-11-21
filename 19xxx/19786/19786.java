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
        
        // 게임 상황의 개수 t 입력
        int t = Integer.valueOf(br.readLine());
        
        while(t-->0) {
        	
        	// A, C 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int A = Integer.valueOf(st.nextToken());
        	int C = Integer.valueOf(st.nextToken());
        	
        	// r, g, b 입력
        	st = new StringTokenizer(br.readLine());
        	int r = Integer.valueOf(st.nextToken());
        	int g = Integer.valueOf(st.nextToken());
        	int b = Integer.valueOf(st.nextToken());
        	
        	// 최댓값이 되는 경우 출력
        	int rPlus = A*((r+1)*(r+1)+g*g+b*b)+C*Math.min(r+1, Math.min(g, b));
        	int gPlus = A*(r*r+(g+1)*(g+1)+b*b)+C*Math.min(r, Math.min(g+1, b));
        	int bPlus = A*(r*r+g*g+(b+1)*(b+1))+C*Math.min(r, Math.min(g, b+1));
        	
        	if(rPlus>=gPlus&&rPlus>=bPlus)
        		bw.write("RED\n");
        	else if(gPlus>=bPlus)
        		bw.write("GREEN\n");
        	else
        		bw.write("BLUE\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class