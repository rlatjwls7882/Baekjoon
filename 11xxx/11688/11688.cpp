#include<bits/stdc++.h>
using namespace std;

map<long long, int> getSoinsu(long long n) {
    map<long long, int> soinsu;
    for(long long i=2;i*i<=n;i++) {
        while(n%i==0) {
            soinsu[i]++;
            n/=i;
        }
    }
    if(n!=1) soinsu[n]++;
    return soinsu;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    long long a, b, L; cin >> a >> b >> L;

    map<long long, int> total, cur;
    cur = getSoinsu(a);
    for(auto e:cur) {
        total[e.first] = max(total[e.first], e.second);
    }
    cur = getSoinsu(b);
    for(auto e:cur) {
        total[e.first] = max(total[e.first], e.second);
    }

    long long res=1;
    cur = getSoinsu(L);
    for(auto e:total) { // L의 소인수중 a와 b에 있는 것
        if(!cur.count(e.first) || e.second>cur[e.first]) {
            cout << -1;
            return 0;
        }
        if(e.second<cur[e.first]) res *= pow(e.first, cur[e.first]);
        cur.erase(e.first);
    }
    for(auto e:cur) { // L의 소인수중 a와 b에 없는 것
        res *= pow(e.first, e.second);
    }
    cout << res;
}