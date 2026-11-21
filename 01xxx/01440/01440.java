import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		StringTokenizer st = new StringTokenizer(br.readLine(),":");
		int HH = Integer.valueOf(st.nextToken());
		int MM = Integer.valueOf(st.nextToken());
		int SS = Integer.valueOf(st.nextToken());
		
		// 시간을 읽을 수 있는 방법의 수 계산
		int method=0;
		
		if(1<=HH&&HH<=12&&0<=MM&&MM<=59&&0<=SS&&SS<=59) {
			method+=2;
		}
		if(1<=MM&&MM<=12&&0<=HH&&HH<=59&&0<=SS&&SS<=59) {
			method+=2;
		}
		if(1<=SS&&SS<=12&&0<=HH&&HH<=59&&0<=MM&&MM<=59) {
			method+=2;
		}
		
		bw.write(Integer.toString(method));
		
		bw.close();
	} // end of main()
} // end of Main class