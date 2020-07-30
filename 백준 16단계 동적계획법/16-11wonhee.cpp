//1992kb, 0ms
#include<iostream> 
#include<algorithm>
using namespace std;
int N;
int A[1001]; //�Է� ���� ����
int dp[1001] = { 0 }; //dp[x] : x��° ���� ������ ���ҷ� ������ LIS�� ����

//������ ù��° �ڸ����� ������� ������Ʈ�ϴ� ���. O(N^2)
//ex) 10 20 10 30 20 50
// dp(i��° ��ȸ����)
// 1 0 0 0 0 0
// 1 2 0 0 0 0
// 1 2 1 0 0 0
// 1 2 1 3 0 0
// 1 2 1 3 2 0
// 1 2 1 3 2 4

int main()
{
	cin.sync_with_stdio(0);
	cin.tie(0); cout.tie(0);
	cin >> N;
	for (int i = 0; i < N; i++)
		cin >> A[i];

	for (int i = 0; i < N; i++) 
	{
		if (dp[i] == 0)
			dp[i] = 1;
		for (int j = 0; j < i; j++) //i��°���� �ִ� ���� ã��
			if (A[i] > A[j])
				if (dp[i] < dp[j] + 1)
					dp[i] = dp[j] + 1;
	}

	int ret = 0;
	for (int i = 0; i < N; i++)
		ret = max(ret, dp[i]);
	
	cout << ret;
	return 0;
}