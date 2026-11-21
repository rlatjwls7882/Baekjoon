#include<bits/stdc++.h>
using namespace std;

const int MAX = 100'001;

int arr[MAX], pos[MAX];

void update(int i) {
    while(i<MAX) {
        arr[i]++;
        i+=i&-i;
    }
}

int query(int i) {
    int ret=0;
    while(i) {
        ret+=arr[i];
        i-=i&-i;
    }
    return ret;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int t; cin >> t;
    while(t--) {
        int n; cin >> n;
        memset(arr, 0, sizeof arr);
        for(int i=1;i<=n;i++) {
            int cur; cin >> cur;
            pos[cur]=i;
        }

        long long res=0;
        for(int i=0;i<n;i++) {
            int cur; cin >> cur;
            res += query(n)-query(pos[cur]);
            update(pos[cur]);
        }
        cout << res << '\n';
    }
}