import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 가지고 있는 카드 수 입력
    	int N = Integer.valueOf(br.readLine());
    	
    	// 가지고 있는 카드 목록
    	HashSet<String> cards = new HashSet<String>(N);
    	
    	// 가지고 있는 카드 입력
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	while(N--!=0)
    		cards.add(st.nextToken());
    	
    	// 검색할 카드 수 입력
    	int M = Integer.valueOf(br.readLine());
    	
    	// 검색하여 결과 출력
    	st = new StringTokenizer(br.readLine());
    	
    	for(int i=0;i<M;i++) {
    		
    		// 출력값 사이 공백
    		if(i!=0) bw.write(" ");
    		
    		// 카드가 있으면 1, 없으면 0 출력
    		if(cards.contains(st.nextToken()))
    				bw.write("1");
    		else
    			bw.write("0");
    	}

    	bw.close();
    } // end of main
} // end of Main class