#include<bits/stdc++.h>
using namespace std;

typedef unsigned long long ull;

bitset<100> reversed[60];
ull w[201], basis[60], idx[60];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);

    // 랜덤한 가중치 할당
    mt19937_64 rd(123456789);
    uniform_int_distribution<ull> rnd(0, (1ULL<<60)-1);
    for(int i=1;i<=200;i++) w[i] = rnd(rd);

    int t; cin >> t;
    if(t==1) {
        ull n, x; cin >> n >> x;

        // 처음에는 아무거나 선택
        ull xorVal = x;
        vector<pair<int, int>> v;
        for(int i=0;i<n;i++) {
            int a, b; cin >> a >> b;
            v.push_back({a, b});
            xorVal ^= w[a];
        }

        // xor해서 x가 나오도록 가우스 소거법으로 적당히 카드 뒤집기
        for(int i=0;i<n;i++) {
            ull cur = w[v[i].first]^w[v[i].second];
            bitset<100> curReversed; curReversed[i]=1;
            for(int j=59;j>=0;j--) {
                if(((cur>>j)&1ULL)==0) continue;
                if(!basis[j]) {
                    basis[j] = cur;
                    idx[j] = i;
                    reversed[j] = curReversed;
                    break;
                }
                cur ^= basis[j];
                curReversed ^= reversed[j];
            }
        }

        ull cur=xorVal;
        bitset<100> curReversed;
        for(int i=59;i>=0;i--) {
            if(((cur>>i)&1ULL)==0) continue;
            cur ^= basis[i];
            curReversed ^= reversed[i];
        }
        for(int i=0;i<n;i++) cout << (curReversed[i] ? v[i].second : v[i].first) << ' ';
    } else {
        int n; cin >> n;
        ull ret=0;
        while(n--) {
            int x; cin >> x;
            ret ^= w[x];
        }
        cout << ret;
    }
}