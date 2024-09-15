#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int arr[N];
    for(int i=0;i<N;i++) {
        cin >> arr[i];
    }
    sort(arr, arr+N);

    int sum=0;
    for(int i=0;i<N;) {
        if(i+1<N && arr[i]<0 && arr[i+1]<=0) {
            sum += arr[i]*arr[i+1];
            i+=2;
        } else if(arr[i]<0) {
            sum += arr[i];
            i++;
        } else {
            break;
        }
    }
    for(int i=N-1;i>=0;) {
        if(i-1>=0 && arr[i]>1 && arr[i-1]>1) {
            sum += arr[i]*arr[i-1];
            i-=2;
        } else if(arr[i]>0) {
            sum += arr[i];
            i--;
        } else {
            break;
        }
    }
    cout << sum;
}