#include <bits/stdc++.h>
using namespace std;

bool chk[1000001] = {false, };
int cnt[1000001] = {0, };

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int arr[N];
    for(int i=0;i<N;i++) {
        cin >> arr[i];
        chk[arr[i]]=true;
    }

    if(chk[1]) {
        cnt[1]=N-1;
        for(int i=0;i<N;i++) {
            if(arr[i]!=1) {
                cnt[arr[i]]--;
            }
        }
    }

    for(int i=2;i<=500000;i++) {
        if(chk[i]) {
            for(int j=i*2;j<=1000000;j+=i) {
                if(chk[j]) {
                    cnt[j]--;
                    cnt[i]++;
                }
            }
        }
    }

    for(int i=0;i<N;i++) {
        cout << cnt[arr[i]] << ' ';
    }
}