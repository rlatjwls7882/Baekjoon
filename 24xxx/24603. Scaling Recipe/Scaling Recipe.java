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
        
        // 요리를 하는데 필요한 재료의 개수, 레시피대로 조리하면 나오는 x인분, 해야 하는 y인분 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.valueOf(st.nextToken());
        int x = Integer.valueOf(st.nextToken());
        int y = Integer.valueOf(st.nextToken());
        
        // y인분 하는데 필요한 재료의 양 출력
        while(n-->0)
        	bw.write(Integer.valueOf(br.readLine())*y/x+"\n");
        
        bw.close();
    } // end of main
} // end of Main class