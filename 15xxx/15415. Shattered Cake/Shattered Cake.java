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
        
        // 케이크의 가로의 길이 W, 조각난 케이크의 수 N 입력
        int W = Integer.valueOf(br.readLine());
        int N = Integer.valueOf(br.readLine());
        
        // 케이크의 가로X세로의 크기 계산
        int size=0;
        
        while(N--!=0) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	size += Integer.valueOf(st.nextToken())*Integer.valueOf(st.nextToken());
        }
        
        // 케이크의 세로의 크기 출력
        bw.write(size/W+"");
        bw.close();
    } // end of main
} // end of Main class