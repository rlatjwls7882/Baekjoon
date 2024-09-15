#include<bits/stdc++.h>
using namespace std;

struct strings {
    string S; int I, D;
    strings(string S, int I, int D) {
        this->S=S;
        this->I=I;
        this->D=D;
    }

    bool operator<(strings a) const {
        return this->I<a.I;
    }
};

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    vector<strings> v;
    for(int i=0;i<N;i++) {
        string S; int I, D; cin >> S >> I >> D;
        v.push_back(strings(S, I, D));
    }
    sort(v.begin(), v.end());

    for(int i=0;i<N;i++) {
        char tmp = v[i].S[v[i].D-1];
        if('a'<=tmp && tmp<='z') tmp-=32;
        cout << tmp;
    }
}