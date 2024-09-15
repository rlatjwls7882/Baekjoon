import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.valueOf(br.readLine());
        
        // 가장 많이 가지고 있는 정수 확인
        TreeMap<Long, Long> hashMap = new TreeMap<>();
        
        while(N-->0) {
        	long tmp = Long.valueOf(br.readLine());
        	hashMap.put(tmp, hashMap.getOrDefault(tmp, 0L)+1);
        }
        
        long max=0;
        for(long i:hashMap.values())
        	if(max<i) max=i;
        
        for(long i:hashMap.keySet())
        	if(hashMap.get(i)==max) {
        		bw.write(i+"");
        		break;
        	}
        
        bw.close();
    } // end of main
} // end of Main class