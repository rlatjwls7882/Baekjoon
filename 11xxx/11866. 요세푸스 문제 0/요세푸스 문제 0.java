import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// N, K-1 입력
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int N = Integer.valueOf(st.nextToken());
    	int K = Integer.valueOf(st.nextToken())-1;
    	
    	// 1~N의 원순열 생성
    	LinkedList<Integer> Yose = new LinkedList<Integer>();
    	
    	for(int i=1;i<=N;i++)
    		Yose.add(i);
    	
    	// 요세푸스 순열 계산
    	StringBuilder sb = new StringBuilder();
    	sb.append("<");
    	
    	int pos = K;
    	while(Yose.size()!=1) {
    		
    		// 원에서 제거되는 위치 계산
    		if(pos>Yose.size()-1) pos=pos%Yose.size();
    		
    		// 원에서 삭제
    		sb.append(Yose.get(pos)+", ");
    		Yose.remove(pos);
    		
    		pos+=K;
    	}
    	sb.append(Yose.get(0)+">");
    	
    	// 요세푸스 순열 출력
    	bw.write(sb+"");
    	bw.close();
    } // end of main
} // end of Main class