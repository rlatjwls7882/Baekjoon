#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    set<int> s;
    int cnt=0;
    while(N-->0) {
        int a, b; cin >> a >> b;
        if(b==1) {
            if(s.count(a)) cnt++;
            s.insert(a);
        } else {
            if(!s.count(a)) cnt++;
            else s.erase(a);
        }
    }
    cout << cnt + s.size();
}