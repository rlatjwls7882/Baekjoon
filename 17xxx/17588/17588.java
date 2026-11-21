import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 정수의 개수 N 입력
        int N = Integer.valueOf(br.readLine());
        
        // N개의 정수 입력
        int[] nums = new int[N+1];
        
        nums[0]=0;
        
        for(int i=1;i<N+1;i++)
        	nums[i] = Integer.valueOf(br.readLine());
        
        // 빠진 정수가 있는지 확인
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<N;i++)
        	for(int j=nums[i]+1;j<nums[i+1];j++)
        		sb.append(j).append("\n");
        
        // 빠진 정수가 있으면 출력
        if(sb.isEmpty())
        	bw.write("good job");
        else
        	bw.write(sb+"");
        
        bw.close();
    } // end of main
} // end of Main class