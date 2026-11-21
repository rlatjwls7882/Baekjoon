#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t-->0) {
        vector<int> arr(6);
        for(int i=0;i<6;i++) cin >> arr[i];
        sort(arr.begin(), arr.end());

        if(arr[0]==arr[1] && arr[1]==arr[2] && arr[3]==arr[4] && arr[4]==arr[5]) cout << "two triples\n";
        else if(arr[0]==arr[1] && arr[1]==arr[2] && arr[2]==arr[3] && arr[4]==arr[5] || arr[0]==arr[1] && arr[2]==arr[3] && arr[3]==arr[4] && arr[4]==arr[5]) cout << "tiki pair\n";
        else if(arr[0]==arr[1] && arr[1]==arr[2] && arr[3]==arr[4] || arr[1]==arr[2] && arr[2]==arr[3] && arr[4]==arr[5] || arr[0]==arr[1] && arr[2]==arr[3] && arr[3]==arr[4] || arr[1]==arr[2] && arr[3]==arr[4] && arr[4]==arr[5]) cout << "full house\n";
        else if(arr[0]==arr[1] && arr[1]==arr[2] && arr[2]==arr[3] || arr[1]==arr[2] && arr[2]==arr[3] && arr[3]==arr[4] || arr[2]==arr[3] && arr[3]==arr[4] && arr[4]==arr[5]) cout << "tiki\n";
        else if(arr[0]==arr[1] && arr[1]==arr[2] || arr[1]==arr[2] && arr[2]==arr[3] || arr[2]==arr[3] && arr[3]==arr[4] || arr[3]==arr[4] && arr[4]==arr[5]) cout << "one triple\n";
        else if(arr[0]==arr[1] && arr[2]==arr[3] && arr[4]==arr[5]) cout << "three pairs\n";
        else if(arr[0]==arr[1] && (arr[2]==arr[3] || arr[3]==arr[4] || arr[4]==arr[5]) || arr[1]==arr[2] && (arr[3]==arr[4] || arr[4]==arr[5]) || arr[2]==arr[3] && arr[4]==arr[5]) cout << "two pairs\n";
        else if(arr[0]==arr[1] || arr[1]==arr[2] || arr[2]==arr[3] || arr[3]==arr[4] || arr[4]==arr[5]) cout << "one pair\n";
        else cout << "single\n";
    }
}