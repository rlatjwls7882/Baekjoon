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
    	
    	// 정수 개수 n 입력
    	int n = Integer.valueOf(br.readLine());
    	
    	// 모든 카드를 입력
    	int[] cards = new int[n];
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int cardsSum=0;
    	
    	for(int i=0;i<n;i++) {
    		cards[i] = Integer.valueOf(st.nextToken());
    		cardsSum += cards[i];
    	}
    	
    	// 1~n-1번째 카드의 합이 n번째 카드인 위치를 찾아 출력
    	for(int i=0;i<n;i++)
    		if(cardsSum==cards[i]*2) {
    			bw.write(i+1+"");
    			break;
    		}
    	
    	bw.close();
    } // end of main
} // end of Main class