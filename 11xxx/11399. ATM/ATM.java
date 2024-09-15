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
        
        // 사람의 수 N 입력
        int N = Integer.valueOf(br.readLine());
        
        // N명이 돈을 인출하는데 걸리는 시간 입력
        int[] people = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i=0;i<N;i++)
        	people[i] = Integer.valueOf(st.nextToken());
        
        Arrays.sort(people);
        
        // 각 사람이 돈을 인출하는데 필요한 시간의 합의 최솟값 계산
        int time=0, totalTime=0;
        
        for(int i=0;i<N;i++) {
        	time+=people[i];
        	totalTime += time;
        }
        
        // 필요한 시간의 합 출력
        bw.write(totalTime+"");
        bw.close();
    } // end of main
} // end of Main class