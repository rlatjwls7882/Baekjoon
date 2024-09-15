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
        int[] nums = new int[4];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i=0;i<4;i++)
        	nums[i] = Integer.valueOf(st.nextToken());
        
        // a/b + c/d가 최소가 되는 a b c d 순서로 출력
        Arrays.sort(nums);
        
        bw.write(String.format("%d %d %d %d", nums[0], nums[2], nums[1], nums[3]));
        
        bw.close();
    } // end of main
} // end of Main class