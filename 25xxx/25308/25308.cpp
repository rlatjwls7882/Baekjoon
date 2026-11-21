#include<bits/stdc++.h>
using namespace std;

bool visited[8];
int cnt, permutation[8];
double a[8], pos[8][2];

struct vect {
    double x, y;
};

bool ccw(int a, int b, int c) {
    vect vect1 = {pos[b][0]-pos[a][0], pos[b][1]-pos[a][1]};
    vect vect2 = {pos[c][0]-pos[b][0], pos[c][1]-pos[b][1]};
    return vect1.x*vect2.y - vect2.x*vect1.y <= 0;
}

bool graphChk() {
    for(int i=0;i<8;i++) {
        if(!ccw(i, (i+1)%8, (i+2)%8)) return false;
    }
    return true;
}

void chk(int depth) {
    if(depth==8) {
        pos[0][0] = 0, pos[0][1] = a[permutation[0]];
        pos[1][0] = a[permutation[1]]/sqrt(2), pos[1][1] = a[permutation[1]]/sqrt(2);
        pos[2][0] = a[permutation[2]], pos[2][1] = 0;
        pos[3][0] = a[permutation[3]]/sqrt(2), pos[3][1] = -a[permutation[3]]/sqrt(2);
        pos[4][0] = 0, pos[4][1] = -a[permutation[4]];
        pos[5][0] = -a[permutation[5]]/sqrt(2), pos[5][1] = -a[permutation[5]]/sqrt(2);
        pos[6][0] = -a[permutation[6]], pos[6][1] = 0;
        pos[7][0] = -a[permutation[7]]/sqrt(2), pos[7][1] = a[permutation[7]]/sqrt(2);
        if(graphChk()) cnt++;
        return;
    }
    for(int i=0;i<8;i++) {
        if(!visited[i]) {
            visited[i]=true;
            permutation[depth]=i;
            chk(depth+1);
            visited[i]=false;
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    for(int i=0;i<8;i++) cin >> a[i];
    chk(0);
    cout << cnt;
}