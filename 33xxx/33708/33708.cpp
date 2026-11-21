#include<bits/stdc++.h>
using namespace std;

const int MAX = 1000000;
int notPrime[MAX+1] = {true, false, false, }; // 1은 소수가 아니지만 예외로 false처리리
int a[MAX];

string chk(int n) {
    for(int i=0;i<n;i++) {
        if(notPrime[a[i]] || i>0 && a[i-1]!=1 && a[i]!=1) {
            return "YES";
        }
    }

    for(int i=1;i<n;i++) {
        if(a[i-1]>a[i]) {
            return "NO";
        }
    }
    return "YES";
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) cin >> a[i];

    for(int i=2;i*i<=MAX;i++) {
        if(!notPrime[i]) {
            for(int j=i*i;j<=MAX;j+=i) {
                notPrime[j]=true;
            }
        }
    }
    cout << chk(n);
}