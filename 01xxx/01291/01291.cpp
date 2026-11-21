#include<bits/stdc++.h>
using namespace std;

bool isOne(int n) {
    if(n<4 || n==5) return false;
    int sum=0;
    while(n) {
        sum += n%10;
        n /= 10;
    }
    return sum%2;
}

bool isTwo(int n) {
    if(n==1) return false;
    if(n==2 || n==4) return true;
    int cnt=0;
    for(int i=2;i<=n;i++) {
        if(n%i==0) {
            cnt++;
            while(n%i==0) n/=i;
        }
    }
    return cnt%2==0;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    bool a = isOne(n);
    bool b = isTwo(n);

    if(a && b) cout << 4;
    else if(a) cout << 1;
    else if(b) cout << 2;
    else cout << 3;
}