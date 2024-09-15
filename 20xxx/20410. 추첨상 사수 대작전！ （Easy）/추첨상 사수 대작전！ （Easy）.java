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
        
        // m, Seed, X1, X2 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.valueOf(st.nextToken());
        int Seed = Integer.valueOf(st.nextToken());
        int X1 = Integer.valueOf(st.nextToken());
        int X2 = Integer.valueOf(st.nextToken());
        
        // 준표가 비밀리에 선정한 정수 a, c를 출력
        for(int a=0;a<m;a++)
        	for(int c=0;c<m;c++)
        		
        		if((a*Seed+c)%m==X1)
        			if((a*X1+c)%m==X2) {
        				
        				bw.write(a+" "+c);
        				bw.close();
        				return;
        			}
        
    } // end of main
} // end of Main class