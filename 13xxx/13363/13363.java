import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 현재 바늘의 방향과 가리켜야 하는 올바른 방향 입력
        int n1 = Integer.valueOf(br.readLine());
        int n2 = Integer.valueOf(br.readLine());
        
        // 시계순과 역시계순으로 움직이는 횟수 계산
        int case1=n2-n1;
        int case2=n1-n2;
        
        if(n2>n1)
        	case2 += 360;
        
        else
        	case1 += 360;
        
        
        // 최단 거리로 움직일 때 위치 변화 출력
        if(case1<=case2)
        	bw.write(case1+"");
        else
        	bw.write(-case2+"");
        
        bw.close();
    } // end of main
} // end of Main class