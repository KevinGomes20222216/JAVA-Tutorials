public class Raggedarray {
    public static void main(String[] arg){
        int [][] sample = {{ 1, 2, 3 },
                { 4, 5, 6 }};
        for(int r=0; r<sample.length; r++) {
            for(int c=0; c<sample[r].length; c++) {
                System.out.println(sample[r][c]);
                //sample[r][c] = input.nextInt();
            }
        }
    }
}