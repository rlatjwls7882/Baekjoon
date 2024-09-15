import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 문제의 수 n 입력
        int n = Integer.valueOf(br.readLine());
        
        // n개의 문제 입력
        TreeSet<Character> contest = new TreeSet<Character>();
        
        while(n-->0)
        	contest.add(br.readLine().charAt(0));
        
        // 좋은 대회의 최대 문제의 수 계산
        Iterator<Character> it = contest.iterator();
        int good=0;
        
        for(int i=0;it.hasNext();i++) {
        	if(it.next()-'A'-i==0)
        		good++;
        	else
        		break;
        }
        
        // 좋은 대회의 최대 문제의 수 출력
        bw.write(good+"");
        bw.close();
    } // end of main
} // end of Main class