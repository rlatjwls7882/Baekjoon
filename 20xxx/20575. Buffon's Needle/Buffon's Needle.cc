#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N; cin >> N;
    int cnt=0;
    for(int i=0;i<N;i++) {
        double x1, y1, x2, y2; cin >> x1 >> y1 >> x2 >> y2;
        if(x1>x2) swap(x1, x2);
        if(x1<=(int)x2 && (int)x2<=x2 || x1<=(int)x1 && (int)x1<=x2) cnt++;
    }
    cout << setprecision(6) << fixed << 2.0/cnt*N;
}