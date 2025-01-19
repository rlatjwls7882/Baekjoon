#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
ll arr[100];

bool comp(ll a, ll b) {
    int cnt1=0, cnt2=0;
    while(a%3==0) {
        cnt1++;
        a/=3;
    } 
    while(b%3==0) {
        cnt2++;
        b/=3;
    }
    if(cnt1!=cnt2) return cnt1 > cnt2;
    return a < b;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) cin >> arr[i];
    sort(arr, arr+n, comp);
    for(int i=0;i<n;i++) cout << arr[i] << ' ';
}