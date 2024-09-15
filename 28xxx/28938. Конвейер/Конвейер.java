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
        
        // 컨베이어 벨트를 움직일 횟수 N 입력
        int N = Integer.valueOf(br.readLine());
        
        // N번 움직인 후의 위치 계산
        StringTokenizer st = new StringTokenizer(br.readLine());
        int pos=0;
        
        while(N-->0) {
        	String move = st.nextToken();
        	
        	if(move.equals("1"))
        		pos++;
        	else if(move.equals("-1"))
        		pos--;
        }
        
        // N번 움직인 후의 위치 출력
        if(pos>0)
        	bw.write("Right");
        else if(pos<0)
        	bw.write("Left");
        else
        	bw.write("Stay");

        bw.close();
    } // end of main
} // end of Main class