public class Manzana {
    
    private String familia;
    private int peso;
    private String color;
    
    //Inicializar valores (constructor)
    public Manzana(){
        System.out.println("Constructor Manzana()");
    }
    
    public Manzana(String fami lia, int peso, String color){
        this.familia = familia;
        this.peso = peso;
        this.color = color;
    }
    
    //setters & getters
    
    public void setFamilia(String familia){
        System.out.println("Usando setFamilia");
        this.familia = familia;
    }
    
    
    public String getFamilia(){
        return this.familia;
    }
    
    public void setPeso(int peso){
        this.peso = peso;
    }
    
    public int getPeso(){
        return this.peso;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    
    public String getColor(){
        return this.color;
    }
    
	public static void main(String[] args) {
    	System.out.println("Inicio!");
    	
    	/* Manzana objManzana;
    	objManzana = new Manzana();
    	
    	objManzana.setFamilia("Manzana ecuatoriana");
    	
    	String familiaData = objManzana.getFamilia();
    	
    	System.out.println("Familia: "+ familiaData);
    	
    	System.out.println("Fin!");*/
    	
    	Manzana objManzana;
    	objManzana = new Manzana("Manzana Chilena", 20, "roja");
    	
    	String familiaData = objManzana.getFamilia();
    	System.out.println("Familia: " + familiaData);
    	
    	int pesoData = objManzana.getPeso();
    	System.out.println("Peso: " + pesoData);
    	
    	String colorData = objManzana.getColor();
    	System.out.println("Familia: " + colorData);
    	
    	System.out.println("Fin!");
	}

}
