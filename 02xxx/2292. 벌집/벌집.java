import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// N 입력
    	int N = Integer.valueOf(bf.readLine());
    	
    	// 1번방 통과
    	int cnt=1;
    	N--;
    	
    	// 2~n번방 통과
    	for(int tmp=6;N>0;tmp+=6) {
    		N-=tmp;
    		cnt++;
    	}
    	
    	// 지나간 방의 수 출력
    	bw.write(cnt+"");
    	bw.close();
    } // end of main
} // end of Main class