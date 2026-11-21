#include<bits/stdc++.h>
using namespace std;

const int MAX = 5'000'000;
bool notSosu[MAX+1] = {true, true, false, };

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    for(int i=2;i*i<=MAX;i++) {
        if(!notSosu[i]) {
            for(int j=i*i;j<=MAX;j+=i) {
                notSosu[j]=true;
            }
        }
    }

    int n; cin >> n;
    set<int, greater<int>> player1, player2;
    long long score1=0, score2=0;
    while(n--) {
        int a, b; cin >> a >> b;

        // 대웅이
        if(notSosu[a]) {
            if(player2.size()<3) score2 += 1000;
            else score2 += *next(player2.begin(), 2);
        } else if(player1.count(a) || player2.count(a)) {
            score1 -= 1000;
        } else {
            player1.insert(a);
        }

        // 규성이
        if(notSosu[b]) {
            if(player1.size()<3) score1 += 1000;
            else score1 += *next(player1.begin(), 2);
        } else if(player1.count(b) || player2.count(b)) {
            score2 -= 1000;
        } else {
            player2.insert(b);
        }
    }
    if(score1>score2) cout << "소수의 신 갓대웅";
    else if(score1<score2) cout << "소수 마스터 갓규성";
    else cout << "우열을 가릴 수 없음";
}