#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    int root=0, cur=0;
    while(n--) {
        int cnt; cin >> cnt;
        if(cnt>=2) {
            cur += 2; // 자식이 2개 이상이면 길이가 2씩 증가함.
            /** 
             * 루트를 포함하는 경로의 길이는 1씩 증가함.
             * ex)
             *      r
             *     / \
             *    o   o
             *   / \
             *  o   o
             */
            root++;
        } else if(cnt==1) {
            root = max(root, cur)+1;
            cur=0; // 자식이 1개인 곳을 새로운 루트로 삼고 길이 계산
        }
    }
    cout << max(root, cur);
}