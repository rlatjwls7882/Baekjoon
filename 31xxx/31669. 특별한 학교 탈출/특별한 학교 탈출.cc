#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int N, M; cin >> N >> M;
    
    string lesson[N];
    for(int i=0;i<N;i++) {
        cin >> lesson[i];
    }

    int idx=-1;
    for(int i=0;i<M;i++) {
        bool chk=true;
        for(int j=0;j<N;j++) {
            if(lesson[j][i]=='O') {
                chk=false;
                break;
            }
        }
        if(chk) {
            idx=i+1;
            break;
        }
    }
    cout << (idx==-1?"ESCAPE FAILED":to_string(idx));
}