#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    string s; getline(cin, s);
    int n; cin >> n;
    set<string> all;
    for(int i=0;i<n;i++) {
        cin >> s;
        all.insert(s);
    }

    int m; cin >> m;
    set<string> reveal;
    for(int i=0;i<m;i++) {
        cin >> s;
        reveal.insert(s);
    }

    if(all.count("dongho")) {
        cout << "dongho";
    } else if(all.size()==reveal.size()+1) {
        for(string e:all) {
            if(!reveal.count(e)) {
                cout << e;
                return 0;
            }
        }
    } else if(all.count("bumin") && !reveal.count("bumin")) {
        cout << "bumin";
    } else if(all.count("cake") && !reveal.count("cake")) {
        cout << "cake";
    } else if(all.count("lawyer") && !reveal.count("lawyer")) {
        cout << "lawyer";
    } else {
        for(string e:all) {
            if(!reveal.count(e)) {
                cout << e;
                return 0;
            }
        }
        cout << "swi";
    }
}