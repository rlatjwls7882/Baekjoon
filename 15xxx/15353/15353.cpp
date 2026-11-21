#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string A, B; cin >> A >> B;

    int sum[10001] = {0, };
    for(int i=A.length()-1;i>=0;i--) {
        sum[A.length()-1-i] += A[i]-'0';
    }
    for(int i=B.length()-1;i>=0;i--) {
        sum[B.length()-1-i] += B[i]-'0';
    }

    int length = max(A.length(), B.length());
    for(int i=0;i<length;i++) {
        if(sum[i]>=10) {
            sum[i+1]+= sum[i]/10;
            sum[i]%=10;
        }
    }
    if(sum[length]>0) {
        length++;
    }

    for(int i=length-1;i>=0;i--) {
        cout << sum[i];
    }
}