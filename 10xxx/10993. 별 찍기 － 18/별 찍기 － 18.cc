#include <bits/stdc++.h>
using namespace std;

int N;
char m[1023][2045] = {0, };

void draw(int depth, int x, int y, int maxHeight, int maxWidth) {
    if(depth%2==0) {
        for(int i=0;i<=maxWidth;i++) {
            m[x][y+i]='*';
        }
        for(int i=1;i<=maxHeight;i++) {
            m[x+i][y+i]='*';
            m[x+i][y+maxWidth-i]='*';
        }
        if(depth!=1) draw(depth-1, x+1, y+(maxWidth-(maxWidth-3)/2)/2, (maxHeight-1)/2, (maxWidth-3)/2);
    } else {
        for(int i=0;i<=maxWidth;i++) {
            m[x+maxHeight][y+i]='*';
        }
        for(int i=1;i<=maxHeight;i++) {
            m[x+maxHeight-i][y+i]='*';
            m[x+maxHeight-i][y+maxWidth-i]='*';
        }
        if(depth!=1) draw(depth-1, x+(maxHeight-1)/2+1, y+(maxWidth-(maxWidth-3)/2)/2, (maxHeight-1)/2, (maxWidth-3)/2);
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> N;

    int width=1, height=1;
    for(int i=1;i<N;i++) {
        width = width*2+3;
        height = height*2+1;
    }

    draw(N, 0, 0, height-1, width-1);

    if(N%2==0) {
        for(int i=0;i<height;i++) {
            for(int j=0;j<width-i;j++) {
                if(m[i][j]=='*') cout << '*';
                else cout << ' ';
            }
            cout << '\n';
        }
    } else {
        for(int i=0;i<height;i++) {
            for(int j=0;j<width-(height-1-i);j++) {
                if(m[i][j]=='*') cout << '*';
                else cout << ' ';
            }
            cout << '\n';
        }
    }
}