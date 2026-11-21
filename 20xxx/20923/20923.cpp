#include<bits/stdc++.h>
using namespace std;

int input[30'000][2];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;

    deque<int> dodo, su;
    while(n--) {
        int a, b; cin >> a >> b;
        dodo.push_back(a);
        su.push_back(b);
    }

    deque<int> dodo_ground, su_ground;
    for(int i=0;i<m;i++) {
        if(i%2==0) {
            dodo_ground.push_back(dodo.back());
            dodo.pop_back();
            if(dodo.empty()) {
                cout << "su";
                return 0;
            }

            if(dodo_ground.back()==5) {
                while(!su_ground.empty()) {
                    dodo.push_front(su_ground.front());
                    su_ground.pop_front();
                }
                while(!dodo_ground.empty()) {
                    dodo.push_front(dodo_ground.front());
                    dodo_ground.pop_front();
                }
            }
            if(!su_ground.empty() && su_ground.back()+dodo_ground.back()==5) {
                while(!dodo_ground.empty()) {
                    su.push_front(dodo_ground.front());
                    dodo_ground.pop_front();
                }
                while(!su_ground.empty()) {
                    su.push_front(su_ground.front());
                    su_ground.pop_front();
                }
            }
        } else {
            su_ground.push_back(su.back());
            su.pop_back();
            if(su.empty()) {
                cout << "do";
                return 0;
            }

            if(su_ground.back()==5) {
                while(!su_ground.empty()) {
                    dodo.push_front(su_ground.front());
                    su_ground.pop_front();
                }
                while(!dodo_ground.empty()) {
                    dodo.push_front(dodo_ground.front());
                    dodo_ground.pop_front();
                }
            }
            if(!dodo_ground.empty() && su_ground.back()+dodo_ground.back()==5) {
                while(!dodo_ground.empty()) {
                    su.push_front(dodo_ground.front());
                    dodo_ground.pop_front();
                }
                while(!su_ground.empty()) {
                    su.push_front(su_ground.front());
                    su_ground.pop_front();
                }
            }
        }
    }
    cout << (dodo.size()>su.size() ? "do" : dodo.size()<su.size() ? "su" : "dosu");
}