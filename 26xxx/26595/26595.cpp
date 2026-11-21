#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    long long N; cin >> N;
    long long A, PA, B, PB; cin >> A >> PA >> B >> PB;

    long long maxSum=0, x=0, y=0;
    for(long long i=0;i*PA<=N;i++) {
        long long j = (N-i*PA)/PB;
        if(i*A+j*B>maxSum) {
            maxSum=i*A+j*B;
            x=i;
            y=j;
        }
    }
    cout << x << ' ' << y;
}