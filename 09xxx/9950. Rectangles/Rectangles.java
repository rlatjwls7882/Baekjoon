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
        	
        	// 직사각형의 길이, 너비, 넓이 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int l = Integer.valueOf(st.nextToken());
        	int w = Integer.valueOf(st.nextToken());
        	int a = Integer.valueOf(st.nextToken());
        	
        	if(l==0&&w==0) break;
        	
        	// 길이, 너비, 넓이 중 빠진 부분 채우기
        	if(l==0) l=a/w;
        	else if(w==0) w=a/l;
        	else a=l*w;
        	
        	// 직사각형의 길이, 너비, 넓이 출력
        	bw.write(String.format("%d %d %d\n", l, w, a));
        }
        
        bw.close();
    } // end of main
} // end of Main class