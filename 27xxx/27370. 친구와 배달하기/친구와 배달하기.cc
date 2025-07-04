#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        int n, pa, pb; cin >> n >> pa >> pb;
        if(pa>pb) swap(pa, pb);

        long long a=0, b=0;
        vector<int> wild;
        while(n--) {
            int pos; cin >> pos;
            if(pos-pa < pb-pos) a += (pos-pa)*2;
            else if(pos-pa > pb-pos) b += (pb-pos)*2;
            else wild.push_back((pos-pa)*2);
        }

        for(int len : wild) {
            if(a<b) a += len;
            else b += len;
        }
        cout << a+b << ' ' << abs(a-b) << '\n';
    }
}