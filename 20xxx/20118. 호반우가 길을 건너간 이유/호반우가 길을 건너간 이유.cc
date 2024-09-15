#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;

    int x=-1, y=0;
    vector<string> res;
    if((N+M)%2==0) {
        res.push_back("0 0\n");
        res.push_back("1 1\n");
        res.push_back("0 0\n");
        res.push_back("1 1\n");
        x=y=1;
    }
    while(x+1<N) {
        if(x+2<N) {
            res.push_back(to_string(x+1)+" "+to_string(y)+"\n");
            res.push_back(to_string(x+2)+" "+to_string(y)+"\n");
            res.push_back(to_string(x+1)+" "+to_string(y)+"\n");
            res.push_back(to_string(x+2)+" "+to_string(y)+"\n");
            x+=2;
        } else {
            res.push_back(to_string(x+1)+" "+to_string(y)+"\n");
            res.push_back(to_string(x+1)+" "+to_string(y+1)+"\n");
            res.push_back(to_string(x+1)+" "+to_string(y)+"\n");
            res.push_back(to_string(x+1)+" "+to_string(y+1)+"\n");
            x++; y++;
        }
    }
    while(y+1<M) {
        res.push_back(to_string(x)+" "+to_string(y+1)+"\n");
        res.push_back(to_string(x)+" "+to_string(y+2)+"\n");
        res.push_back(to_string(x)+" "+to_string(y+1)+"\n");
        res.push_back(to_string(x)+" "+to_string(y+2)+"\n");
        y+=2;
    }

    cout << res.size() << '\n';
    for(string s:res) {
        cout << s;
    }
}