#include<bits/stdc++.h>
using namespace std;
typedef long long ll;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    vector<deque<ll>> row = vector<deque<ll>>(8);
    vector<deque<ll>> col = vector<deque<ll>>(8);

    for(int i=0;i<8;i++) {
        for(int j=0;j<8;j++) {
            ll tmp; cin >> tmp;
            if(tmp!=0) {
                row[i].push_back(tmp);
                col[j].push_back(tmp);
            }
        }
    }
    char ch; cin >> ch;

    ll m[8][8];
    if(ch=='U') {
        for(int i=0;i<8;i++) {
            for(int j=0;j<8;j++) {
                if(col[j].empty()) {
                    m[i][j]=0;
                } else {
                    m[i][j]=col[j].front(); col[j].pop_front();
                    if(!col[j].empty() && m[i][j]==col[j].front()) {
                        m[i][j]*=2;
                        col[j].pop_front();
                    }
                }
            }
        }
    } else if(ch=='D') {
        for(int i=7;i>=0;i--) {
            for(int j=0;j<8;j++) {
                if(col[j].empty()) {
                    m[i][j]=0;
                } else {
                    m[i][j]=col[j].back(); col[j].pop_back();
                    if(!col[j].empty() && m[i][j]==col[j].back()) {
                        m[i][j]*=2;
                        col[j].pop_back();
                    }
                }
            }
        }
    } else if(ch=='L') {
        for(int i=0;i<8;i++) {
            for(int j=0;j<8;j++) {
                if(row[i].empty()) {
                    m[i][j]=0;
                } else {
                    m[i][j]=row[i].front(); row[i].pop_front();
                    if(!row[i].empty() && m[i][j]==row[i].front()) {
                        m[i][j]*=2;
                        row[i].pop_front();
                    }
                }
            }
        }
    } else {
        for(int i=0;i<8;i++) {
            for(int j=7;j>=0;j--) {
                if(row[i].empty()) {
                    m[i][j]=0;
                } else {
                    m[i][j]=row[i].back(); row[i].pop_back();
                    if(!row[i].empty() && m[i][j]==row[i].back()) {
                        m[i][j]*=2;
                        row[i].pop_back();
                    }
                }
            }
        }
    }
    
    for(int i=0;i<8;i++) {
        for(int j=0;j<8;j++) {
            cout << m[i][j] << ' ';
        }
        cout << '\n';
    }
}