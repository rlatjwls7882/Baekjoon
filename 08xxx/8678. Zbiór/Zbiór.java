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

        // 데이터 셋의 수 z 입력
        int z = Integer.valueOf(br.readLine());
        
        while(z--!=0) {
        	
        	// 두 정수 a, b 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int a = Integer.valueOf(st.nextToken());
        	int b = Integer.valueOf(st.nextToken());
        	
        	// a의 약수의 집합이 b의 약수 집합에 포함되는지 확인
        	boolean include=true;
        	
        	for(int i=1;i<=a/2;i++)
        		if(a%i==0)
        			if(b%i!=0||b%(a/i)!=0) {
        				include=false;
        				break;
        			}
        	
        	if(include)
        		bw.write("TAK\n");
        	else
        		bw.write("NIE\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class