#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int arr[N];
    for(int i=0;i<N;i++) {
        cin >> arr[i];
    }

    int chk[100001] = {0, };
    long long cnt=0, last=0, left=0, right=0;
    while(right<N) {
        while(true) {
            if(right<N && chk[arr[right]]<1) {
                chk[arr[right]]++;
                right++;
            } else {
                break;
            }
        }

        cnt += (right-left)*(right-left+1)/2;
        if(last>left) cnt -= (last-left)*(last-left+1)/2;
        last=right;

        while(right<N && chk[arr[right]]!=0) {
            chk[arr[left]]--;
            left++;
        }
    }
    cout << cnt;
}