#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N, L; cin >> N >> L;

    for(int len=L;len<=100;len++) {
        if(N-len*(len-1)/2>=0 && (N-len*(len-1)/2)%len==0) {
            int first = (N-len*(len-1)/2)/len;
            for(int i=0;i<len;i++) cout << first+i << ' ';
            return 0;
        }
    }
    cout << -1;
}