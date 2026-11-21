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
    	
    	// A와 B가 늘어놓은 카드 목록
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int[] cardsA = new int[10];
    	for(int i=0;i<10;i++)
    		cardsA[i] = Integer.valueOf(st.nextToken());
    	
    	st = new StringTokenizer(br.readLine());
    	int[] cardsB = new int[10];
    	for(int i=0;i<10;i++)
    		cardsB[i] = Integer.valueOf(st.nextToken());
    	
    	// A와 B의 점수와 마지막으로 이긴 사람 확인
    	int scoreA=0, scoreB=0;
    	char lastWin=' ';
    	
    	for(int i=0;i<10;i++)
    		if(cardsA[i]>cardsB[i]) {
    			scoreA+=3;
    			lastWin='A';
    		}
    		else if(cardsB[i]>cardsA[i]) {
    			scoreB+=3;
    			lastWin='B';
    		}
    		else {
				scoreA++;
				scoreB++;
			}
    	
    	// 이긴 사람 확인
    	bw.write(String.format("%d %d\n", scoreA, scoreB));
    	
    	if(scoreA>scoreB||scoreA==scoreB&&lastWin=='A')
    		bw.write("A");
    	else if(scoreB>scoreA||scoreA==scoreB&&lastWin=='B')
    		bw.write("B");
    	else
    		bw.write("D");
    	
    	bw.close();
    } // end of main
} // end of Main class