import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 어떤 고양이의 사진인지 확인
		for(int i=0;i<15;i++) {
			String string = br.readLine();
			for(int j=0;j<30;j+=2){
				if(string.charAt(j)=='w') {
					bw.write("chunbae");
                    i=15;
					break;
				} else if(string.charAt(j)=='b') {
					bw.write("nabi");
                    i=15;
					break;
				} else if(string.charAt(j)=='g') {
					bw.write("yeongcheol");
                    i=15;
					break;
				}
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class