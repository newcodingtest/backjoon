//1984kb, 0ms
#include<iostream>
using namespace std;

// 가장큰 동전부터 몇개를 가질수있는지 내림차순으로 갯수를 더하면 됨.
// ex) N=10,K=4200
// 동전 종류 : 1, 5, 10, 50,100, 500, 1000, 5000, 10000, 50000
// 1000 : 4개
// 100 : 2개
// 총 6개

int main()
{
	cin.sync_with_stdio(0);
	cin.tie(0); cout.tie(0);
	int coin[11];
	int N, K;
	cin >> N >> K;
	for (int i = 0; i < N; i++)
		cin >> coin[i];

	int ret = 0;
	for (int i = N-1; i >=0; i--)
	{
		if (K == 0)
			break;
		ret += K / coin[i];
		K %= coin[i];
	}
	cout << ret;
	return 0;
}
