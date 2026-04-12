class Solution:
    def isValid(self, s: str) -> bool:
        st = []

        for ch in s:
            if ch == '(' or ch == '[' or ch == '{':
                st.append(ch)

            else:
                if not st:
                    return False

                top = st.pop()

                if ch == ')' and top != '(':
                    return False
                elif ch == ']' and top != '[':
                    return False
                elif ch == '}' and top != '{':
                    return False

        return len(st) == 0