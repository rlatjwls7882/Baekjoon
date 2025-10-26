#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
ll a, b, n, cnt;
vector<ll> arr;

void back(int depth=0, int start=0, ll val=1) {
    if(val>b) return;
    if(depth) {
        if(depth%2) cnt += b/val - (a-1)/val;
        else cnt -= b/val - (a-1)/val;
    }
    for(int i=start;i<arr.size();i++) back(depth+1, i+1, lcm(val, arr[i]));
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    for(int tc=1;tc<=t;tc++) {
        cin >> a >> b >> n;
        cnt=0;
        arr.clear();

        for(ll i=2;i*i<=n;i++) {
            if(n%i==0) {
                arr.push_back(i);
                while(n%i==0) n/=i;
            }
        }
        if(n!=1) arr.push_back(n);

        back();
        cout << "Case #"<< tc << ": " << b-a+1-cnt << '\n';
    }
}