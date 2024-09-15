import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 단어 하나 입력
		String word = br.readLine();

		// 단어의 합 계산
		int sum=0;
		for (int i=0;i<word.length();i++) {
			if (word.charAt(i) <= 'Z') sum += word.charAt(i)-'A'+27;
			else sum += word.charAt(i)-'a'+1;
		}

		// 단어의 합이 소수인지 판단
		boolean isPrime = true;
		for (int i=2;i*i<=sum;i++)
			if(sum%i==0)
				isPrime = false;

		bw.write(isPrime?"It is a prime word.":"It is not a prime word.");

		bw.close();
	} // end of main
} // end of Main class