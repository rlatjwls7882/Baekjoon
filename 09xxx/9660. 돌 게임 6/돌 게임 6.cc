#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(); cin.tie(); cout.tie();
    long long N; cin >> N;
    
    int winner[7] = {1, 2, 1, 1, 1, 1, 2};
    if(winner[(N-1)%7]==1) {
        cout << "SK";
    } else {
        cout << "CY";
    }
}