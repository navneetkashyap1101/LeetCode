class Solution(object):
    def intersection(self, nums1, nums2):
       
        res=[]
        s1=set(nums1)
        s2=set(nums2)
        for x in s1:
            if x in s2:
                res.append(x)
        return(res)