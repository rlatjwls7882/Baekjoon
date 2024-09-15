import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 문제 세트의 개수 n 입력
        int n = Integer.valueOf(br.readLine());
        
        while(n-->0) {
        	
        	// 첫번째 삼각형의 세 변의 길이 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	ArrayList<Integer> a = new ArrayList<Integer>();
        	
        	for(int i=0;i<3;i++)
        		a.add(Integer.valueOf(st.nextToken()));
        	Collections.sort(a);
        	
        	// 두번째 삼각형의 세 변의 길이 입력
        	st = new StringTokenizer(br.readLine());
        	ArrayList<Integer> b = new ArrayList<Integer>();
        	
        	for(int i=0;i<3;i++)
        		b.add(Integer.valueOf(st.nextToken()));
        	Collections.sort(b);
        	
        	// 직사각형을 잘라 두 삼각형을 만들 수 있는지 확인
        	if(a.equals(b)&&a.get(0)*a.get(0)+a.get(1)*a.get(1)==a.get(2)*a.get(2)
               &&b.get(0)*b.get(0)+b.get(1)*b.get(1)==b.get(2)*b.get(2))
        		bw.write("YES\n");
        	else
        		bw.write("NO\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class