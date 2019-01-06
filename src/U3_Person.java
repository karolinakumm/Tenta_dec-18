
public class U3_Person {
	private String fnamn;
	private String enamn;

	public String getFnamn() {
		return fnamn;
	}

	public void setFnamn(String fnamn) {
		this.fnamn = fnamn;
	}

	public String getEnamn() {
		return enamn;
	}

	public void setEnamn(String enamn) {
		this.enamn = enamn;
	}

	// Daniels metod, Objektet som matas in här måste dock vara en instans av klassen Person, är Objektet av en annan typ kommer programmet att krascha
	public boolean equals(Object t) { //åtkomstmetod: public, returtyp: boolean(true/false), metodnamn: equals, variabeltyp: Object, variabelnamn: t.
			U3_Person p = (U3_Person) t; //Här castar vi det inmatade Objektet till en Person
			return fnamn.equals(p.fnamn) && enamn.equals(p.enamn);
		}

	// metodalternativ 2, I den här metoden använder en if-sats som först kollar att Objektet är en instans av klassen Person innan den går vidare och kör koden.
	public boolean equals1(Object t) {
		if (t instanceof U3_Person) { // instanceof är en inbyggd metod som ser ifall Object är en instans av den specificerade typen, i detta fall klassen Person
			U3_Person p = (U3_Person) t;
			return p.getFnamn().equals(this.fnamn) && p.getEnamn().equals(this.enamn);
		}
		return false;
	}
	//metodalternativ 3, här har vi gjort som i ovan bara att vi har ersatt if-satsen med &&. I detta fallet ger de samma resultat men mindre att skriva. Personligen anser jag dock att if-satsen gör det lättare att läsa.
	public boolean equals2(Object t) {
		return t instanceof U3_Person && ((U3_Person) t).getFnamn().equals(this.fnamn)
				&& ((U3_Person) t).getEnamn().equals(this.enamn);
	}

}
