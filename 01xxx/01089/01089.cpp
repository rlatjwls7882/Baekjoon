#include<bits/stdc++.h>
using namespace std;


int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);

    string num[5][10] = {
        {{"###"}, {"..#"}, {"###"}, {"###"}, {"#.#"}, {"###"}, {"###"}, {"###"}, {"###"}, {"###"}},
        {{"#.#"}, {"..#"}, {"..#"}, {"..#"}, {"#.#"}, {"#.."}, {"#.."}, {"..#"}, {"#.#"}, {"#.#"}},
        {{"#.#"}, {"..#"}, {"###"}, {"###"}, {"###"}, {"###"}, {"###"}, {"..#"}, {"###"}, {"###"}},
        {{"#.#"}, {"..#"}, {"#.."}, {"..#"}, {"..#"}, {"..#"}, {"#.#"}, {"..#"}, {"#.#"}, {"..#"}},
        {{"###"}, {"..#"}, {"###"}, {"###"}, {"..#"}, {"###"}, {"###"}, {"..#"}, {"###"}, {"###"}},
    };

    int N; cin >> N;
    string s[5];
    for(int i=0;i<5;i++) {
        cin >> s[i];
    }

    vector<vector<int>> cases = vector<vector<int>>(N);
    for(int i=0;i<N;i++) {
        for(int j=0;j<=9;j++) {
            bool chk=true;
            for(int x=0;x<3;x++) {
                for(int y=0;y<5;y++) {
                    if(s[y][x+4*i]=='#' && num[y][j][x]=='.') {
                        chk=false;
                        x=y=5;
                        break;
                    }
                }
            }
            if(chk) cases[i].push_back(j);
        }
    }

    double cnt=1;
    for(int i=0;i<N;i++) {
        if(cases[i].empty()) {
            cout << -1;
            return 0;
        }
        cnt *= cases[i].size();
    }

    double sum=0;
    for(int i=0;i<N;i++) {
        int cur=0;
        for(int val:cases[i]) {
            cur += val;
        }
        sum = sum*10+cur*(cnt/cases[i].size());
    }

    cout << fixed;
    cout.precision(6);
    cout << sum/cnt;
}