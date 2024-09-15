#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, D; cin >> N >> D;
    int arr[N*2];
    for(int i=0;i<2*N;i++) {
        cin >> arr[i];
    }
    sort(arr, arr+2*N);

    bool chk=true;
    for(int i=0;i<2*N;i+=2) {
        if(arr[i+1]-arr[i]>D) {
            chk=false;
            break;
        }
    }
    if(chk) cout << "Yes";
    else cout << "No";
}