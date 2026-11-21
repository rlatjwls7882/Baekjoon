#include<bits/stdc++.h>
using namespace std;

double maxVal;
bool visited[8];
int arr[8], remember[8];

void back(int depth=0) {
    if(depth==8) {
        double a = 1-abs(remember[0]+remember[1]-remember[2]-remember[3])/20.0;
        double b = 1-abs(remember[4]+remember[5]-remember[6]-remember[7])/20.0;
        maxVal = max(maxVal, min(a, b));
        return;
    }

    for(int i=0;i<8;i++) {
        if(!visited[i]) {
            visited[i]=true;
            remember[depth]=arr[i];
            back(depth+1);
            visited[i]=false;
        }
    }
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    for(int i=0;i<8;i++) cin >> arr[i];
    back();
    if(int(maxVal*10) == maxVal*10) cout << fixed << setprecision(1) << maxVal;
    else cout << fixed << setprecision(2) << maxVal;
}