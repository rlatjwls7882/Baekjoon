#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; string S; cin >> N >> S;
    vector<int> P, C;
    for(int i=0;i<S.length();i++) {
        if(S[i]=='P') P.push_back(i);
        else if(S[i]=='C') C.push_back(i);
    }

    for(int i=0;i<min(P.size(), C.size());i++) {
        swap(S[P[i]], S[C[i]]);
    }
    cout << S;
}