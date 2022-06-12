public class Juegos001 {
    
    //Variables
    private String nombreJuego;
    private int puntajeInicial;
    private int puntajeFinal;
    
    
    //Constructores
    public Juegos001(String nombreJuego, int puntajeInicial, int puntajeFinal){
        this.nombreJuego = nombreJuego;
        this.puntajeInicial = puntajeInicial;
        this.puntajeFinal = puntajeFinal;
    }
    
    //Setters & Getters
    public void setNombreJuego(String nombreJuego){
        this.nombreJuego = nombreJuego;
    }
    public String getNombreJuego(){
        return this.nombreJuego;
    }
    
    public void setPuntajeInicial(int puntajeInicial){
        this.puntajeInicial = puntajeInicial;
    }
    public int getPuntajeInicial(){
        return this.puntajeInicial;
    }

    public void setPuntajeFinal(int puntajeFinal){
        this.puntajeFinal = puntajeFinal;
    }
    public int getPuntajeFinal(){
        return this.puntajeFinal;
    }
    
        
	public static void main(String[] args) {
    	System.out.println("Inicio!");
    	
    	Juegos001 objJuegos001;
    	objJuegos001 = new Juegos001("Super Mario", 1000, 2000);
    	
    	String nombreJuegoData = objJuegos001.getNombreJuego();
    	System.out.println("Estás juegando: " + nombreJuegoData);
    	
    	int puntajeInicialData = objJuegos001.getPuntajeInicial();
    	System.out.println("Iniciaste con un puntaje de: " + puntajeInicialData);
    	
    	int puntajeFinalData = objJuegos001.getPuntajeFinal();
    	System.out.println("Terminaste con un puntaje de: " + puntajeFinalData);
	}
        
    }