import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 명령의 수 N 입력
        int N = Integer.valueOf(br.readLine());
        
        // 적어낸 수의 합 계산
        Stack<Integer> num = new Stack<Integer>();
        int sum=0;
        
        while(N--!=0) {
        	int input = Integer.valueOf(br.readLine());
        	
        	// 0이 입력되는 경우 저장되어 있는 수 제거
        	if(input==0)
        		sum -= num.pop();
        	
        	else {
        		sum += input;
        		num.push(input);
        	}
        }
        
        // 재민이가 적어 낸 수의 합 출력
        bw.write(sum+"");
        bw.close();
    } // end of main
} // end of Main class