#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
typedef long double ld;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; ld tmp; cin >> n >> tmp;

    ll x = tmp*100+0.00000001, w=0, total=0;
    while(n-->1) {
        ll c; string g; cin >> c >> g;
        w += c;
        if(g=="A+") total += c*450;
        else if(g=="A0") total += c*400;
        else if(g=="B+") total += c*350;
        else if(g=="B0") total += c*300;
        else if(g=="C+") total += c*250;
        else if(g=="C0") total += c*200;
        else if(g=="D+") total += c*150;
        else if(g=="D0") total += c*100;
    }
    ll l; cin >> l;
    w += l;

    ll need = x*w-total+w;
    if(need<=0) cout << "F";
    else if(need<=l*100) cout << "D0";
    else if(need<=l*150) cout << "D+";
    else if(need<=l*200) cout << "C0";
    else if(need<=l*250) cout << "C+";
    else if(need<=l*300) cout << "B0";
    else if(need<=l*350) cout << "B+";
    else if(need<=l*400) cout << "A0";
    else if(need<=l*450) cout << "A+";
    else cout << "impossible";
}