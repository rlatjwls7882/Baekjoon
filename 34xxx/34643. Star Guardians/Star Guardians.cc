#include<bits/stdc++.h>
using namespace std;

double a[10], s[10];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) cin >> a[i];
    for(int i=0;i<n;i++) cin >> s[i];
    sort(s, s+n, greater<double>());
    for(int i=1;i<n;i++) s[i] += s[i-1];

    double avg=0;
    for(int i=0;i<n;i++) avg = max(avg, (a[i]+s[i])/(i+1));
    cout << setprecision(6) << fixed << avg;
}