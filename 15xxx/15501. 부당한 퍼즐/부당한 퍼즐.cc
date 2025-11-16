#include<bits/stdc++.h>
using namespace std;

int n, a[1'000'000], aIdx[1'000'001], b[1'000'000];

bool chk(int idx) {
    bool chk1=true, chk2=true;
    for(int i=0;i<n;i++) {
        chk1 &= a[(idx+i)%n]==b[i];
        chk2 &= a[(idx-i+n)%n]==b[i];
    }
    return chk1 | chk2;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n;
    for(int i=0;i<n;i++) {
        cin >> a[i];
        aIdx[a[i]]=i;
    }
    for(int i=0;i<n;i++) cin >> b[i];

    cout << (chk(aIdx[b[0]])? "good puzzle" : "bad puzzle");
}