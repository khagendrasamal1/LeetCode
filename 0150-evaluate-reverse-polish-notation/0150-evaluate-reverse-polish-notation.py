class Solution(object):
    def evalRPN(self, tokens):
        """
        :type tokens: List[str]
        :rtype: int
        """
        stack = []
        
        for token in tokens:
            if token not in "+-*/":
                stack.append(int(token))
            else:
                a = stack.pop()
                b = stack.pop()
                
                if token == "+":
                    stack.append(b + a)
                elif token == "-":
                    stack.append(b - a)
                elif token == "*":
                    stack.append(b * a)
                else:
                    stack.append(int(float(b) / a)) 
        
        return stack[-1]
        