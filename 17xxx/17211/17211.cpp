#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    double pro[4];
    for(int i=0;i<4;i++) {
        cin >> pro[i];
    }

    double a=0, b=0; M==0?a++:b++;
    for(int i=0;i<N;i++) {
        double nextA=a*pro[0]+b*pro[2];
        double nextB=a*pro[1]+b*pro[3];
        a=nextA;
        b=nextB;
    }
    cout << (int)(a*1000) << '\n' << (int)(b*1000);
}