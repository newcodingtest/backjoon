//1984kb, 0ms
#include<iostream>
using namespace std;

// ����ū �������� ��� �������ִ��� ������������ ������ ���ϸ� ��.
// ex) N=10,K=4200
// ���� ���� : 1, 5, 10, 50,100, 500, 1000, 5000, 10000, 50000
// 1000 : 4��
// 100 : 2��
// �� 6��

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
