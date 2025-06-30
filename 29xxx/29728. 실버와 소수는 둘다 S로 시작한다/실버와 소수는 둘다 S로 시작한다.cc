#include<bits/stdc++.h>
using namespace std;

const int MAX = 5'000'000;

bool notSosu[MAX+1] = {true, true, false, };

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    for(int i=2;i*i<=MAX;i++) {
        if(!notSosu[i]) {
            for(int j=i*i;j<=MAX;j+=i) {
                notSosu[j]=true;
            }
        }
    }

    int n; cin >> n;

    int b=0, s=0;
    for(int i=1;i<=n;i++) {
        if(notSosu[i]) b++;
        else {
            if(b>0) {
                b--;
                s+=2;
            } else {
                s++;
            }
        }
    }
    cout << b << ' ' << s;
}