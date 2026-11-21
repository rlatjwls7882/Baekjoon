import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 정수 N 입력
        int N = Integer.valueOf(br.readLine());
        
        // N 크기의 카드 생성
        Deque<Integer> card = new LinkedList<Integer>();
        
        for(int i=1;i<=N;i++)
        	card.push(i);
        
        // 동작 반복
        for(int i=1;card.size()>1;i++) {
        	
        	// 홀수번째 인경우 삭제 
        	if(i%2==1)
        		card.pollLast();
        	
        	// 짝수번째 인경우 맨 뒤로 이동
        	else
        		card.push(card.pollLast());
        }
        
        // 제일 마지막에 남아있는 카드 출력
        bw.write(card.peek()+"");
        bw.close();
    } // end of main
} // end of Main class