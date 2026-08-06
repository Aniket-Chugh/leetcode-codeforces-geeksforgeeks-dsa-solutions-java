class Solution {
    // the game of Frequency
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int res[] = new int[2];
       
        
        int newSize = n*n;
        int[] freq= new int[newSize+1];
      for (int i = 0; i < grid.length; i++) {
    for (int j = 0; j < grid[i].length; j++) {
        freq[grid[i][j]] +=1;
    }
}
    for(int i=1;i<freq.length;i++){
        if(freq[i] > 1){
res[0] = i;
        }
        else if(freq[i] == 0){
            res[1] = i;  
        }
    }
    return res;
    }
}