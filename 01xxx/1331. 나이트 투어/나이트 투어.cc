#include <bits/stdc++.h>
using namespace std;

bool visited[6][6] = {false, };

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);

    string first, last;
    for(int i=0;i<36;i++) {
        string cur; cin >> cur;
        if(i==0) {
            first=cur;
        } else {
            int cnt1 = abs(cur[0]-last[0]);
            int cnt2 = abs(cur[1]-last[1]);
            if(!(cnt1==1 && cnt2==2 || cnt1==2 && cnt2==1) || visited[cur[0]-'A'][cur[1]-'1']) {
                cout << "Invalid";
                return 0;
            }
        }
        visited[cur[0]-'A'][cur[1]-'1']=true;
        last=cur;
    }

    int cnt1 = abs(last[0]-first[0]);
    int cnt2 = abs(last[1]-first[1]);
    if(!(cnt1==1 && cnt2==2 || cnt1==2 && cnt2==1)) cout << "Invalid";
    else cout << "Valid";
}