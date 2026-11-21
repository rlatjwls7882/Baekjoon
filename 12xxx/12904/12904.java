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
        
        // 문자열 S, T 입력
        String S = br.readLine();
        String T = br.readLine();
        
        // 문자열 S, 뒤집어진S, T를 큐에 담기 
        Deque<Character> dequeS = new LinkedList<Character>();
        Deque<Character> dequeReverseS = new LinkedList<Character>();
        Deque<Character> dequeT = new LinkedList<Character>();
        
        for(int i=0;i<S.length();i++) {
        	dequeS.add(S.charAt(i));
        	dequeReverseS.add(S.charAt(S.length()-i-1));
        }
        
        for(int i=0;i<T.length();i++)
        	dequeT.add(T.charAt(i));
        
        // 문자열이 뒤집어졌는지 확인하는 변수
        boolean notReversed = true;
        
        while(true) {
        	
        	// 큐에 아무것도 없거나 S와 같아질때 종료
        	if(dequeT.size()==0
        			||(dequeT.equals(dequeS)&&notReversed)
        			||(dequeT.equals(dequeReverseS)&&!notReversed))
        		break;
        	
        	// 마지막이 A인 경우
        	else if(notReversed&&dequeT.peekLast()=='A')
        		dequeT.pollLast();
        	
        	// 마지막이 B인 경우
        	else if(notReversed&&dequeT.peekLast()=='B') {
        		dequeT.pollLast();
        		notReversed=false;
        	}
        	
        	// 처음이 A인 경우
        	else if(dequeT.peekFirst()=='A')
        		dequeT.pollFirst();
        	
        	// 처음이 B인 경우
        	else if(dequeT.peekFirst()=='B') {
        		dequeT.pollFirst();
        		notReversed=true;
        	}
        }
        
        // 문자열 T와 S가 같은지 판단
        if((dequeT.equals(dequeS)&&notReversed)
    			||(dequeT.equals(dequeReverseS)&&!notReversed))
        	bw.write("1");
        else
        	bw.write("0");
        
        bw.close();
    } // end of main
} // end of Main class