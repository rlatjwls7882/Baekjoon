import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 사람 수 N 입력
    	int N = Integer.valueOf(br.readLine());
    	
    	// 배열에 자신의 선물 위치 넣기
    	int[] giftsNum = new int[N];
    	
    	for(int i=1;i<=N;i++)
    		giftsNum[Integer.valueOf(br.readLine())-1] = i;
    	
    	// 자신의 선물 위치 출력
    	for(int i=0;i<N;i++)
    		bw.write(giftsNum[i]+"\n");
    	
    	bw.close();
    } // end of main
} // end of Main class