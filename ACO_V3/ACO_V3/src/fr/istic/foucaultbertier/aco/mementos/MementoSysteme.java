package fr.istic.foucaultbertier.aco.mementos;

/**
 * Cette classe stocke toutes les informations nécessaires pour le restaurer par la suite. C'est à dire l'état du Buffer et celui de la Selection.
 * @see MementoBuffer
 * @see MementoSelection
 */
public class MementoSysteme {

	private MementoBuffer memBuffer;
	private MementoSelection memSelection;
	
	/**
	 * Crée le memento à partir des mementos du buffer et de la selection
	 * @param memBuffer Le memento du buffer (non null)
	 * @param memSelection Le memento de la selection (non null)
	 */
	public MementoSysteme(MementoBuffer memBuffer, MementoSelection memSelection){
		
		if(memBuffer == null){
			
			throw new IllegalArgumentException("memBuffer est à null");
		}
		
		if(memSelection == null){
			
			throw new IllegalArgumentException("memBuffer est à null");
		}

		this.memBuffer = memBuffer;
		this.memSelection = memSelection;
	}
	
	/**
	 * 
	 * @return Le Memento du buffer précedemment sauvegardé
	 */
	public MementoBuffer getMemBuffer(){
		
		return memBuffer;
	}
	
	/**
	 * 
	 * @return Le Memento de la selection précedemment sauvegardé
	 */
	public MementoSelection getMemSelection(){
		
		return memSelection;
	}
	
	/**
	 * 
	 * @param memBuffer Le memento du buffer (non null)
	 */
	public void setMemBuffer(MementoBuffer memBuffer){
		
		if(memBuffer == null){
			
			throw new IllegalArgumentException("memBuffer est à null");
		}

		this.memBuffer = memBuffer;
	}
	
	/**
	 * 
	 * @param memSelection Le memento de la selection (non null)
	 */
	public void setMemSelection(MementoSelection memSelection){
		
		if(memSelection == null){
			
			throw new IllegalArgumentException("memBuffer est à null");
		}
		
		this.memSelection = memSelection;
	}
}