#include<bits/stdc++.h>
using namespace std;

int arr[4];
bool exist[4];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int blank=0;
    for(int i=0;i<4;i++) {
        cin >> arr[i];
        if(!arr[i]) blank++;
        else exist[arr[i]-1]=true;
    }

    if(blank==0) {
        cout << arr[0] << ' ' << arr[1];
    } else if(blank==1) {
        for(int i=0;i<4;i++) {
            if(!arr[i]) {
                cout << i+1 << ' ';
            }
        }
        for(int i=0;i<4;i++) {
            if(!exist[i]) {
                cout << i+1;
            }
        }
    } else {
        for(int i=0;i<4;i++) {
            if(!exist[i]) cout << i+1 << ' ';
        }
    }
}