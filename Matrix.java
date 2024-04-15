public class Matrix {
    private double[][] matrix;
    private int M;
    private int N;
    private final double epsilon = .001;

    public Matrix(int M,int N){// matrix of 0s
        this.M = M;
        this.N = N;
        matrix = new double[M][N];
        for(int i = 0;i<M;i++){
            for(int j = 0; j<N;j++){
                matrix[i][j]=0;
            }
        }
    }
    public Matrix(double[][] in){
        int columns = 0;
        for(int i = 0;i<in.length;i++){
            if(in[i].length>columns){
                columns = in[i].length;
            }
        }
        matrix = new double[in.length][columns];
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0; j<columns;j++){
                matrix[i][j]=in[i][j];
            }
        }
        M = in.length;
        N = columns;
    }
    public Matrix(Matrix in){
        this.M = in.M;
        this.N = in.N;
        matrix = new double[in.M][in.N];
        for(int i = 0; i<M; i++){
            for(int j = 0; j<N; j++){
                matrix[i][j] = in.matrix[i][j];
            }
        }
    }
    public static Matrix random(int M,int N){
        Matrix out = new Matrix(M,N);
        out.M = M;
        out.N = N;
        for(int i = 0; i<M; i++){
            for(int j = 0; j<N; j++){
                out.matrix[i][j] = 1 + (int)(Math.random() * ((10 - 1) + 1));
            }
        }
        return out;
    }
     public Matrix transpose(){
        Matrix out = new Matrix(N, M);
        for(int i = 0;i<N;i++){
            for(int j=0;j<M;j++){
                out.matrix[i][j]=matrix[j][i];
            }
        }
        return out;
    }
    public String toString(){
        String str = "";
        for (int i = 0; i < M; i++) { for (int j = 0; j < N; j++) {
        str += String.format("%9.2f ", matrix[i][j]); }
        str += "\n"; }
        return str;
    }
    public boolean equals(Matrix B)throws RuntimeException{
        Matrix A = this;
        if(B.M!=A.M||B.N!=A.N){
            throw new RuntimeException("Matrix size is not equal");
        }
        for (int i = 0; i < M; i++) { for (int j = 0; j < N; j++) {
            if (! (Math.abs(A.matrix[i][j] - B.matrix[i][j]) < epsilon) ) { return false; }   
            }
        }
        return true;
    }

}
