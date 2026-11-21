#include<bits/stdc++.h>
using namespace std;

const int MAX = 200'002;

int a[MAX], arr[MAX];

void update(int i, int v) {
    while(i<MAX) {
        arr[i]+=v;
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
    int n, q; cin >> n >> q;
    for(int i=1;i<=n;i++) {
        cin >> a[i];
        if(a[i]!=a[i-1]) update(i, 1);
    }

    while(q--) {
        int x, y, z; cin >> x >> y >> z;
        if(x==1) {
            if(a[y]!=a[y-1]) update(y, -1);
            if(a[y]!=a[y+1]) update(y+1, -1);
            a[y]=z;
            if(a[y]!=a[y-1]) update(y, 1);
            if(a[y]!=a[y+1]) update(y+1, 1);
        } else {
            cout << query(z)-query(y)+1 << '\n';
        }
    }
}