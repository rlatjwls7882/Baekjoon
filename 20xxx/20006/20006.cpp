#include<bits/stdc++.h>
using namespace std;
typedef pair<string, int> P;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int p, m; cin >> p >> m;

    vector<vector<P>> v;
    for(int i=0;i<p;i++) {
        int l; string n; cin >> l >> n;

        bool chk=true;
        for(int i=0;i<v.size();i++) {
            if(v[i].size()==m || abs(l-v[i][0].second)>10) continue;
            v[i].push_back(P(n, l));
            chk=false;
            break;
        }

        if(chk) {
            vector<P> tmp;
            tmp.push_back(P(n, l));
            v.push_back(tmp);
        }
    }

    for(auto room:v) {
        sort(room.begin(), room.end(), [](P a, P b) {return a.first<b.first;});
        if(room.size()==m) cout << "Started!\n";
        else cout << "Waiting!\n";
        for(P list:room) {
            cout << list.second << " " << list.first << '\n';
        }
    }
}