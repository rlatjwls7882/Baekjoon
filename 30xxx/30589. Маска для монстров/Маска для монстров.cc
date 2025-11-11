#include<bits/stdc++.h>
using namespace std;

double x[100'000], y[100'000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) cin >> x[i] >> y[i];

    double sum=0, maxD=0;
    for(int i=0;i<n;i++) {
        double cur = sqrt(pow(x[i]-x[(i+1)%n], 2)+pow(y[i]-y[(i+1)%n], 2));
        sum += cur;
        maxD = max(maxD, cur);
    }
    cout << setprecision(6) << fixed << sum-maxD;
}