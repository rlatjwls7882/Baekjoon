#include<bits/stdc++.h>
using namespace std;

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, k; cin >> n >> k;
    queue<int> a1, a2;
    for(int i=0;i<n;i++) {
        int a; cin >> a;
        if(a==1) a1.push(i);
        else a2.push(i);
    }

    int cnt=0;
    while(!a1.empty() || !a2.empty()) {
        if(!a1.empty() && !a2.empty() && abs(a1.front()-a2.front())<k) a1.pop(), a2.pop();
        else if(a2.empty() || !a1.empty() && a1.front()<a2.front()) a1.pop();
        else a2.pop();
        cnt++;
    }
    cout << cnt;
}