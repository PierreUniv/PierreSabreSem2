package personnages;

public class humain {
	private String nom;
	private String boisson;
	private int argent;
	
	
	public String getNom() {
		return this.nom;
	}



	public int getArgent() {
		return argent;
	}


	public humain(String nom,String boisson,int argent) {
		this.nom=nom;
		this.boisson=boisson;
		this.argent=argent;
	}
	
	private void parler(String texte) {
	    System.out.println(texte); 
	}

	public String direBonjour() {
	    String message = "Bonjour ! Je m’appelle " + getNom() + " et j'aime boire du " + this.argent;
	    parler(message);
	    return message;
	}

	public String boire() {
	    String message = "Mmmm, un bon verre de " + this.boisson + "! GLOUPS !";
	    parler(message);
	    return message;
	}

	
	 public void acheter(String bien, int prix){
		 if (getArgent()>=prix) {
			 int argentAvantAchat=getArgent();
			 this.argent= this.argent-prix;
			 parler("J'ai "+argentAvantAchat+" Je vais pouvoir m'off rir "+ bien+ "à "+ prix +" sous");
			 
		 }else {
			 parler("Je n'ai plus que "+ getArgent()+" sous en poche. Je ne peux même pas m'o ffrir "+ bien+" à "+ prix+ " sous.");
		 }
		
		

	}
}
