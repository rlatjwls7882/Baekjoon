#include<bits/stdc++.h>
using namespace std;

const int MAX = 500'001;

int _size=1, a[MAX], arr[MAX*4];

void update(int i) {
    i += _size;
    arr[i]++;
    while(i>1) {
        i>>=1;
        arr[i] = arr[i*2]+arr[i*2+1];
    }
}

int query(int L, int R) {
    int ret=0;
    for(L+=_size, R+=_size;L<=R;L>>=1, R>>=1) {
        if(L&1) ret += arr[L++];
        if(!(R&1)) ret += arr[R--]; 
    }
    return ret;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    vector<int> v(n);
    for(int i=0;i<n;i++) {
        cin >> v[i];
        a[i] = v[i];
    }
    sort(v.begin(), v.end());
    v.erase(unique(v.begin(), v.end()), v.end());
    while(_size<v.size()) _size<<=1;

    for(int i=0;i<n;i++) {
        a[i] = lower_bound(v.begin(), v.end(), a[i])-v.begin();
        cout << query(a[i]+1, v.size()-1)+1 << '\n';
        update(a[i]);
    }
}