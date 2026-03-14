class Solution(object):
    def fib(self, n):
        if n == 0:
            return 0
        elif n == 1:
            return 1
        else:
            a = 0
            b = 1

            for i in range(n):
                c = a+b
                a = b
                b = c

        return b
        