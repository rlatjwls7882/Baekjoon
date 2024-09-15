#include <iostream>

using namespace std;

int main() {
  int n, k;
  cin >> n >> k;

  int cnt = 0, lastLetter = 0;
  while (n-- > 0) {
    int curLetter;
    cin >> curLetter;
    if (lastLetter + curLetter > k) {
      lastLetter = curLetter;
      cnt++;
    } else {
      lastLetter += curLetter;
    }
  }
  cout << cnt + 1;
}