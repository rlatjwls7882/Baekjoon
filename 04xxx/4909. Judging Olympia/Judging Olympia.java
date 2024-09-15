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
        
        while(true) {
        	
        	// 6개의 점수 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int[] score = new int[6];
        	
        	for(int i=0;i<6;i++)
        		score[i] = Integer.valueOf(st.nextToken());
        	
        	// 모든 점수가 0점인 경우 종료
        	Arrays.sort(score);
        	
        	if(score[0]==0&&score[5]==0)
        		break;
        	
        	// 점수의 최댓값과 최솟값을 제외한 합 계산
        	int sum=0;
        	
        	for(int i=1;i<5;i++)
        		sum += score[i];
        	
        	// 평균 출력
        	double average = sum/4.0;
        	
        	if(average==(int)average)
        		bw.write((int)average+"\n");
        	else
        		bw.write(average+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class