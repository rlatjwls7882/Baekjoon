import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	while(true) {
    		String string = bf.readLine();
    		StringTokenizer st = new StringTokenizer(string);
    		
    		// 0 입력시 종료
    		if(string.equals("0")) break;
    		
    		// 지난 년도 수
    		int a = Integer.valueOf(st.nextToken());
    		
    		// 나뭇잎 개수 계산
    		int LeafNum=1;
    		
    		for(int i=0;i<a;i++) {
    			LeafNum *= Integer.valueOf(st.nextToken());
    			LeafNum -= Integer.valueOf(st.nextToken());
    		}
    		
    		// 나뭇잎 개수 출력
    		bw.write(LeafNum+"\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class