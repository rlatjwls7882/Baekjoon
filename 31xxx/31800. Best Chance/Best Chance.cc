#include<bits/stdc++.h>
using namespace std;

int profit[300'000], price[300'000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    int max1=-1, max2=-1;
    for(int i=0;i<n;i++) {
        cin >> profit[i];
        if(profit[i]>max1) max2=max1, max1=profit[i];
        else if(profit[i]>max2) max2=profit[i];
    }
    for(int i=0;i<n;i++) cin >> price[i];

    for(int i=0;i<n;i++) cout << profit[i] - ((max1==profit[i] ? max2 : max1) - price[i]) - price[i] << ' ';
}