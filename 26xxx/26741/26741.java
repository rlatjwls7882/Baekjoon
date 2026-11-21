import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 머리수와 다리수 입력
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int heads = Integer.valueOf(st.nextToken());
    	int legs = Integer.valueOf(st.nextToken());
    	
    	// 닭과 소의 수 계산
    	
    	// 2*chicks+4*cows = legs
    	// chicks+cows = heads
    	// ∴ cows = (legs-2*heads)/2, chicks = heads - cows
    	int cows = (legs-2*heads)/2;
    	int chicks = heads - cows;
    	
    	// 출력
    	bw.write(chicks+" "+cows);
    	bw.close();
    } // end of main
} // end of Main class