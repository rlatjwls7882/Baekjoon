import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	while(true) {
    		
    		// 숫자로 이루어진 리스트 입력
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		ArrayList<Integer> list = new ArrayList<>();
    		
    		while(st.hasMoreTokens())
    			list.add(Integer.valueOf(st.nextToken()));
    		list.remove(list.size()-1);
    		
    		if(list.isEmpty()) break;
    		
    		// 각 숫자의 2배인 수의 개수 계산
    		int cnt=0;
    		
    		for(int i=0;i<list.size();i++)
    			for(int j=0;j<list.size();j++)
    				if(list.get(i)*2==list.get(j))
    					cnt++;
    		
    		bw.write(cnt+"\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class