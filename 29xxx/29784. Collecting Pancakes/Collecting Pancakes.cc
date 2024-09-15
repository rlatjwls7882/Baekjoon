#include<bits/stdc++.h>
using namespace std;
typedef long long ll;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int t; cin >> t;
    for(int i=1;i<=t;i++) {
        ll n; cin >> n;
        ll arr[n];
        for(int j=0;j<n;j++) cin >> arr[j];
        int la, ra, lb, rb; cin >> la >> ra >> lb >> rb;
        la--; ra--; lb--; rb--;
        ll preSum[n];
        for(int j=0;j<n;j++) {
            preSum[j] = arr[j];
            if(j) preSum[j] += preSum[j-1];
        }

        ll sum=0;
        if(ra <= lb) { // la ra lb rb
            sum = preSum[(ra+lb)/2];
        } else if(la >= rb) { // lb rb la ra
            sum = preSum[n-1]-preSum[(la+rb+1)/2-1];
        } else {
            for(int mid=max(la, lb);mid<=min(ra, rb);mid++) {
                if((lb<=mid-1 && mid-1<=rb) && (lb<=mid+1 && mid+1<=rb)) {
                    sum = max(sum, min(preSum[mid-1], preSum[n-1]-preSum[mid])+arr[mid]);
                } else if(lb<=mid-1 && mid-1<=rb) {
                    sum = max(sum, preSum[n-1]-preSum[mid]+arr[mid]);
                } else {
                    sum = max(sum, preSum[mid]);
                }
            }
        }
        cout << "Case #" << i <<": " << sum << '\n';
    }
}