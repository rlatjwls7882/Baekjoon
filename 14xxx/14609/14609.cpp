#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int K; cin >> K;
    double C[K+1];
    for(int i=0;i<=K;i++) {
        cin >> C[i];
    }
    double a, b, N; cin >> a >> b >> N;
    double dx = (b-a)/N;

    double left=0;
    for(int i=0;i<=K;i++) {
        left += C[i]/(K-i+1)*(pow(b, K-i+1)-pow(a, K-i+1));
    }

    double s=0, e=dx;
    while(s<e) {
        double mid = (s+e)/2;
        double res=0;
        for(int k=0;k<N;k++) {
            double tmp=0;
            for(int i=0;i<=K;i++) {
                tmp += C[i]*pow(a+k*dx+mid, K-i);
            }
            res += tmp*dx;
        }
        if(res>left) {
            e = mid-0.000001;
        } else {
            s = mid+0.000001;
        }
    }
    cout << s;
}