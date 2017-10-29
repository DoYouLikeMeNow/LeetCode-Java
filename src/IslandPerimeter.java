public class IslandPerimeter {
        public int islandPerimeter(int[][] grid) {
            int sides = 0;

            for(int i = 0; i < grid.length; i++){
                for(int j = 0; j < grid[i].length; j++){
                    if(grid[i][j]==1){
                        if(i!=0) {
                            if (grid[i - 1][j] != 1)
                                sides++;
                        }

                        else {
                            sides++;
                        }

                        if(i!=grid.length-1) {
                            if (grid[i + 1][j] != 1)
                                    sides++;
                        }

                        else {
                            sides++;
                        }

                        if(j!=0){
                            if(grid[i][j-1]!=1)
                                sides++;
                        }

                        else {
                            sides++;
                        }

                        if(j!=grid[i].length-1) {
                            if (grid[i][j + 1] != 1)
                                sides++;
                        }

                        else {
                            sides++;
                        }
                    }
                }
            }

            return sides;
        }
}
