/*void main(){
    int[][]marks=new int[5][3];
    int[][] studentmarks={
        {78,90,34},
        {89,65,89},
        {12,34,56},
        {66,12,89},
        {33,77,88}
    };
    for(int row=0;row<studentmarks.length;row++){
        for(int col=0;col< studentmarks[row].length;col++){
            System.out.print(studentmarks[row][col]+" ");
        }
        System.out.println();
    }
}*/
void main() {
    int[][] studentattendance = {
            {0, 1, 0},
            {1, 0, 0},
            {1, 1, 1},
            {1, 0, 1},
            {0, 0, 0}
    };
    for (int row = 0; row < studentattendance.length; row++) {
        System.out.print ("student" + (row + 1) + ":");
        for (int column = 0; column < studentattendance[row].length; column++) {
            if (studentattendance[row][column] == 1) {
                System.out.println("class" + (column + 1) + "Present");
            } else {


        }
        System.out.println("class" + (column + 1) + ":Absent");

    }
    System.out.println(" ");

}
}
