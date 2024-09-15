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
        
        // 한번에 올라가는 거리, 쉬는동안 내려가는 거리, 기둥의 높이 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.valueOf(st.nextToken());
        int b = Integer.valueOf(st.nextToken());
        int h = Integer.valueOf(st.nextToken());
        
        // 벌레가 올라가야 하는 횟수 계산
        
        // numa-(num-1)b >= h
        int num = (int)Math.ceil((h-b)/(double)(a-b));
        
        if(num<1) num=1;
        
        // 벌레가 올라가야 하는 횟수 출력
        bw.write(num+"");
        bw.close();
    } // end of main
} // end of Main class