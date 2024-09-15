import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 테스트 케이스의 개수 N 입력
        int N = Integer.valueOf(br.readLine());
        
        while(N-->0) {
        	
        	// 두 단어 A, B 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	String A = st.nextToken();
        	String B = st.nextToken();
        	
        	// A와 B가 애너그램인지 출력
        	char[] arrayA = A.toCharArray(); Arrays.sort(arrayA);
        	char[] arrayB = B.toCharArray(); Arrays.sort(arrayB);
        	
        	bw.write(String.format("%s & %s are %sanagrams.\n"
                                   , A, B, Arrays.equals(arrayA, arrayB)?"":"NOT "));
        }
        
        bw.close();
    } // end of main
} // end of Main class