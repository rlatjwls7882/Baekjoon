#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    string s; cin >> s;

    int cnt=0;
    for(int i=0;i<N;i++) {
        if(s[i]=='X') cnt++;
    }
    if(cnt==N) {
        cout << "YES\n";
        for(int i=0;i<N;i++) {
            cout << '-';
        }
        return 0;
    }

    char res[N];
    fill(res, res+N, '.');
    int cur=0, firstSizeX=0;
    bool firstX=true;
    for(int i=0;i<N;i++) {
        if(s[i]=='O') {
            if(cur && !firstX) {
                if(cur%2==0) {
                    cout << "NO";
                    return 0;
                }
                for(int j=0;j<cur/2;j++) {
                    res[i-cur+j]='+';
                }
                for(int j=cur/2;j<cur;j++) {
                    res[i-cur+j]='-';
                }
            }
            res[i]='+';
            cur=0;
            firstX=false;
        } else {
            if(firstX) firstSizeX++;
            cur++;
        }
    }
    
    if(firstSizeX+cur!=0 && (firstSizeX+cur)%2==0) {
        cout << "NO";
        return 0;
    }

    int cntP = (firstSizeX+cur)/2;
    for(int i=N-cur;i<N;i++) {
        if(cntP) {
            res[i]='+';
            cntP--;
        }
        else res[i]='-';
    }
    for(int i=0;;i++) {
        if(s[i]=='O') break;
        if(cntP) {
            res[i]='+';
            cntP--;
        }
        else res[i]='-';
    }

    cout << "YES\n";
    for(int i=0;i<N;i++) {
        cout << res[i];
    }
}