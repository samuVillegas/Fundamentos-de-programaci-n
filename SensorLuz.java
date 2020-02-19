public class SensorLuz{
    
    int intensidadMax;
    int intensidadMin;
    int intensidad;
    
    public SensorLuz(int min, int max){
        this.intensidadMax=max;
        this.intensidadMin=min;
        this.intensidad=min;
    
    }
    
    public int getIntensidad(){
        return this.intensidad;
    }
    
    public void setIntensidad(int i ){
        if((i>=this.intensidadMin)&&(i<=intensidadMax)){
            this.intensidad= i;
        }
    }
    
    public int duplicarIntensidad(){
        int temp= this.intensidad*2;
        if(temp<=this.intensidadMax){
            this.intensidad=temp;
        }
        return this.intensidad;
    }
}