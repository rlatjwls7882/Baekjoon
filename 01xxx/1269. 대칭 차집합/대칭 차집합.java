import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 집합 A의 개수와 집합 B의 개수 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int Anum = Integer.valueOf(st.nextToken());
        int Bnum = Integer.valueOf(st.nextToken());
        
        // 집합 A, B 입력
        HashSet<String> A = new HashSet<String>(); 
        HashSet<String> B = new HashSet<String>(); 
        
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<Anum;i++)
        	A.add(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<Bnum;i++)
        	B.add(st.nextToken());
        
        // 대칭 차집합의 원소의 개수 계산
        // (A-B) + (B-A) = A∪B-A∩B
        int cnt=Anum+Bnum;
        
        Iterator<String> it = A.iterator();
        
        for(int i=0;i<Anum;i++)
        	if(B.contains(it.next()))
        		cnt-=2;
        
        // 대칭 차집합의 원소의 개수 출력
        bw.write(cnt+"");
        bw.close();
    } // end of main
} // end of Main class