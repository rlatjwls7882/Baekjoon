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
        
        // 바나나가 움직일 수 있는 직선의 개수 N 입력
        int N = Integer.valueOf(br.readLine());
        
        // X, Y, R 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int X = Integer.valueOf(st.nextToken());
        int Y = Integer.valueOf(st.nextToken());
        int R = Integer.valueOf(st.nextToken());
        
        // 포지션 제로 내부에 들어가는 직선의 수와 경계에만 들어가는 직선의 수 계산
        int inside=0, border=0;
        
        while(N-->0) {
            
        	int tmp = Integer.valueOf(br.readLine());
        	
        	if(X-R<tmp&&tmp<X+R)
        		inside++;
        	else if(tmp==X-R||tmp==X+R)
        		border++;
        }
        
        // 포지션 제로 내부에 들어가는 직선의 수와 경계에만 들어가는 직선의 수 출력
        bw.write(inside+" "+border);
        
        bw.close();
    } // end of main
} // end of Main class