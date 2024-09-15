#include<bits/stdc++.h>
using namespace std;

struct Room {
    int start, end, cnt;
};

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, Q; cin >> N >> Q;

    bool visited[N] = {false, };
    vector<Room> v;

    while(Q-->0) {
        string s; int a, b; cin >> s >> a >> b;
        if(s[0]=='n') {
            bool chk=false;
            int curSize=0;
            for(int i=0;i<N;i++) {
                if(!visited[i]) curSize++;
                else curSize=0;
                if(curSize == b) {
                    v.push_back({i-b+2, i+1, a});
                    cout << i-b+2 << ' ' << i+1 << '\n';
                    while(curSize>0) {
                        visited[i]=true;
                        i--; curSize--;
                    }
                    chk=true;
                    break;
                }
            }
            if(!chk) cout << "REJECTED\n";
        } else if(s[0]=='i') {
            v[a-1].cnt += b;
        } else {
            v[a-1].cnt -= b;
            if(v[a-1].cnt==0) {
                cout << "CLEAN " << v[a-1].start << ' ' << v[a-1].end << '\n';
                for(int i=v[a-1].start-1;i<v[a-1].end;i++) {
                    visited[i]=false;
                }
            }
        }
    }
}