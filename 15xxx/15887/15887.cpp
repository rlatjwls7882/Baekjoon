#include<bits/stdc++.h>
using namespace std;

int arr[1000];
bool chk[1000];

struct opt {
    int a, b;
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) {
        cin >> arr[i];
        arr[i]--;
    }

    vector<opt> res;
    for(int i=0;i<n;i++) {
        while(arr[i]<n && !chk[arr[i]]) {
            chk[arr[i]]=true;
            if(i==arr[i]) break;
            res.push_back({i+1, arr[i]+1});
            if(i+1<arr[i]-1) res.push_back({i+2, arr[i]});
            swap(arr[i], arr[arr[i]]);
        }
    }

    cout << res.size() << '\n';
    for(auto e : res) cout << e.a << ' ' << e.b << '\n';
}