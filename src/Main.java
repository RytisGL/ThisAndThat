public class Main {
    public static void main(String[] args) {
        char[][] array = new char[10][10];
        array[5][5] = 'c';
        array[4][4] = '1';
        array[4][5] = '2';
        array[4][6] = '3';
        array[5][6] = '4';
        array[6][6] = '5';
        array[6][5] = '6';
        array[6][4] = '7';
        array[5][4] = '8';
        int coordinatesX = 0;
        int coordinatesY = 0;
        for (int i = 0; i< array.length; i++) {
            for(int j = 0; j < array.length; j++) {
                    if(array[i][j] == 'c') {
                        coordinatesY = j-1;
                        coordinatesX = i-1;
                }
            }
        }
        for (int i = coordinatesX; i <coordinatesX+3; i++) {
            System.out.println(array[coordinatesY][i]);
        }
        for (int j = coordinatesY; j < coordinatesY+3; j++) {
            System.out.println(array[j][coordinatesX]);
        }
        for (int i = coordinatesX-2; i >coordinatesX; i--) {
            System.out.println(array[i][coordinatesY-3]);
        }
        System.out.println(array[coordinatesX-1][coordinatesY]);
        int u = 0;
        while (u < array.length) {
            for (char c: array[u]) {
                System.out.print(c);
            }
            System.out.println();
            u++;
        }
    }
}