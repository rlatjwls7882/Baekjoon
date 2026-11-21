import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// W 대학의 점수 계산
    	PriorityQueue<Integer> score = new PriorityQueue<>(Collections.reverseOrder());
    	for(int i=0;i<10;i++)
    		score.add(Integer.valueOf(br.readLine()));
    	
    	bw.write(score.poll()+score.poll()+score.poll()+" ");
    	
    	// K 대학의 점수 계산
    	score.clear();
    	for(int i=0;i<10;i++)
    		score.add(Integer.valueOf(br.readLine()));
    	
    	bw.write(score.poll()+score.poll()+score.poll()+"");
    	
    	bw.close();
    } // end of main
} // end of Main class