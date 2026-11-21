#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string res="";
    for(int i=0;i<3;i++) {
        int a; cin >> a;
        bitset<32> A(a);
        res += to_string(A[3])+to_string(A[2])+to_string(A[1])+to_string(A[0]);
    }
    res = to_string(bitset<32>(res).to_ulong());
    for(int i=res.size();i<4;i++) cout << "0";
    cout << res;
}