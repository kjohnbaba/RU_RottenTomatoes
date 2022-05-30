/*************************************************************************
 *  Compilation:  javac RURottenTomatoes.java
 *  Execution:    java RURottenTomatoes
 * RURottenTomatoes creates a 2 dimensional array of movie ratings 
 * from the command line arguments and displays the index of the movie 
 * that has the highest sum of ratings.
 *
 *  java RURottenTomatoes 3 2 5 2 3 3 4 1
 *  0
 *************************************************************************/

public class RURottenTomatoes {

    public static void main(String[] args) {

	int x = Integer.parseInt(args[0]);
	int y = Integer.parseInt(args[1]);
	int[][] matrix= new int [x][y];

	int pointer = 2;

	for (int i = 0; i < x; i++) {
		for (int j = 0; j < y; j++) {
			matrix[i][j] = Integer.parseInt(args[pointer]);
			pointer++;
		}
	}

	int max_score = 0;
	int movie_index = 0;

	for (int j = 0; j < y; j++) {

		int sum = 0;
		for(int i = 0; i < x; i++){
			sum += matrix[i][j];
		}

		if(sum > max_score){
			max_score = sum;
			movie_index = j;
		}

	}
	System.out.println(movie_index);
	}
}
