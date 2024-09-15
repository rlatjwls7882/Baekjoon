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
        
        // 4개의 수박의 무게 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] watermelon = new int[4];
        
        for(int i=0;i<4;i++)
        	watermelon[i] = Integer.valueOf(st.nextToken());
        
        // 수박을 든 양손 무게 차이의 최솟값 출력
        Arrays.sort(watermelon);
        
        int case1 = Math.abs(watermelon[3]-watermelon[2]-watermelon[1]-watermelon[0]);
        int case2 = Math.abs(watermelon[3]-watermelon[2]-watermelon[1]+watermelon[0]);
        
        bw.write(Math.min(case1, case2)+"");
        bw.close();
    } // end of main
} // end of Main class