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
        
        while(true) {
        	
        	// 전체 인형의 수, 밤에 돌아오지 못한 인형의 수 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int A = Integer.valueOf(st.nextToken());
        	int B = Integer.valueOf(st.nextToken());
        	
        	// 인형이 없으면 종료
        	if(A==0&&B==0) break;
        	
        	// 인형 쌍의 수와 세 개로된 묶음 존재 여부 출력
        	int doll = A-B;
        	
        	// 침실에 있는 인형이 짝수개
        	if(doll%2==0)
        		bw.write(doll/2+" 0\n");
        	
        	// 침실에 있는 인형이 홀수개, 세 개로된 묶음 존재O
        	else if(doll>2)
        		bw.write((doll-3)/2+" 1\n");

        	// 침실에 있는 인형이 홀수개, 세 개로된 묶음 존재X
        	else
        		bw.write("0 0\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class