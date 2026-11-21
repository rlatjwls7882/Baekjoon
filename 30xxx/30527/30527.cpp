#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int sum=0;
    for(int i=0;i<5;i++) {
        int A, L; cin >> A >> L;
        sum += A*L;
    }

    int N, KWF; cin >> N >> KWF;
    cout << N*(sum/5)/KWF;
}