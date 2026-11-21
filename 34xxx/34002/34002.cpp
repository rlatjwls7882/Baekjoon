#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int a, b, c, s, v, l; cin >> a >> b >> c >> s >> v >> l;
    
    int cur = 25000-l*100, cnt=0;
    while(cur>0 && v>0) {
        int curCnt = min(30, (cur+c-1)/c);
        cnt += curCnt;
        cur -= c*curCnt;
        v--;
    }
    while(cur>0 && s>0) {
        int curCnt = min(30, (cur+b-1)/b);
        cnt += curCnt;
        cur -= b*curCnt;
        s--;
    }
    cout << cnt + max(0, (cur+a-1)/a);
}