#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int k; cin >> k;

    stack<int> q;
    while(k--) {
        int num; cin >> num;
        if(!num) q.pop();
        else q.push(num);
    }

    int sum=0;
    while(!q.empty()) sum += q.top(), q.pop();
    cout << sum;
}