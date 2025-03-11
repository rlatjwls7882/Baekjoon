#include<bits/stdc++.h>
using namespace std;

bool arr[1000000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, k; cin >> n >> k;
    for(int i=0;i<n;i++) {
        int val; cin  >> val;
        arr[i] = val%2==0;
    }

    int maxLen=0, len=0, remove=0;
    int left=0, right=0;
    while(right<n) {
        if(arr[right]) {
            len++;
            right++;
            maxLen = max(maxLen, len);
        } else {
            if(remove==k) {
                if(!arr[left]) remove--;
                else len--;
                left++;
            } else {
                remove++;
                right++;
            }
        }
    }
    cout << maxLen;
}