#include<bits/stdc++.h>
using namespace std;

bool num[10][8] = {
    {1, 1, 1, 0, 1, 1, 1}, // 0
    {0, 0, 1, 0, 0, 1, 0}, // 1
    {1, 0, 1, 1, 1, 0, 1}, // 2
    {1, 0, 1, 1, 0, 1, 1}, // 3
    {0, 1, 1, 1, 0, 1, 0}, // 4
    {1, 1, 0, 1, 0, 1, 1}, // 5
    {1, 1, 0, 1, 1, 1, 1}, // 6
    {1, 0, 1, 0, 0, 1, 0}, // 7
    {1, 1, 1, 1, 1, 1, 1}, // 8
    {1, 1, 1, 1, 0, 1, 1}, // 9
};

int getCnt(int from, int to) { // a에서 b로 변환시키는데 필요한 반전 횟수 계산
    if(from==to) return INT_MAX; // 자기 자신을 만드는 경우 제외
    string a = to_string(from);
    string b = to_string(to);

    // 길이를 똑같이 맞추기
    while(b.length()<a.length()) b = '0'+b;
    while(a.length()<b.length()) a = '0'+a;

    int total=0;
    for(int i=0;i<a.length();i++) {
        for(int j=0;j<8;j++) {
            total += num[a[i]-'0'][j]!=num[b[i]-'0'][j]; // 두 번호를 비교해서 켜져있는 것이 다른 수만큼 반전이 필요함
        }
    }
    return total;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N, K, P, X; cin >> N >> K >> P >> X;

    int cnt=0;
    for(int i=1;i<=N;i++) {
        if(getCnt(X, i)<=P) { // P번보다 적은 횟수로 i를 만들 수 있다면 cnt+1
            cnt++;
        }
    }
    cout << cnt;
}