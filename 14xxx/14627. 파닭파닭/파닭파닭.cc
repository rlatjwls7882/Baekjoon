#include<bits/stdc++.h>
using namespace std;
typedef long long ll;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    ll S, C; cin >> S >> C;

    ll minSize=1, maxSize=1, sum=0;
    ll arr[S];
    for(int i=0;i<S;i++) {
        cin >> arr[i];
        maxSize = max(maxSize, arr[i]);
        sum += arr[i];
    }

    while(minSize<maxSize) {
        int mid = (minSize+maxSize+1)/2;

        ll cnt=0;
        for(int i=0;i<S;i++) {
            cnt += arr[i]/mid;
        }

        if(cnt>=C) {
            minSize=mid;
        } else {
            maxSize=mid-1;
        }
    }

    sum -= minSize*C;
    cout << sum;
}