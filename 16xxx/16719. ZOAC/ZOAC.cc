#include<bits/stdc++.h>
using namespace std;

string s;
bool chk[100] = {false, };

void search(int start, int last) {
    char maxChar = 'Z'+1; int mid=start;
    for(int i=start;i<last;i++) {
        if(maxChar>s[i]) {
            maxChar=s[i];
            mid=i;
        }
    }
    chk[mid]=true;

    for(int i=0;i<s.length();i++) {
        if(chk[i]) {
            cout << s[i];
        }
    }
    cout << '\n';
    if(mid+1<last) search(mid+1, last);
    if(start<mid) search(start, mid);
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> s;
    search(0, s.length());
}