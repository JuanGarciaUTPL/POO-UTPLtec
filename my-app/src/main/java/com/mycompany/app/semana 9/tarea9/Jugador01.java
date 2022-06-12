public class Jugador01 {
    
    //Variables
    private String nombre;
    private String nombreJuego;
    private int puntajeInicial;
    private int puntajeFinal;
    
    //Constructores
    public Jugador01(/*String nombre, String nombreJuego, int puntajeInicial, int puntajeFinal*/){
        this.nombre = nombre;
        this.nombreJuego = nombreJuego;
        this.puntajeInicial = puntajeInicial;
        this.puntajeFinal = puntajeFinal;
    }
    
        //Setters & Getters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    
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
    
        Jugador01 objJugador01;
    	objJugador01 = new Jugador01();
    	
    	objJugador01.setNombre("Juan Alberto");
    	
    	String nombreData = objJugador01.getNombre();
    	System.out.println("Hola " + nombreData);
    	
    	String nombreJuegoData = Juegos001.nombreJuego();
    	System.out.println("Estás juegando: " + nombreJuegoData);
    	
    	int puntajeInicialData = Juegos001.puntajeInicial();
    	System.out.println("Iniciaste con un puntaje de: " + puntajeInicialData);
    	
    	int puntajeFinalData = Juegos001.puntajeFinal();
    	System.out.println("Terminaste con un puntaje de: " + puntajeFinalData);
	}
}
