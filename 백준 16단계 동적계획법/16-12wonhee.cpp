//1988kb, 8ms
#include<iostream> 
#include<vector>
#include<algorithm>
using namespace std;  
int N;
int A[1001]; //입력 받을 수열

bool compare(int a, int b)
{
	return a > b;
}

int main() 
{
	cin.sync_with_stdio(0); 
	cin.tie(0); cout.tie(0);

	//입력받는 부분
	cin >> N;
	for (int i = 0; i < N; i++)
		cin >> A[i];
	
	int result = 0;
	vector<int> inc_v; //증가하는 수열을 저장할 벡터
	for (int i = 0; i < N; i++)
	{
		//증가하는 수열 찾기
		//수열의 현재위치의 값이 벡터의 마지막 위치의 값보다 크면 뒤에 추가
		if (inc_v.empty()||inc_v.back() < A[i])
			inc_v.push_back(A[i]);
		//그렇지 않으면 해당하는 수가 들어갈 위치를 찾아서 넣어줌
		else
		{
			int index = lower_bound(inc_v.begin(), inc_v.end(),A[i]) - inc_v.begin();
			inc_v[index] = A[i];
		}

		vector<int> dec_v;
		//감소하는 수열 찾기
		for (int j = i; j < N; j++)
		{
			//수열의 현재위치의 값이 벡터의 마지막 위치의 값보다 작으면 뒤에 추가
			if (dec_v.empty()||dec_v.back() > A[j])
				dec_v.push_back(A[j]);
			//그렇지 않으면 해당하는 수가 들어갈 위치를 찾아서 넣어줌
			else
			{
				int index = lower_bound(dec_v.begin(), dec_v.end(), A[j],compare) - dec_v.begin();
				dec_v[index] = A[j];
			}
		}

		//바이토닉 수열의 최대길이 찾기
		//증가수열과 감소수열 벡터에 공통으로 들어가는게 하나 있으므로 빼준다.
		result = max(result, (int)(inc_v.size() + dec_v.size()) - 1);
	}
	cout << result;
	return 0; 
}