import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 테이블의 4개의 다리 길이 입력
        int[] a = new int[4];
        
        for(int i=0;i<4;i++)
        	a[i] = Integer.valueOf(br.readLine());
        
        // 가지고 있는 패드의 길이 b 입력
        int b = Integer.valueOf(br.readLine());
        
        // 테이블을 평평하게 만들 수 있는지 출력
        Arrays.sort(a);
        
        if(a[3]-a[0]==0||(a[0]+b==a[1]&&a[0]+b==a[3]))
        	bw.write("1");
        else
        	bw.write("0");
        
        bw.close();
    } // end of main
} // end of Main class