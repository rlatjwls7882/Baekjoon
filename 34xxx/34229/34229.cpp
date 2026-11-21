#include<bits/stdc++.h>
using namespace std;

int n, hor[2001];

int query(int i, int j, int k) {
    cout << "H " << i << ' ' << j << ' ' << k << '\n' << flush;
    int x; cin >> x;
    return x;
}

int fibTernarySearch() {
    int l=1, r=n;
    vector<int> fib = {0, 1};
    while(fib.back()<n) fib.push_back(fib.back()+fib[fib.size()-2]);
    int k = fib.size()-1;
    int p = min(l+fib[k-2]-1, r);
    int q = min(l+fib[k-1]-1, r);
    while(l+1<r && k>1) {
        if(!hor[p]) hor[p] = query(p, 1, n);
        if(!hor[q]) hor[q] = query(q, 1, n);
        if(hor[p]==n*n) return p;
        if(hor[q]==n*n) return q;

        if(hor[p]<hor[q]) {
            l=p+1;
            k--;
            p=q;
            q = min(l+fib[k-1]-1, r);
        } else {
            r=q-1;
            k--;
            q=p;
            p = min(l+fib[k-2]-1, r);
        }
    }

    int mx=0, ret;
    while(l<=r) {
        if(!hor[l]) hor[l] = query(l, 1, n);
        if(mx<hor[l]) {
            mx=hor[l];
            ret=l;
        }
        l++;
    }
    return ret;
}

int binarySearch(int x) {
    int l=1, r=n;
    int mx=hor[x];
    while(l<r) {
        int m = l+r>>1;
        int cur = query(x, l, m-l+1);
        if(cur==mx) r=m;
        else l=m+1;
    }
    return l;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    cin >> n;
    int x = fibTernarySearch();
    int y = binarySearch(x);

    cout << "! " << x << ' ' << y << '\n' << flush;
}