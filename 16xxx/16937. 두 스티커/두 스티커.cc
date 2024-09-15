#include<bits/stdc++.h>
using namespace std;

int main(void) {
    int H, W, N; cin >> H >> W >> N;

    int size[N][2];
    for(int i=0;i<N;i++) {
        cin >> size[i][0] >> size[i][1];
    }

    int _max=0;
    for(int i=0;i<N;i++) {
        for(int j=i+1;j<N;j++) {
            if(size[i][0]+size[j][0]<=H&&max(size[i][1], size[j][1])<=W // 세로로 두개 이어붙이기1
            || size[i][0]+size[j][1]<=H&&max(size[i][1], size[j][0])<=W // 세로로 두개 이어붙이기2
            || size[i][1]+size[j][0]<=H&&max(size[i][0], size[j][1])<=W // 세로로 두개 이어붙이기3
            || size[i][1]+size[j][1]<=H&&max(size[i][0], size[j][0])<=W // 세로로 두개 이어붙이기4
            || max(size[i][0], size[j][0])<=H&&size[i][1]+size[j][1]<=W // 가로로 두개 이어붙이기1
            || max(size[i][0], size[j][1])<=H&&size[i][1]+size[j][0]<=W // 가로로 두개 이어붙이기2
            || max(size[i][1], size[j][0])<=H&&size[i][0]+size[j][1]<=W // 가로로 두개 이어붙이기2
            || max(size[i][1], size[j][1])<=H&&size[i][0]+size[j][0]<=W // 가로로 두개 이어붙이기4
            ) {
                _max = max(_max, size[i][0]*size[i][1]+size[j][0]*size[j][1]);
            }
        }
    }
    cout << _max;
}