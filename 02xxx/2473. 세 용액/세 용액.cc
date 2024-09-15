#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    long long arr[N];
    for(int i=0;i<N;i++) {
        cin >> arr[i];
    }
    sort(arr, arr+N);

    int res[3];
    long long diff=10000000000;
    for(int i=0;i<N;i++) {
        for(int j=i+1;j<N;j++) {
            int left=0, right=N-1;
            while(left<right) {
                int mid = (left+right)/2;
                long long sum = arr[i]+arr[j]+arr[mid];
                if(i!=mid && j!=mid && abs(sum)<diff) {
                    diff=abs(sum);
                    res[0]=i; res[1]=j; res[2]=mid;
                }
                if(sum<0) left=mid+1;
                else right=mid-1;
            }
        }
    }
    sort(res, res+3);
    cout << arr[res[0]] << ' ' << arr[res[1]] << ' ' << arr[res[2]];
}