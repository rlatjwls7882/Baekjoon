#include<bits/stdc++.h>
using namespace std;
typedef long long ll;

int main() {
    cin.tie(0)->sync_with_stdio(0);
    ll h,s;cin>>h>>s;
    if(h<=2)return!(cout<<1);
    if(h<=4)return!(cout<<2+s);
    cout<<(h+3*s+1)/2;
}
