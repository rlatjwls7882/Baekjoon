#include<bits/stdc++.h>
using namespace std;

int n, last, res[2000], increasing[2000], decreasing[2000];
bool prohibit[2000];

bool decreasingChk(int pos) {
    if(decreasing[pos]==1) return true;
    for(int i=pos+1;i<n;i++) {
        if(res[i] && decreasing[i]+1==decreasing[pos]) return true;
    }
    return false;
}

bool increasingChk(int pos) {
    if(increasing[pos]==1) return true;
    for(int i=0;i<pos;i++) {
        if(res[i] && increasing[i]+1==increasing[pos]) return true;
    }
    return false;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    for(int tc=1;tc<=t;tc++) {
        cin >> n;
        for(int i=0;i<n;i++) cin >> increasing[i];
        for(int i=0;i<n;i++) cin >> decreasing[i];

        last=1;
        memset(res, 0, sizeof(res));
        memset(prohibit, false, sizeof(prohibit));
        while(last<=n) { // increasing이 낮은 순서, decreasing이 낮은 순서대로 채우기
            int pos=n;
            for(int i=0;i<n;i++) {
                if(!res[i] && !prohibit[i] && (pos==n || increasing[pos]>increasing[i] || increasing[pos]==increasing[i] && decreasing[pos]>decreasing[i])) {
                    pos=i;
                }
            }
            if(!res[pos] && !prohibit[pos] && decreasingChk(pos) && increasingChk(pos)) {
                res[pos]=last++;
                memset(prohibit, false, sizeof(prohibit));
            } else {
                prohibit[pos]=true;
            }
        }

        cout << "Case #" << tc << ":";
        for(int i=0;i<n;i++) cout << ' ' << res[i];
        cout << '\n';
    }
}
