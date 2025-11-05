#include<bits/stdc++.h>
using namespace std;

int d[100'000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    long long sum=0;
    for(int i=0;i<n;i++) {
        cin >> d[i];
        sum += d[i];
    }
    for(int i=0;i<n;i++) {
        if(d[i]>max(1LL, sum/2)) {
            cout << "Unhappy";
            return 0;
        }
    }
    cout << "Happy";
}