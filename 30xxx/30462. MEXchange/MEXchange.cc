#include<bits/stdc++.h>
using namespace std;

bool used[200'001];
int a[200'001], b[200'001];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=1;i<=n;i++) {
        cin >> b[i];
        if(i+1<b[i] || b[i-1]>b[i]) {
            cout << "No";
            return 0;
        }
    }
    if(b[n]!=n+1) {
        cout << "No";
        return 0;
    }

    vector<int> v;
    for(int i=1;i<n;i++) {
        if(v.empty() || v.back()!=b[i]) v.push_back(b[i]);
    }
    int idx=0;
    for(int i=1;i<=n;i++) {
        if(idx<v.size() && v[idx]<b[i]) {
            used[v[idx]]=true;
            a[i]=v[idx++];
        }
    }

    idx=1;
    cout << "Yes\n";
    for(int i=1;i<=n;i++) {
        if(!a[i]) {
            while(used[idx]) idx++;
            a[i]=idx++;
        }
        cout << a[i] << ' ';
    }
}