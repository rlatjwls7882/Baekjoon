#include<bits/stdc++.h>
using namespace std;

const int MAX = 100'000;

long long x[MAX], w[MAX];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    long long n, l; cin >> n >> l;
    for(int i=0;i<n;i++) cin >> x[i];
    for(int i=0;i<n;i++) cin >> w[i];

    double left=0, right=l;
    while(left<right) {
        double mid = (left+right)/2;

        double lSum=0, rSum=0;
        for(int i=0;i<n;i++) {
            if(x[i]<mid) lSum += (mid-x[i])*w[i];
            else if(x[i]>mid) rSum += (x[i]-mid)*w[i];
        }

        if(lSum>rSum) right = mid-0.000001;
        else if(lSum<rSum) left = mid+0.000001;
        else left=right=mid;
    }
    cout << setprecision(6) << fixed << left;
}