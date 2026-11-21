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
        
        // 왕의 아들의 수
        int n = Integer.valueOf(br.readLine());
        
        // 야만인을 물리칠 확률을 계산하는데 사용되는 지수
        int exponent = Integer.valueOf(br.readLine());
        
        // 야만인을 물리칠 수 있는 최대 확률 계산
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max=0;
        
        while(n-->0) {
        	int power = (int)Math.pow(Integer.valueOf(st.nextToken()), exponent);
        	
        	if(power>0) max += power;
        }
        
        // 야만인을 물리칠 수 있는 최대 확률 출력
        bw.write(max+"");
        
        bw.close();
    } // end of main
} // end of Main class