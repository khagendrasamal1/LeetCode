class Solution(object):
    def selfDividingNumbers(self, left, right):
        """
        :type left: int
        :type right: int
        :rtype: List[int]
        """
        def selfDivide(num):
            temp = num
            while temp > 0:
                digit = temp%10

                if digit == 0 or num%digit != 0:
                    return False

                temp //= 10

            return True
            
        ans = []

        for i in range(left, right+1):
            if selfDivide(i):
                ans.append(i)

        return ans

        
        