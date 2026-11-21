import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.valueOf(bf.readLine());
		int finger = 0;
		
		if((n/4)%2==0) {
			if(n%4==0)
				finger = 2;
			else
				finger = (n%4);
		}
		
		else {
			if(n%4==0)
				finger = 4;
			else
				finger = 6 - (n%4);
		}
		
		bw.write(finger+"");
		bw.close();
	} // end of main
} // end of main class

//엄지 1   9     17
//검지 2 8 10 16 18
//중지 3 7 11 15 19
//약지 4 6 12 14 20
//소지   5    13 