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
    	
    	// 카드 개수 N 입력
    	int N = Integer.valueOf(br.readLine());
    	
    	// N개의 카드 입력
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int[] cards = new int[N];
    	
    	for(int i=0;i<N;i++)
    		cards[i]=Integer.valueOf(st.nextToken());
    	
    	// 총점 계산
    	int sum=cards[0];
    	
    	for(int i=1;i<N;i++)
    		if(cards[i]!=cards[i-1]+1)
    			sum+=cards[i];
    	
    	// 총점 출력
    	bw.write(sum+"");
    	bw.close();
    } // end of main
} // end of Main class