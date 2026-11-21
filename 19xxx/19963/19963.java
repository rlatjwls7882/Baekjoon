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
        
        // 아이들의 총 인원수 n, 첫번째와 두번째 꾸러미에 있는 선물수 m k 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.valueOf(st.nextToken());
        int m = Integer.valueOf(st.nextToken());
        int k = Integer.valueOf(st.nextToken());
        
        // 아이들에게 주어야 하는 선물 목록 생성
        HashSet<Integer> gift = new HashSet<Integer>();
        
        for(int i=1;i<=n;i++)
        	gift.add(i);
        
        // 아이들에게 m개와 k개의 선물 제공
        st = new StringTokenizer(br.readLine());
        while(m-->0)
        	gift.remove(Integer.valueOf(st.nextToken()));
        
        st = new StringTokenizer(br.readLine());
        while(k-->0)
        	gift.remove(Integer.valueOf(st.nextToken()));
        
        // 아이들에게 나누어주지 못한 선물의 수와 목록 출력
        bw.write(gift.size()+"\n");
        
        Iterator<Integer> it = gift.iterator();
        while(it.hasNext())
        	bw.write(it.next()+" ");
        
        bw.close();
    } // end of main
} // end of Main class