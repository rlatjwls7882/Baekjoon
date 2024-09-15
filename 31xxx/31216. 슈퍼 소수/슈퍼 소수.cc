#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);

    int _size=318138;
    bool notSosu[_size] = {true, true, false, };
    for(int i=2;i*i<_size;i++) {
        if(!notSosu[i]) {
            for(int j=i*i;j<_size;j+=i) {
                notSosu[j]=true;
            }
        }
    }

    vector<int> sosu;
    for(int i=2;i<_size;i++) {
        if(!notSosu[i]) {
            sosu.push_back(i);
        }
    }

    vector<int> superSosu;
    for(int i=0;i<sosu.size();i++) {
        if(!notSosu[i+1]) {
            superSosu.push_back(sosu[i]);
        }
    }

    int T; cin >> T;
    while(T-->0) {
        int n; cin >> n;
        cout << superSosu[n-1] << '\n';
    }
}