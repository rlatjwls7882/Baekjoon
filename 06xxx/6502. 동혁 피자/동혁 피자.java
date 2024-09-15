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
        
        for(int i=1;;i++) {
        	
        	// 식탁의 반지름과 피자의 크기
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int r = Integer.valueOf(st.nextToken());
        	if(r==0) break;
        	int w = Integer.valueOf(st.nextToken());
        	int l = Integer.valueOf(st.nextToken());
        	
        	// 피자가 식탁 위에 놓여질 수 있는지 확인
        	if(w*w+l*l<=r*r*4)
        		bw.write(String.format("Pizza %d fits on the table.\n", i));
        	else
        		bw.write(String.format("Pizza %d does not fit on the table.\n", i));
        }
        
        bw.close();
    } // end of main
} // end of Main class