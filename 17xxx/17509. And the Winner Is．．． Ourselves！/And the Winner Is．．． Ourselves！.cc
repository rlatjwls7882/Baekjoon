#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int arr[11];
    int penalty=0;
    for(int i=0;i<11;i++) {
        int D, V; cin >> D >> V;
        arr[i]=D;
        penalty += 20*V;
    }
    sort(arr, arr+11);

    int sum=0;
    for(int i=0;i<11;i++) {
        sum += arr[i];
        penalty += sum;
    }
    cout << penalty;
}