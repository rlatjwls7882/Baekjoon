#include<bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    int first=1, last=N;
    for(int i=0;i<N;i++) {
        if(i%2==0) {
            cout << first++ << " ";
        } else {
            cout << last-- << " ";
        }
    }
}