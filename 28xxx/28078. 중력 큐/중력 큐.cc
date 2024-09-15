#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int Q; cin >> Q;

    deque<char> deq;
    int move=0, b=0, w=0;
    while(Q-->0) {
        string a; cin >> a;
        if(a.compare("pop")==0) {
            if(!deq.empty()) {
                if(deq.front()=='b') b--;
                else w--;
                deq.pop_front();
            }
        } else {
            char ch; cin >> ch;
            if(a.compare("rotate")==0 && ch=='l') {
                move = (move+3)%4;
            } else if(a.compare("rotate")==0) {
                move = (move+1)%4;
            } else if(a.compare("count")==0 && ch=='b') {
                cout << b << '\n';
            } else if(a.compare("count")==0) {
                cout << w << '\n';
            } else if(ch=='b') {
                deq.push_back('b');
                b++;
            } else {
                deq.push_back('w');
                w++;
            }
        }

        if(move==1) {
            while(!deq.empty() && deq.front()=='b') {
                deq.pop_front();
                b--;
            }
        } else if(move==3) {
            while(!deq.empty() && deq.back()=='b') {
                deq.pop_back();
                b--;
            }
        }
    }
}