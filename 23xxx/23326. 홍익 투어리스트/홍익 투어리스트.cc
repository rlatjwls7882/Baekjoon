#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, Q; cin >> N >> Q;
    set<int> idx;
    for(int i=0;i<N;i++) {
        int A; cin >> A;
        if(A) idx.insert(i);
    }

    int cur=0;
    while(Q-->0) {
        int a; cin >> a;
        if(a==1) {
            int i; cin >> i;
            if(idx.count(i-1)) idx.erase(i-1);
            else idx.insert(i-1);
        } else if(a==2) {
            int x; cin >> x;
            cur = (cur+x)%N;
        } else {
            if(idx.lower_bound(cur) != idx.end()) {
                cout << *idx.lower_bound(cur) - cur << '\n';
            } else if(!idx.empty()) {
                cout << *idx.lower_bound(0) - cur + N << '\n';
            } else {
                cout << "-1\n";
            }
        }
    }
}