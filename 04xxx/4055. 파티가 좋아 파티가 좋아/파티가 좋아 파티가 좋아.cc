#include<bits/stdc++.h>
using namespace std;

bool chk[48];

struct party {
    int s, e;
    bool operator<(const party p) const {
        if(e!=p.e) return e < p.e;
        return s < p.s;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    for(int tc=1;;tc++) {
        int p; cin >> p;
        if(p==0) break;

        vector<party> parties;
        while(p--) {
            int s, e; cin >> s >> e;
            parties.push_back({s*2, e*2}); // 30분 단위로 나타내기 위해 2를 곱해줌
        }
        sort(parties.begin(), parties.end());

        memset(chk, false, sizeof chk);

        int cnt=0;
        for(party p : parties) {
            for(int i=p.s;i<p.e;i++) {
                if(!chk[i]) {
                    cnt++;
                    chk[i]=true;
                    break;
                }
            }
        }
        cout << "On day " << tc << " Emma can attend as many as " << cnt << " parties.\n";
    }
}