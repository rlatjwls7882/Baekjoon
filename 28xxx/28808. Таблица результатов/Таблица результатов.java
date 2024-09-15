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
        
        // 열 수 n 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.valueOf(st.nextToken());
        
        // '+'가 존재하는 열의 수 계산
        int num=0;
        
        while(n-->0)
        	if(br.readLine().indexOf("+")!=-1)
        		num++;
        
        // '+'가 존재하는 열의 수 출력
        bw.write(num+"");
        bw.close();
    } // end of main
} // end of Main class