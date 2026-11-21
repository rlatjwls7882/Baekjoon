import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 베시, 데이지, 존의 좌표 입력
    	StringTokenizer st = new StringTokenizer(bf.readLine());
    	int Bx = Integer.valueOf(st.nextToken());
    	int By = Integer.valueOf(st.nextToken());
    	
    	st = new StringTokenizer(bf.readLine());
    	int Dx = Integer.valueOf(st.nextToken());
    	int Dy = Integer.valueOf(st.nextToken());
    	
    	st = new StringTokenizer(bf.readLine());
    	int Jx = Integer.valueOf(st.nextToken());
    	int Jy = Integer.valueOf(st.nextToken());
    	
    	//베시와 데이지가 존에게 가는 시간
    	int bessie=0, daisy=0;
    	
    	if(Math.abs(Jx-Bx)>Math.abs(Jy-By)) bessie = Math.abs(Jx-Bx);
    	else bessie = Math.abs(Jy-By);
    	
    	daisy = Math.abs(Jx-Dx)+Math.abs(Jy-Dy);
    	
    	// 두 사람중 누가 더 빨리 가는지 비교
    	if(bessie<daisy) bw.write("bessie");
    	else if(daisy<bessie) bw.write("daisy");
    	else bw.write("tie");
    	
    	bw.close();
    } // end of main
} // end of Main class