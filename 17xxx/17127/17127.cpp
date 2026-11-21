#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int arr[N];
    for(int i=0;i<N;i++) {
        cin >> arr[i];
    }

    int _max=0;
    for(int i=0;i+N-4<N;i++) {
        int sum=0, mul=1;
        int s=0;
        for(int j=0;j<N;j++) {
            if(i<=j && j<=i+N-4) mul *= arr[j];
            else sum += arr[j];
        }
        _max = max(_max, sum+mul);
    }
    cout << _max;
}