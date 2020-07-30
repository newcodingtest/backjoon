//1992kb, 0ms
#include<iostream> 
#include<algorithm>
using namespace std;
int N;
int A[1001]; //입력 받을 수열
int dp[1001] = { 0 }; //dp[x] : x번째 수를 마지막 원소로 가지는 LIS의 길이

//수열의 첫번째 자리부터 순서대로 업데이트하는 방식. O(N^2)
//ex) 10 20 10 30 20 50
// dp(i번째 순회마다)
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
		for (int j = 0; j < i; j++) //i번째까지 최대 값을 찾음
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