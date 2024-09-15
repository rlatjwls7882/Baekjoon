#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int t; cin >> t;
    while(t-->0) {
        int n, m; cin >> n >> m;
        bool chk=true;
        set<int> hashset;
        int lastIdx[n] = {0, };
        int res[m] = {0, };
        for(int i=0;i<m;i++) {
            int next; cin >> next;
            if(!chk) continue;
            if(!next) {
                hashset.insert(i);
            } else {
                auto it = hashset.lower_bound(lastIdx[next-1]);
                res[i]=-1;
                if(hashset.end() == it) {
                    chk=false;
                    continue;
                }
                lastIdx[next-1]=i;
                res[(*it)]=next;
                hashset.erase(it);
            }
        }
        if(chk) {
            cout << "YES\n";
            for(auto val:res) {
                if(val!=-1) cout << val << ' ';
            }
            cout << '\n';
        } else {
            cout << "NO\n";
        }
    }
}