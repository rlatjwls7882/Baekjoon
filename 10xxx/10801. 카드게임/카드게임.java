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
    	
    	// A와 B가 제시한 카드 입력
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int[] cardsA = new int[10];
    	
    	for(int i=0;i<10;i++)
    		cardsA[i] = Integer.valueOf(st.nextToken());
    	
    	st = new StringTokenizer(br.readLine());
    	int[] cardsB = new int[10];
    	
    	for(int i=0;i<10;i++)
    		cardsB[i] = Integer.valueOf(st.nextToken());
    	
    	// A와 B가 각각 이기는 횟수 계산
    	int winA=0, winB=0;
    	
    	for(int i=0;i<10;i++)
    		if(cardsA[i]>cardsB[i])
    			winA++;
    		else if(cardsB[i]>cardsA[i])
    			winB++;
    	
    	// 승리한 사람 출력
    	bw.write(winA>winB?"A":winB>winA?"B":"D");
    	
    	bw.close();
    } // end of main
} // end of Main class