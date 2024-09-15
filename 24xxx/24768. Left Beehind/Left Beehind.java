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
        	
        	// 달콤한 꿀과 상한 꿀 항아리의 수 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int x = Integer.valueOf(st.nextToken());
        	int y = Integer.valueOf(st.nextToken());
        	
            // 0 0 입력시 종료
        	if(x==0&&y==0) break;
        	
        	// 빌이 딱 13개의 항아리만 가져오는 경우
        	if(x+y==13)
        		bw.write("Never speak again.\n");
        	
        	// 달콤한 꿀이 상한 꿀보다 많은 경우
        	else if(x>y)
        		bw.write("To the convention.\n");
        	
        	// 상한 꿀이 달콤한 꿀보다 많은 경우
        	else if(y>x)
        		bw.write("Left beehind.\n");
        	
        	// 달콤한 꿀과 상한 꿀 항아리의 개수가 같은 경우
        	else
        		bw.write("Undecided.\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class