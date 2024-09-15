#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int V[N];
    for(int i=0;i<N;i++) {
        cin >> V[i];
    }

    long long sum=0; int last=0;
    for(int i=N-1;i>=0;i--) {
        if(last>V[i]) {
            last = V[i];
        } else if(last<V[i]) {
            last++;
        }
        sum += last;
    }
    cout << sum;
}