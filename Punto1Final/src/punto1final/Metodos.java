package punto1final;
public class Metodos {
    
    double valores[][] = new double [3][3];
    double vector[] = new double[9];
    
    void llenar(double dato , int F , int C)
    {
        valores[F][C] = dato;
    }
    
    double Mostrar(int k)
    {
        int f=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                vector[f]= valores[i][j];
                f=f+1;
            }
        }
        
        for (int i = 1; i < 9; i++) {
            double aux= vector[i];
            for (int j = i-1; j>=0 && aux<vector[j]; j--) {
                vector[j+1]=vector[j];
                vector[j]=aux;
            }
        }
        return vector[k];
    }
    
    double suma()
    {
        double suma=0;
        for (int i = 0; i < 9; i++) {
            suma = suma + vector[i];
        }
        return suma;
    }
    
    double promedio()
    {
        double prom;
        double suma=0;
        for (int i = 0; i < 9; i++) {
            suma = suma + vector[i];
        }
        prom = suma /9;
        
        return prom;
    }
    
    void borrar()
    {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                valores[i][j]=0;
            }
        }
        
        for (int i = 0; i < 9; i++) {
            vector[i]=0;
        }
        
    }
}
