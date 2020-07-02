/**
 * classe Utilisateur
 * @author yannis
 *
 */
public class Utilisateur {

	/*____________ PROPS _____________*/
	private int id;
	private String nom;
	private String prenom;
	
	/*____________ CTORS _____________*/
	
	public Utilisateur() {
		// TODO Auto-generated constructor stub
	}//end ctor

	public Utilisateur(int id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	
	
	public Utilisateur(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	/*____________ G / S _____________*/
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
}//end class
