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
		
		StringTokenizer st = new StringTokenizer(br.readLine(),"-");
		st.nextToken();
		int MM = Integer.valueOf(st.nextToken());
		int DD = Integer.valueOf(st.nextToken());
		
		// 현재 별자리 확인
		if(MM==3&&DD>=21||MM==4&&DD<=19) {
			bw.write("Aries");
		} else if(MM==4&&DD>=20||MM==5&&DD<=20) {
			bw.write("Taurus");
		} else if(MM==5&&DD>=21||MM==6&&DD<=20) {
			bw.write("Gemini");
		} else if(MM==6&&DD>=21||MM==7&&DD<=22) {
			bw.write("Cancer");
		} else if(MM==7&&DD>=23||MM==8&&DD<=22) {
			bw.write("Leo");
		} else if(MM==8&&DD>=23||MM==9&&DD<=22) {
			bw.write("Virgo");
		} else if(MM==9&&DD>=23||MM==10&&DD<=22) {
			bw.write("Libra");
		} else if(MM==10&&DD>=23||MM==11&&DD<=22) {
			bw.write("Scorpio");
		} else if(MM==11&&DD>=23||MM==12&&DD<=21) {
			bw.write("Sagittarius");
		} else if(MM==12&&DD>=22||MM==1&&DD<=19) {
			bw.write("Capricorn");
		} else if(MM==1&&DD>=20||MM==2&&DD<=18) {
			bw.write("Aquarius");
		} else {
			bw.write("Pisces");
		}
		
		bw.close();
	} // end of main()
} // end of Main class