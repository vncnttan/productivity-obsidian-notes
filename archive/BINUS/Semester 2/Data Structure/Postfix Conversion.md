## Using Stack
1. Operand: Add to the postfix string
2. Open Bracket: Push it to the stack
3. Close Bracket: Push until found an open bracket
4. Operator:
   - Pop while the stack top element has higher or equal precedence than the scanned character
   - Push the scanned character into the stack
5. After scanning all, pop all element from stack to the postfix string

# Manual
![[Pasted image 20230308141606.png]]
