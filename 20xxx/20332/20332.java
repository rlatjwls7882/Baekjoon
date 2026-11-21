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
        
        // 참가한 대회의 수 n 입력
        int n = Integer.valueOf(br.readLine());
        
        // 대회의 총 상금 계산
        int price=0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i=0;i<n;i++)
        	price += Integer.valueOf(st.nextToken());
        
        // 3명이 공평하게 상금을 나눌 수 있는지 출력
        if(price%3==0)
        	bw.write("yes");
        else
        	bw.write("no");
        
        bw.close();
    } // end of main
} // end of Main class