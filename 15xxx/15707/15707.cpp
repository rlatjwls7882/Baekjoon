#include <bits/stdc++.h>
using namespace std;

bool isExceed(int arr[], int length, string r) {
    if(length>r.length()) return true;
    if(length<r.length()) return false;
    for(int i=0;i<length;i++) {
        if(arr[length-1-i]>r[i]-'0') return true;
        if(arr[length-1-i]<r[i]-'0') return false;
    }
    return false;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string a, b, r; cin >> a >> b >> r;

    int arr[40] = {0, };
    for(int i=0;i<a.length();i++) {
        for(int j=0;j<b.length();j++) {
            arr[i+j] += (a[a.length()-1-i]-'0')*(b[b.length()-1-j]-'0');
        }
    }

    int length=1;
    for(int i=0;i<39;i++) {
        arr[i+1] += arr[i]/10;
        arr[i]%=10;
        if(arr[i]!=0) length=i+1;
    }

    if(isExceed(arr, length, r)) {
        cout << "overflow";
    } else {
        for(int i=length-1;i>=0;i--) {
            cout << arr[i];
        }
    }
}