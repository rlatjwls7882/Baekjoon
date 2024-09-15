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
        
        // x1~x10 입력
        int[] x = new int[10];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i=0;i<10;i++)
        	x[i] = Integer.valueOf(st.nextToken());
        
        // f(x1, x2, x3, x4, x5, x6, x7, x8, x9, x10)의 값 계산
        int f=0;
        
        // 두개를 선택해 만든 순서쌍
        for(int i=0;i<10;i++)
        	for(int j=i+1;j<10;j++)
        		if(x[i]==1||x[j]==1)
        			f ^= 1;
        
        // 세개를 선택해 만든 순서쌍
        for(int i=0;i<10;i++)
        	for(int j=i+1;j<10;j++)
        		for(int k=j+1;k<10;k++)
        		if(x[i]==1||x[j]==1||x[k]==1)
        			f ^= 1;
        
        // f(x1, x2, x3, x4, x5, x6, x7, x8, x9, x10)의 값 출력
        bw.write(f+"");
        bw.close();
    } // end of main
} // end of Main class