#include<bits/stdc++.h>
using namespace std;

int getCnt(int mon, int day) {
    int ret = day;
    for(int i=1;i<mon;i++) {
        if(i==2) ret += 28;
        if(i==4 || i==6 || i==9 || i==11) ret += 30;
        else ret += 31;
    }
    return ret;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    vector<pair<int, int>> v;
    for(int i=0;i<n;i++) {
        int a, b, c, d; cin >> a >> b >> c >> d;
        v.push_back({getCnt(a, b), getCnt(c, d)});
    }
    sort(v.begin(), v.end());

    int cur = getCnt(3, 1), curMaxEnd=-1, cnt=0;
    for(int i=0;i<=n;) {
        if(i<n && v[i].first<=cur) {
            curMaxEnd = max(v[i].second, curMaxEnd);
            i++;
        } else {
            if(curMaxEnd==-1) {
                cout << 0;
                return 0;
            }
            cnt++;
            cur = curMaxEnd;
            curMaxEnd=-1;
        }
        if(cur>=getCnt(12, 1)) {
            cout << cnt;
            return 0;
        }
    }
    cout << 0;
}