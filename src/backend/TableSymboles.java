package backend;
/**
 * Pour gérer les portées, la table des symboles de VSL+ est organisée comme 
 * une pile de tables (Hastable en Java, structure de données de type "map").
 * Toute insertion se fait dans la table qui est en tête de pile. La recherche
 *  se fait dans toutes les tables. 
 * Afin d'éviter le calcul à chaque fois que l'on a besoin de la portée courante, 
 * un attribut dérivé la mémorise et est automatiquement mis à jour à chaque changement
 * de portée.
 * 
 * @author MLB
 *
 */

public class TableSymboles{
    private TableSymboleElem current_table;
    private int scope_level;
    private int size;
	 
    /**
     * Création d'une table des symboles. La portée courante est zéro.
     *
     */
    public TableSymboles(){
		  size = 1024;
		  current_table = new TableSymboleElem(null,size);
		  scope_level = 0;
    }
	/**
	 * Empilement d'une nouvelle table et incrémentation de la profondeur
	 * d'imbrication.
	 */ 
    public void Enter_Scope(){    	
		  TableSymboleElem t = new TableSymboleElem(current_table,size);
		  current_table = t;
		  scope_level++;
    }
	 /**
	  * Dépilement d'une table et décrémentation de la profondeur d'imbrication
	  *
	  */
    public void Leave_Scope(){   	
		  current_table = current_table.englobante;
		  scope_level--;
    }
	 /**
	  * Recherche de la valeur associée à un nom
	  * @param name: clef de type String
	  * @return Valeur de type Operand3a
	  */
    public Tokatt Lookup(String name){   	
		  return ((Tokatt)current_table.lookup(name));
    }
	 /**
	  * Insertion d'un couple (clef, valeur) dans la table courante
	  * @param name : le nom (String)
	  * @param t : type minimal Operand3a
	  * @return
	  */
    public void Insert(String name, Tokatt t){    	
		  current_table.Insert(name,t);
    }
	 
	 
    public int getScope(){
		  return scope_level;
    }

    public void Dump(){
		  current_table.Dump();
    }

}
