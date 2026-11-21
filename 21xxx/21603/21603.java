import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 두 정수 N, K 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.valueOf(st.nextToken());
        int K = Integer.valueOf(st.nextToken());
        
        // f(K), f(2K) 생성
        int fK = K%10, f2K = K*2%10;
        
        // 말해야할 수 찾기
        LinkedList<Integer> say = new LinkedList<Integer>();
        
        for(int i=1;i<=N;i++)
        	if(i%10!=fK&&i%10!=f2K)
        		say.add(i);
        
        // 말해야 할 수의 개수와 종류 출력
        bw.write(say.size()+"\n");
        
        Iterator<Integer> it = say.iterator();
        while(it.hasNext())
        	bw.write(it.next()+" ");
        
        bw.close();
    } // end of main
} // end of Main class