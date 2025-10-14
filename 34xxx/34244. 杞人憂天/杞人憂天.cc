#include<bits/stdc++.h>
using namespace std;

typedef unsigned long long ull;

bitset<100> comb[64];
ull w[201], basis[64], idx[64];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);

    // 랜덤한 가중치 할당
    mt19937_64 rd(123456789);
    uniform_int_distribution<ull> rnd(0, ~0ULL);
    for(int i=1;i<=200;i++) w[i] = rnd(rd);

    int t; cin >> t;
    if(t==1) {
        ull n, x; cin >> n >> x;

        // 처음에는 작은 숫자 선택
        ull xorVal = x;
        vector<pair<int, int>> v;
        for(int i=0;i<n;i++) {
            int a, b; cin >> a >> b;
            v.push_back({min(a, b), max(a, b)});
            xorVal ^= w[min(a, b)];
        }

        // xor해서 x가 나오지 않는 경우 가우스 소거법으로 적당히 카드를 뒤집어서 x가 나오도록 수정
        for(int i=0;i<n;i++) {
            ull curChange = w[v[i].first]^w[v[i].second];
            bitset<100> curComb; curComb[i]=1;
            for(int j=63;j>=0;j--) {
                if(((curChange>>j)&1ULL)==0) continue;
                if(!basis[j]) {
                    basis[j] = curChange;
                    idx[j] = i;
                    comb[j] = curComb;
                    break;
                }
                curChange ^= basis[j];
                curComb ^= comb[j];
            }
        }

        ull cur=xorVal;
        bitset<100> curComb;
        for(int i=63;i>=0;i--) {
            if(((cur>>i)&1ULL)==0 || !basis[i]) continue;
            cur ^= basis[i];
            curComb ^= comb[i];
        }
        for(int i=0;i<n;i++) cout << (curComb[i] ? v[i].second : v[i].first) << ' ';
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