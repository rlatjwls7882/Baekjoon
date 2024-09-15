#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string A, B; cin >> A >> B;
    int Alen=A.length(), Blen=B.length();

    int cnt=0, left=0;
    for(int i=0;i<Alen && left<Blen && A[i]==B[i];i++) {
        cnt++;
        left=i;
    }

    for(int i=0;Alen-1-i>left && Blen-1-i>left && A[Alen-1-i]==B[Blen-1-i];i++) {
        cnt++;
    }
    cout << B.length()-cnt;
}