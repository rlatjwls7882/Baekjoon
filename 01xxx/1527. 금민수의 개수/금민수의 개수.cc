#include<bits/stdc++.h>
using namespace std;

int A, B, cnt;

void back(long long val=0) {
    if(A<=val && val<=B) cnt++;
    if(val>B) return;
    back(val*10+4);
    back(val*10+7);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> A >> B;
    back();
    cout << cnt;
}