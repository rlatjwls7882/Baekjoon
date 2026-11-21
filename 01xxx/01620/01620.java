import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 포켓몬 입력 수 N, 문제 수 M
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int N = Integer.valueOf(st.nextToken());
    	int M = Integer.valueOf(st.nextToken());
    	
    	// 도감에 N개의 포켓몬 입력
    	HashMap<String, Integer> poketmonList = new HashMap<String, Integer>();
    	String[] names = new String[N];
    	
    	for(int i=0;i<N;i++) {
    		names[i]=br.readLine();
    		poketmonList.put(names[i], i+1);
    	}
    	
    	// 도감에서 포켓몬 검색하여 출력
    	while(M--!=0) {
    		String name = br.readLine();
    		
    		// 이름이 입력되면 포켓몬 번호 출력
    		if(!('1'<=name.charAt(0)&&name.charAt(0)<='9'))
    			bw.write(poketmonList.get(name)+"\n");
    		
    		// 포켓몬 번호가 입력되면 이름 출력
    		else
    			bw.write(names[Integer.valueOf(name)-1]+"\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class