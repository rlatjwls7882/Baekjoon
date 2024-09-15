#include<bits/stdc++.h>
using namespace std;

bool isFriends(int chars1[], int chars2[]) {
    for(int i=0;i<10;i++) {
        if(chars1[i] && !chars2[i] || !chars1[i] && chars2[i]) {
            return false;
        }
    }
    return true;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    for(int i=0;i<3;i++) {
        string a, b; cin >> a >> b;
        int chars1[10] = {0, }, chars2[10] = {0, };
        vector<set<int>> adju1(10);
        vector<set<int>> adju2(10);
        for(int i=0;i<a.length();i++) {
            chars1[a[i]-'0']++;
            if(i+1<a.length()) {
                if(a[i]!='9' && a[i+1]!='0') adju1[a[i]-'0'].insert(a[i+1]-'0');
                if(!(i==0 && a[0]=='1') && a[i]!='0' && a[i+1]!='9') adju1[a[i+1]-'0'].insert(a[i]-'0');
            }
        }
        for(int i=0;i<b.length();i++) {
            chars2[b[i]-'0']++;
            if(i+1<b.length()) {
                if(b[i+1]!='0') adju2[b[i]-'0'].insert(b[i+1]-'0');
                if(!(i==0 && b[0]=='1') && b[i]!='0') adju2[b[i+1]-'0'].insert(b[i]-'0');
            }
        }

        if(isFriends(chars1, chars2)) {
            cout << "friends\n";
            continue;
        }

        bool chk=false;
        for(int i=0;i<9 && !chk;i++) {
            chars1[i]--;
            chars1[i+1]++;
            for(int adjus:adju1[i]) {
                chars1[adjus]--;
                chars1[adjus-1]++;
                if(isFriends(chars1, chars2)) {
                    chk=true;
                    break;
                }
                chars1[adjus]++;
                chars1[adjus-1]--;
            }
            chars1[i]++;
            chars1[i+1]--;
        }
        for(int i=0;i<9 && !chk;i++) {
            chars2[i]--;
            chars2[i+1]++;
            for(int adjus:adju2[i]) {
                chars2[adjus]--;
                chars2[adjus-1]++;
                if(isFriends(chars1, chars2)) {
                    chk=true;
                    break;
                }
                chars2[adjus]++;
                chars2[adjus-1]--;
            }
            chars2[i]++;
            chars2[i+1]--;
        }

        if(chk) cout << "almost friends\n";
        else cout << "nothing\n";
    }
}