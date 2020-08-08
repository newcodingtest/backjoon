//2764kb, 8ms
#include<iostream>
#include<algorithm>
using namespace std;
int n;
int arr[100001], dp[100001];

//dp�� ���� ��ġ���� �ִ밪�� �ǹ��Ѵ�.
//�ٷ� ������ �ִ밪+���簪�� ���簪 �߿� �� ū ���� �������

// ex
// arr	10 -4 3  1  5  6 -35 12 21 -1
// dp	10  6 9 10 15 21 -14 12 33 32

int main()
{
	cin.sync_with_stdio(0);
	cin.tie(0); cout.tie(0);
	cin >> n;
	for (int i = 0; i < n; i++)
		cin >> arr[i];
	
	dp[0] = arr[0];
	int ret = dp[0];
	for (int i = 1; i < n; i++)
	{
		dp[i] = max(dp[i - 1] + arr[i], arr[i]);
		ret = max(ret, dp[i]);
	}
	cout << ret;
	return 0;
}
