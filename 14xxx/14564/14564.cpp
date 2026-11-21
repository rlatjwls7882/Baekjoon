#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M, A; cin >> N >> M >> A;
    int cur = M/2+1;
    while(true) {
        int next; cin >> next;
        if(cur==next) A=0;
        else if(cur<next) A = (A+next-cur-1)%N+1;
        else A = (A+next-cur+N-1)%N+1;
        cout << A << '\n';
        if(A==0) break;
    }
}