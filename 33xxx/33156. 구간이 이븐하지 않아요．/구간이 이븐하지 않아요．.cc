#include<bits/stdc++.h>
using namespace std;

int n, a[5000];
int l[5000], r[5000];
vector<int> v;

bool comp() {
    for(int i=0;i<n;i++) {
        if(l[i]!=r[i]) return false;
    }
    return true;
}

int chk() {
    for(int len=n/2;len>=1;len--) {
        memset(l, 0, sizeof l);
        memset(r, 0, sizeof r);
        for(int j=0;j<len;j++) l[a[j]]++;
        for(int j=len;j<len*2;j++) r[a[j]]++;
        if(comp()) return len*2;

        for(int j=0;j+len*2<n;j++) {
            l[a[j]]--;
            l[a[j+len]]++;
            r[a[j+len]]--;
            r[a[j+len*2]]++;
            if(comp()) return len*2;
        }
    }
    return 0;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n;
    vector<int> arr;
    for(int i=0;i<n;i++) {
        cin >> a[i];
        arr.push_back(a[i]);
    }
    arr.erase(unique(arr.begin(), arr.end()), arr.end());
    sort(arr.begin(), arr.end());

    for(int i=0;i<n;i++) {
        a[i] = lower_bound(arr.begin(), arr.end(), a[i]) - arr.begin();
    }

    cout << chk();
}