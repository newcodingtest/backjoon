//1984kb, 0ms
#include<iostream>
#include<algorithm>
using namespace std;
int dp[501] = { 0 }; //lis�� ���̸� ��� �迭

//idx 0 1 2 3 4 5 6 7 8 9 10
//num 0 8 2 9 1 0 4 6 0 7 10
//dp  0 1 1 2 1 0 2 3 0 4 5

int main()
{
	cin.sync_with_stdio(0);
	cin.tie(0); cout.tie(0);
	int N; cin >> N;
	int num[501] = { 0 };
	int a;
	for (int i = 0; i < N; ++i)
	{
		cin >> a; cin >> num[a];
	}

	for (int i = 1; i <= 500; ++i)
	{
		if (num[i] == 0) //�������� ���� ��ġ
			continue;
		for (int j = 0; j < i; j++) //dp[0]�� 0�̹Ƿ� ó�� ������ ��ġ�� 1���� ����.
			if (num[i] > num[j] && dp[i] < dp[j] + 1)
				dp[i] = dp[j] + 1;
	}
	int ret = 0; //lis�� ����
	for (int i = 1; i <= 500; ++i)
		ret = max(ret, dp[i]);
	cout << N - ret; //������ ������ ���� ���
	return 0;
}