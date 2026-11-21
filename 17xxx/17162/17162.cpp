#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int Q, mod; cin >> Q >> mod;

    int depth=0, first=0;
    int arr[200000];
    int cnt[mod] = {0, };
    int curSelect[mod] = {0, };
    while(Q-->0) {
        int i; cin >> i;
        if(i==1) {
            int num; cin >> num;
            arr[depth]=num%mod;
            cnt[arr[depth]]++;
            curSelect[arr[depth]]++;
            depth++;
            while(curSelect[arr[first]]>1) {
                curSelect[arr[first]]--;
                first++;
            }
        } else if(i==2) {
            if(depth) {
                depth--;
                cnt[arr[depth]]--;
                curSelect[arr[depth]]--;
                while(!curSelect[arr[depth]] && cnt[arr[depth]]) {
                    first--;
                    curSelect[arr[first]]++;
                }
            }
        } else {
            bool chk=true;
            for(int i=0;i<mod;i++) {
                if(!cnt[i]) {
                    chk=false;
                    break;
                }
            }
            if(!chk) cout << "-1\n";
            else cout << depth-first << '\n';
        }
    }
}