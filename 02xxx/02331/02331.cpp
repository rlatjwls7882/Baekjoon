#include<bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    int A, P; cin >> A >> P;

    vector<int> v;
    v.push_back(A);
    while(true) {
        int next=0;
        int tmp = v.back();
        while(tmp!=0) {
            int mult=1;
            for(int i=0;i<P;i++) {
                mult *= tmp%10;
            }
            next += mult;
            tmp/=10;
        }

        bool chk=false;
        for(int i=0;i<v.size();i++) {
            if(v[i]==next) {
                chk=true;
                cout << i;
            }
        }
        if(chk) {
            break;
        }
        v.push_back(next);
    }
}