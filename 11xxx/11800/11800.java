import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	String[] name = {"Yakk", "Doh", "Seh", "Ghar", "Bang", "Sheesh"};
    	
    	// 테스트 케이스의 수 입력
    	int T = Integer.valueOf(br.readLine());
    	
    	for(int i=1;i<=T;i++) {
    		
    		// a, b 입력
    		Integer[] num = new Integer[2];
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		num[0] = Integer.valueOf(st.nextToken());
    		num[1] = Integer.valueOf(st.nextToken());
    		Arrays.sort(num,Comparator.reverseOrder());
    		
    		// 출력
    		bw.write("Case "+i+": ");
    		
    		// 6 5인경우
    		if(num[0]==6&&num[1]==5)
    			bw.write("Sheesh Beesh\n");
    		
    		// 두 수가 같지 않은 경우
    		else if(num[0]!=num[1])
    			bw.write(name[num[0]-1]+" "+name[num[1]-1]+"\n");
    		
    		// 1 1인경우
    		else if(num[0]==1)
    			bw.write("Habb Yakk\n");
    		
    		// 2 2인경우
    		else if(num[0]==2)
    			bw.write("Dobara\n");
    		
    		// 3 3인경우
    		else if(num[0]==3)
    			bw.write("Dousa\n");
    		
    		// 4 4인경우
    		else if(num[0]==4)
    			bw.write("Dorgy\n");
    		
    		// 5 5인경우
    		else if(num[0]==5)
    			bw.write("Dabash\n");
    		
    		// 6 6인경우
    		else
    			bw.write("Dosh\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class