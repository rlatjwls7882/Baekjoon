import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	// 자연수의 개수 n 입력
    	int n = Integer.valueOf(br.readLine());
    	
    	// 자연수 n개의 공약수 계산
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int A = Integer.valueOf(st.nextToken());
    	int B = Integer.valueOf(st.nextToken());
    	
    	while(B!=0) {
    		int tmp=A%B;
    		A=B;
    		B=tmp;
    	}
    	
    	if(n==3) {
    		B = Integer.valueOf(st.nextToken());
    		while(B!=0) {
    			int tmp=A%B;
    			A=B;
    			B=tmp;
    		}
    	}
    	
    	// 공약수의 약수의 종류 확인
    	TreeSet<Integer> divisor = new TreeSet<>();
    	
    	for(int i=1;i*i<=A;i++)
    		if(A%i==0) {
    			divisor.add(i);
    			divisor.add(A/i);
    		}
    	
    	divisor.forEach(System.out::println);
        
    } // end of main
} // end of Main class