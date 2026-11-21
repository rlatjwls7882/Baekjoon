#include<bits/stdc++.h>
using namespace std;
typedef long long ll;

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    int zero=0;
    vector<int> minu, plu;
    for(int i=0;i<n;i++) {
        int a; cin >> a;
        a-=i;
        if(a<0) minu.push_back(a);
        else if(a>0) plu.push_back(a);
        else zero++;
    }
    ll r=0;
    sort(minu.begin(), minu.end());
    sort(plu.begin(), plu.end(), greater<int>());
    for(auto e:minu)r-=e;
    for(auto e:plu)r+=e;

    int last=0;
    while(minu.size()>plu.size()+zero) {
        r-=(last-minu.back())*(minu.size()-zero-plu.size());
        last=minu.back(); minu.pop_back();
        zero++;
    }
    while(plu.size()>minu.size()+zero) {
        r-=(plu.back()-last)*(plu.size()-zero-minu.size());
        last=plu.back(); plu.pop_back();
        zero++;
    }
    cout<<r;
}
