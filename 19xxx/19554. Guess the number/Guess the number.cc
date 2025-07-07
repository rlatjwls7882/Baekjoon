#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    int left=1, right=n;
    while(left<right) {
        int mid = (left+right)/2;
        cout << "? " << mid << '\n' << flush;

        int res; cin >> res;
        if(res==-1) left=mid+1;
        else if(res==1) right=mid-1;
        else left=right=mid;
    }
    cout << "= " << left;
}