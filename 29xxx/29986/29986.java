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
        
        // 놀이기구 수와 Carlitos의 키 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.valueOf(st.nextToken());
        int H = Integer.valueOf(st.nextToken());
        
        // Carlitos가 탈 수 있는 놀이기구의 수 계산
        st = new StringTokenizer(br.readLine());
        int num=0;
        
        while(N--!=0)
        	if(Integer.valueOf(st.nextToken())<=H)
        		num++;
        
        // Carlitos가 탈 수 있는 놀이기구의 수 출력
        bw.write(num+"");
        bw.close();
    } // end of main
} // end of Main class