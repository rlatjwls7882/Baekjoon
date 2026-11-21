import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 출입기록의 수 N 입력
    	int N = Integer.valueOf(br.readLine());
    	
    	// N개의 출입기록 입력
    	TreeSet<String> names = new TreeSet<String>();
    	
    	while(N--!=0) {
    		
    		// 이름과 출근/퇴근 여부 입력
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		String name = st.nextToken();
    		String inout = st.nextToken();
    		
    		// enter 일경우 집합에 추가
    		if(inout.equals("enter"))
    			names.add(name);
    		
    		// leave 일경우 집합에서 삭제
    		else names.remove(name);
    	}
    	
    	// 현재 회사에 있는 사람의 이름을 사전 역순으로 출력
    	Iterator<String> it = names.descendingIterator();
    	
    	while(it.hasNext())
    		bw.write(it.next()+"\n");
    	
    	bw.close();
    } // end of main
} // end of Main class