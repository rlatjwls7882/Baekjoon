import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 잡초의 크기 J, 문제수 N 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int J = Integer.valueOf(st.nextToken());
        int N = Integer.valueOf(st.nextToken());
        
        // 잡초보다 크기가 크지 않은 풀만한 문제수 계산
        int solvable=0;
        
        while(N--!=0) {
        	String ploblem = br.readLine();
        	
        	// 문제의 크기 계산
        	int size=0;
        	
        	for(int i=0;i<ploblem.length();i++) {
        		if('A'<=ploblem.charAt(i)&&ploblem.charAt(i)<='Z')
        			size+=4;
        		else if(ploblem.charAt(i)==' ')
        			size+=1;
        		else
        			size+=2;
        	}
        	
        	// 크기가 잡초보다 크지 않은 경우
        	if(size<=J)
        		solvable++;
        }
        
        // 잡초보다 크기가 크지 않은 풀만한 문제수 출력
        bw.write(solvable+"");
        bw.close();
    } // end of main
} // end of Main class