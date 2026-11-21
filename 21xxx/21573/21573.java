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
        
        // 방의 온도와 희망 온도, 작동 모드 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int troom = Integer.valueOf(st.nextToken());
        int tcond = Integer.valueOf(st.nextToken());
        String mod = br.readLine();
        
        // 방의 온도를 높이길 원하는 경우
        if(troom<tcond) {
        	if(mod.equals("heat")||mod.equals("auto"))
        		bw.write(tcond+"");
        	else
        		bw.write(troom+"");
        }
        
        // 방의 온도를 낮추길 원하는 경우
        else {
        	if(mod.equals("freeze")||mod.equals("auto"))
        		bw.write(tcond+"");
        	else
        		bw.write(troom+"");
        }
        
        bw.close();
    } // end of main
} // end of Main class