class Solution {
public:
    
    #define ll long long 
    vector<int> relocateMarbles(vector<int>& nums, vector<int>& moveFrom, vector<int>& moveTo) {
        int n=nums.size();
        map<int,ll int> freq;
        
        for(int i=0;i<n;i++) freq[nums[i]]++;
        
        for(int i=0;i<moveFrom.size();i++){
            freq[moveTo[i]] += freq[moveFrom[i]];
            if(moveFrom[i] != moveTo[i]) freq[moveFrom[i]] = 0;
        }
        
        vector<int> ans;
        for(auto it=freq.begin();it!=freq.end();it++){
            if(it->second > 0) ans.push_back(it->first);
        }
        
        sort(ans.begin(),ans.end());
        
        return ans;
    }
};
