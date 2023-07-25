class TestSwap:
    def main():
        
        m = 123
        n = 456
        
        print("Before the swaps")
        print("\nm = ", m)
        print("\nn = ", n)
        
        # How to swap? Can I do ... no, m and n will have the same values
        m = n
        n = m
        
        print("\nAfter the swaps")
        print("\nm = ", m)
        print("\nn = ", n)
        
testswap = TestSwap()
testswap.main()