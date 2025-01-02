#include<bits/stdc++.h>
using namespace std;

int n, res[20], increasing[20], decreasing[20];
bool prohibit[20];

bool chk(int pos) {
    if(decreasing[pos]==1) return true;
    for(int i=pos+1;i<n;i++) {
        if(res[i] && decreasing[i]+1==decreasing[pos]) return true;
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

        int last=1;
        memset(res, 0, sizeof(res));
        memset(prohibit, false, sizeof(prohibit));
        while(last<=n) { // increasing이 낮은 순서대로 (같으면 뒤에 있는것부터) decreasing 순서에 맞춰(같으면 앞에 있는것부터) 채우기
            int pos=n;
            for(int i=n-1;i>=0;i--) {
                if(!res[i] && !prohibit[i] && (pos==n || increasing[pos]>increasing[i])) pos=i;
            }
            if(chk(pos)) {
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