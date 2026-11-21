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
        
        // 응시한 과목 수 T 입력
        int T = Integer.valueOf(br.readLine());
        
        // 국어 수학 영어 탐구 제2외국어 순서로 점수 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] score = new int[5];
        
        for(int i=0;i<T;i++)
        	score[i] = Integer.valueOf(st.nextToken());
        
        // 학번 계산
        int hakbeon=0;
        
        // 국어, 영어
        if(score[0]>score[2])
        	hakbeon += (score[0] - score[2])*508;
        else
        	hakbeon += (score[2] - score[0])*108;
        
        // 수학, 탐구
        if(score[1]>score[3])
        	hakbeon += (score[1] - score[3])*212;
        else
        	hakbeon += (score[3] - score[1])*305;
        
        // 제2외국어
        if(T==5)
        	hakbeon += score[4]*707;
        
        hakbeon*=4763;
        
        // 학번 출력
        bw.write(hakbeon+"");
        bw.close();
    } // end of main
} // end of Main class