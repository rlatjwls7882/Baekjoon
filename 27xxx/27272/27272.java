import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 4개의 정수 입력
        int[] abcd = new int[4];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i=0;i<4;i++)
        	abcd[i] = Integer.valueOf(st.nextToken());
        
        // 네 정수의 곱의 합의 최댓값 출력
        Arrays.sort(abcd);
        
        bw.write(abcd[0]*abcd[1]+abcd[2]*abcd[3]+"");
        bw.close();
    } // end of main
} // end of Main class