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
		
		Color[] colors = new Color[16];
		colors[0] = new Color("White", 255, 255, 255);
		colors[1] = new Color("Silver", 192, 192, 192);
		colors[2] = new Color("Gray", 128, 128, 128);
		colors[3] = new Color("Black", 0, 0, 0);
		colors[4] = new Color("Red", 255, 0, 0);
		colors[5] = new Color("Maroon", 128, 0, 0);
		colors[6] = new Color("Yellow", 255, 255, 0);
		colors[7] = new Color("Olive", 128, 128, 0);
		colors[8] = new Color("Lime", 0, 255, 0);
		colors[9] = new Color("Green", 0, 128, 0);
		colors[10] = new Color("Aqua", 0, 255, 255);
		colors[11] = new Color("Teal", 0, 128, 128);
		colors[12] = new Color("Blue", 0, 0, 255);
		colors[13] = new Color("Navy", 0, 0, 128);
		colors[14] = new Color("Fuchsia", 255, 0, 255);
		colors[15] = new Color("Purple", 128, 0, 128);
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int r = Integer.valueOf(st.nextToken());
			int g = Integer.valueOf(st.nextToken());
			int b = Integer.valueOf(st.nextToken());
			if(r==-1) {
				break;
			}
			
			int minDist = Integer.MAX_VALUE;
			int idx=0;
			for(int i=0;i<16;i++) {
				int dist = (int)(Math.pow(colors[i].r-r, 2)+Math.pow(colors[i].g-g, 2)+Math.pow(colors[i].b-b, 2));
				if(dist<minDist) {
					minDist=dist;
					idx=i;
				}
			}
			bw.write(colors[idx].color+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class

class Color {
	String color;
	int r, g, b;
	public Color(String color, int r, int g, int b) {
		this.color=color;
		this.r=r;
		this.g=g;
		this.b=b;
	}
} // end of Color class