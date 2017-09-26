package interfaces;
/**
 * Hier werden die Informationen zu einer Apotheke hinterlegt.
 * @author GuntherBackoffice
 *
 */

public interface InterfaceApotheke {
	
	String getBezeichnung();
	String getAdresse();
	String getPLZ();
	String getOrt();
	String getTel();
	String getDistance();
	Boolean isActive(); //Die Apotheke ist aktiviert
	Boolean isBereitschaft(); //Die Apotheke hat Bereitschaft	

}
