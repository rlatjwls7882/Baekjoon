import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 듣도 못한 사람의 수 N, 보도 못한 사람의 수 M 입력
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int N = Integer.valueOf(st.nextToken());
    	int M = Integer.valueOf(st.nextToken());
    	
    	// 듣도 못한 N명을 HashSet에 담기
    	HashSet<String> neverHeard = new HashSet<String>();
    	
    	while(N--!=0)
    		neverHeard.add(br.readLine());
    	
    	// 보도 못한 M명중 듣도 못한 사람의 수와 명단 계산
    	TreeSet<String> neverHeardNeverSeen = new TreeSet<String>();
    	int cnt=0;
    	
    	while(M--!=0) {
    		
    		String tmp = br.readLine();
    		
    		if(neverHeard.contains(tmp)) {
    			cnt++;
    			neverHeardNeverSeen.add(tmp);
    		}
    	}
    	
    	// 듣도 보도 못한 사람의 수와 명단 출력
    	bw.write(cnt+"\n");
    	
    	Iterator<String> it = neverHeardNeverSeen.iterator(); 
    	
    	while(it.hasNext())
    		bw.write(it.next()+"\n");
    	
    	bw.close();
    } // end of main
} // end of Main class