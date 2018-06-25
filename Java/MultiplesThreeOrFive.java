    public static int solution (int n)
    {
        int answer = 0;
        
        for (int i = 0; i < n; i++)
        {
            if (i % 3 == 0 || i % 5 ==0)
            {
               answer += i; 
            }
        }
        
        return answer;
    }
