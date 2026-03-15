class Solution(object):
    
    def commonFactors(self, a, b):
        """
        :type a: int
        :type b: int
        :rtype: int
        """
        def GCD(a, b):
            while b != 0:
                a, b = b, a%b
            return a
        cnt = 0
        common_gcd = GCD(a, b)

        for i in range(1, int(common_gcd**0.5)+1):
            if common_gcd % i == 0:
                if i*i == common_gcd:
                    cnt += 1
                else:
                    cnt += 2
        return cnt

        