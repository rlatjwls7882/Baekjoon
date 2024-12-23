#include<bits/stdc++.h>
using namespace std;

int _size, cur=1;
int tile[128][128];

void fill(int x, int y, int K, int dx, int dy) {
    if(K==0) return;
    if(K==1) {
        x += dx;
        y += dy;
        if(x%2==1 && y%2==0) tile[x-1][y]=tile[x][y+1]=tile[x-1][y+1]=cur++;
        else if(x%2==1 && y%2==1) tile[x-1][y]=tile[x][y-1]=tile[x-1][y-1]=cur++;
        else if(x%2==0 && y%2==0) tile[x+1][y]=tile[x][y+1]=tile[x+1][y+1]=cur++;
        else tile[x+1][y]=tile[x][y-1]=tile[x+1][y-1]=cur++;
        return;
    }

    int curSize = pow(2, K);
    if(x<curSize/2 && y<curSize/2) { // 왼쪽 위
        tile[dx+curSize/2][dy+curSize/2]=tile[dx+curSize/2][dy+curSize/2-1]=tile[dx+curSize/2-1][dy+curSize/2]=cur++;
        for(int i=2;i<K;i++) {
            fill(curSize/pow(2, i)-1, 0, K-i, dx+curSize/pow(2, i), dy+curSize/pow(2, i-1));
            fill(0, curSize/pow(2, i)-1, K-i, dx+curSize/pow(2, i-1), dy+curSize/pow(2, i));
            fill(0, 0, K-i, dx+curSize/pow(2, i-1), dy+curSize/pow(2, i-1));
        }
        fill(curSize/2-1, 0, K-1, dx, dy+curSize/2);
        fill(0, curSize/2-1, K-1, dx+curSize/2, dy);
        fill(0, 0, K-1, dx+curSize/2, dy+curSize/2);
    } else if(x<curSize/2) { // 오른쪽 위
        tile[dx+curSize/2][dy+curSize/2]=tile[dx+curSize/2][dy+curSize/2-1]=tile[dx+curSize/2-1][dy+curSize/2-1]=cur++;
        for(int i=2;i<K;i++) {
            fill(curSize/pow(2, i)-1, curSize/pow(2, i)-1, K-i, dx+curSize/pow(2, i), dy+curSize/pow(2, i));
            fill(0, curSize/pow(2, i)-1, K-i, dx+curSize/pow(2, i-1), dy+curSize/pow(2, i));
            fill(0, 0, K-i, dx+curSize/pow(2, i-1), dy+curSize/pow(2, i-1));
        }
        fill(curSize/2-1, curSize/2-1, K-1, dx, dy);
        fill(0, curSize/2-1, K-1, dx+curSize/2, dy);
        fill(0, 0, K-1, dx+curSize/2, dy+curSize/2);
    } else if(y<curSize/2) { // 왼쪽 아래
        tile[dx+curSize/2][dy+curSize/2]=tile[dx+curSize/2-1][dy+curSize/2]=tile[dx+curSize/2-1][dy+curSize/2-1]=cur++;
        for(int i=2;i<K;i++) {
            fill(curSize/pow(2, i)-1, curSize/pow(2, i)-1, K-i, dx+curSize/pow(2, i), dy+curSize/pow(2, i));
            fill(curSize/pow(2, i)-1, 0, K-i, dx+curSize/pow(2, i), dy+curSize/pow(2, i-1));
            fill(0, 0, K-i, dx+curSize/pow(2, i-1), dy+curSize/pow(2, i-1));
        }
        fill(curSize/2-1, curSize/2-1, K-1, dx, dy);
        fill(curSize/2-1, 0, K-1, dx, dy+curSize/2);
        fill(0, 0, K-1, dx+curSize/2, dy+curSize/2);
    } else { // 오른쪽 아래
        tile[dx+curSize/2-1][dy+curSize/2]=tile[dx+curSize/2][dy+curSize/2-1]=tile[dx+curSize/2-1][dy+curSize/2-1]=cur++;
        for(int i=2;i<K;i++) {
            fill(curSize/pow(2, i)-1, curSize/pow(2, i)-1, K-i, dx+curSize/pow(2, i), dy+curSize/pow(2, i));
            fill(curSize/pow(2, i)-1, 0, K-i, dx+curSize/pow(2, i), dy+curSize/pow(2, i-1));
            fill(0, curSize/pow(2, i)-1, K-i, dx+curSize/pow(2, i-1), dy+curSize/pow(2, i));
        }
        fill(curSize/2-1, curSize/2-1, K-1, dx, dy);
        fill(curSize/2-1, 0, K-1, dx, dy+curSize/2);
        fill(0, curSize/2-1, K-1, dx+curSize/2, dy);
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int K, x, y; cin >> K >> y >> x;
    _size = pow(2, K);
    x = _size-x; y--;
    tile[x][y] = -1;
    for(int i=1;i<=K;i++) fill(x, y, i, 0, 0);

    for(int i=0;i<_size;i++) {
        for(int j=0;j<_size;j++) {
            cout << tile[i][j] << ' ';
        }
        cout << '\n';
    }
}