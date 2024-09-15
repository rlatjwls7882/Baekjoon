#include<bits/stdc++.h>
using namespace std;

int main(void) {
    int N, K; cin >> N >> K;
    double arr[N];
    for(int i=0;i<N;i++) {
        cin >> arr[i];
    }
    sort(arr, arr+N);

    double sum=0;
    for(int i=K;i<N-K;i++) {
        sum += arr[i];
    }
    cout.precision(2);
    cout << fixed;
    cout << sum/(N-K*2)+0.00000001 << '\n';

    sum += (arr[K]+arr[N-1-K])*K;
    cout << sum/(N)+0.00000001;
}