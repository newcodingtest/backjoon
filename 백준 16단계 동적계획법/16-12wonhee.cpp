//1996kb, 4ms
#include<iostream>
#include<algorithm>
using namespace std;
int A[1001];
int dp_inc[1001] = { 0 }; //dp_inc[x] : x��° ���� ������ ���ҷ� ������ LIS�� ����
int dp_dec[1001] = { 0 }; //dp_dec[x] : x��° ���� ù��° ���ҷ� ������ LDS�� ����

//������ ��ġ�� ���Ͽ� ���� ��ġ���� ������ �ִ� LIS�� LDS�� ���ϰ� �� ���� ���� �ִ밪�� ã�´�.
//ex)A		1 5 2 1 4 3 4 5 2 1
//dp_inc	1 2 2 1 3 3 4 5 2 1
//dp_dec	1 5 2 1 4 3 3 3 2 1
//sum		2 7 4 2 7 6 7 8 4 2

int main()
{
	cin.sync_with_stdio(0);
	cin.tie(0); cout.tie(0);
	int N; cin >> N;


	for (int i = 0; i < N; i++)
		cin >> A[i];

	for (int i = 0; i < N; i++)
	{
		if (dp_inc[i] == 0)
			dp_inc[i] = 1;
		for (int j = 0; j < i; j++)
			if (A[i] > A[j])
				if (dp_inc[i] < dp_inc[j] + 1)
					dp_inc[i] = dp_inc[j] + 1;
	}

	for (int i = N-1; i >= 0; i--)
	{
		if (dp_dec[i] == 0)
			dp_dec[i] = 1;
		for (int j = N-1; j > i; j--)
			if (A[i] > A[j])
				if (dp_dec[i] < dp_dec[j] + 1)
					dp_dec[i] = dp_dec[j] + 1;
	}

	int ret = 0;
	for (int i = 0; i < N; i++)
		ret = max(ret, dp_inc[i] + dp_dec[i]);
	cout << ret - 1;
	return 0;
}