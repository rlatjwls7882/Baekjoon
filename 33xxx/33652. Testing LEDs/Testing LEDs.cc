#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    
    long long minM = LONG_LONG_MAX;
    while(n--) {
        long long M, O; cin >> M >> O;
        if(!O) minM = min(minM, M); 
    }
    cout << (minM == LONG_LONG_MAX ? -1 : minM);
}