#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int cashA, cashB; cin >> cashA; cashB=cashA;
    int arr[14];
    for(int i=0;i<14;i++) {
        cin >> arr[i];
    }

    int stockA=0;
    for(int i=0;i<14;i++) {
        stockA += cashA/arr[i];
        cashA %= arr[i];
    }

    int stockB=0;
    for(int i=3;i<=14;i++) {
        if(arr[i-3]>arr[i-2] && arr[i-2]>arr[i-1] && arr[i-1]>arr[i]) {
            stockB += cashB/arr[i];
            cashB %= arr[i];
        } else if(arr[i-3]<arr[i-2] && arr[i-2]<arr[i-1] && arr[i-1]<arr[i]) {
            cashB += stockB*arr[i];
            stockB=0;
        }
    }

    if(cashA+stockA*arr[13]>cashB+stockB*arr[13]) {
        cout << "BNP";
    } else if(cashA+stockA*arr[13]<cashB+stockB*arr[13]) {
        cout << "TIMING";
    } else {
        cout << "SAMESAME";
    }
}