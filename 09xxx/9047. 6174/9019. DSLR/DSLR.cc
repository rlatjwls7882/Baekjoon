#include<bits/stdc++.h>
using namespace std;


int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int T; cin >> T;
    while(T-->0) {
        int a, b; cin >> a >> b;

        queue<int> q; q.push(a);
        char visited[10000] = {0, }; visited[a]=true;
        set<int> moded;
        vector<char> res;
        while(!q.empty()) {
            int cur = q.front(); q.pop();

            // D
            int next = cur*2;
            if(!visited[next%10000]) {
                if(next>9999) {
                    next %= 10000;
                    moded.insert(next);
                }
                visited[next]='D';
                if(next==b) {
                    for(int i=next;i!=a;) {
                        res.push_back(visited[i]);
                        if(visited[i]=='D') {
                            if(moded.count(i)) i = (i+10000)/2;
                            else i/=2;
                        } else if(visited[i]=='S') {
                            if(i==9999) i=0;
                            else i++;
                        } else if(visited[i]=='L') {
                            i = i%10*1000+i/10;
                        } else {
                            i = i/1000+i%1000*10;
                        }
                    }
                    break;
                }
                q.push(next);
            }

            // S
            next = cur==0?9999:cur-1;
            if(!visited[next]) {
                visited[next]='S';
                if(next==b) {
                    for(int i=next;i!=a;) {
                        res.push_back(visited[i]);
                        if(visited[i]=='D') {
                            if(moded.count(i)) i = (i+10000)/2;
                            else i/=2;
                        } else if(visited[i]=='S') {
                            if(i==9999) i=0;
                            else i++;
                        } else if(visited[i]=='L') {
                            i = i%10*1000+i/10;
                        } else {
                            i = i/1000+i%1000*10;
                        }
                    }
                    break;
                }
                q.push(next);
            }
            
            // L
            next = cur/1000+cur%1000*10;
            if(!visited[next]) {
                visited[next]='L';
                if(next==b) {
                    for(int i=next;i!=a;) {
                        res.push_back(visited[i]);
                        if(visited[i]=='D') {
                            if(moded.count(i)) i = (i+10000)/2;
                            else i/=2;
                        } else if(visited[i]=='S') {
                            if(i==9999) i=0;
                            else i++;
                        } else if(visited[i]=='L') {
                            i = i%10*1000+i/10;
                        } else {
                            i = i/1000+i%1000*10;
                        }
                    }
                    break;
                }
                q.push(next);
            }

            // R
            next = cur/10+cur%10*1000;
            if(!visited[next]) {
                visited[next]='R';
                if(next==b) {
                    for(int i=next;i!=a;) {
                        res.push_back(visited[i]);
                        if(visited[i]=='D') {
                            if(moded.count(i)) i = (i+10000)/2;
                            else i/=2;
                        } else if(visited[i]=='S') {
                            if(i==9999) i=0;
                            else i++;
                        } else if(visited[i]=='L') {
                            i = i%10*1000+i/10;
                        } else {
                            i = i/1000+i%1000*10;
                        }
                    }
                    break;
                }
                q.push(next);
            }
        }
        for(int i=res.size()-1;i>=0;i--) {
            cout << res[i];
        }
        cout << '\n';
    }
}