import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String[] win = {"ITMO", "SPbSU", "SPbSU", "ITMO", "ITMO",
                "SPbSU", "ITMO", "ITMO", "ITMO", "ITMO",
                "ITMO", "PetrSU, ITMO", "SPbSU", "SPbSU",
                "ITMO", "ITMO", "ITMO", "ITMO", "SPbSU",
                "ITMO", "ITMO", "ITMO", "ITMO", "SPbSU", "ITMO"};
		
		int input = Integer.valueOf(bf.readLine())-1995;
		
		System.out.println(win[input]);
	}
}