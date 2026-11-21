#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, m; cin >> n >> m;
    
    vector<int> v;
    while(n-->0) {
        int P, L; cin >> P >> L;
        int arr[P];
        for(int i=0;i<P;i++) {
            cin >> arr[i];
        }
        sort(arr, arr+P);

        if(P<L) {
            v.push_back(1);
        } else {
            v.push_back(arr[P-L]);
        }
    }
    sort(v.begin(), v.end());

    int cnt=0;
    for(int i=0;i<v.size();i++) {
        m-=v[i];
        if(m>=0) cnt++;
        else break;
    }
    cout << cnt;
}