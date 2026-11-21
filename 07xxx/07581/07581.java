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
        	
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int l = Integer.valueOf(st.nextToken());
        	int w = Integer.valueOf(st.nextToken());
        	int h = Integer.valueOf(st.nextToken());
        	int v = Integer.valueOf(st.nextToken());
        	
        	// 0 0 0 0 입력
        	if(l==0&&w==0&&h==0&&v==0)
        		break;
        	
        	// 0 ? ? ? 입력
        	else if(l==0)
        		l = v/h/w;
        	
        	// ? 0 ? ? 입력
        	else if(w==0)
        		w = v/h/l;
        	
        	// ? ? 0 ? 입력
        	else if(h==0)
        		h = v/l/w;
        	
        	// ? ? ? 0 입력
        	else
        		v = l*w*h;
        	
        	// l w h v 출력
        	bw.write(l+" "+w+" "+h+" "+v+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class