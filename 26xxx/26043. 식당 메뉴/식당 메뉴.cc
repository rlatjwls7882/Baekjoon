#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    
    queue<pair<int, int>> q;
    set<int> A, B, C;
    while(n-->0) {
        int x; cin >> x;
        if(x==1) {
            int a, b; cin >> a >> b;
            q.push({a, b});
        } else {
            int a; cin >> a;
            if(a==q.front().second) A.insert(q.front().first);
            else B.insert(q.front().first);
            q.pop();
        }
    }
    while(!q.empty()) {
        C.insert(q.front().first); q.pop();
    }

    if(A.empty()) cout << "None\n";
    else {
        for(int e:A) cout << e << ' ';
        cout << '\n';
    }

    if(B.empty()) cout << "None\n";
    else {
        for(int e:B) cout << e << ' ';
        cout << '\n';
    }

    if(C.empty()) cout << "None\n";
    else {
        for(int e:C) cout << e << ' ';
        cout << '\n';
    }
}