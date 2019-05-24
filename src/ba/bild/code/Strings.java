package ba.bild.code;

public class Strings {

	protected String string;

	public int duzinaStringa(String string) {
		int duzina = string.length();
		return duzina;
	}
	
	public String karakteriNaParnimPozicijama(String string) {
		String parnePozicije = "";
		for(int i=0; i<string.length(); i++) {
			if(i!=0 && i%2==0) {
				parnePozicije+=string.charAt(i);
			}
		}
		return parnePozicije;
	}
	
	public String karakteriNaNEparnimPozicijama(String string) {
		String neparnePozicije="";
		for(int i=0; i<string.length(); i++)
		{
			if(i%2!=0 || i==0) {
				neparnePozicije+=string.charAt(i);
			}
		}
		return neparnePozicije;
	}
	
	public int brojUppercaseKaraktera(String string) {
		int brojUpperKaraktera = 0;
		for(int i=0; i<string.length(); i++) {
			if(Character.isUpperCase(string.charAt(i))) {
				brojUpperKaraktera++;
			}
		}
		return brojUpperKaraktera;
	}
	
	public int brojLowercaseKaraktera(String string) {
		int brojLowerKaraktera = 0;
		for(int i=0; i<string.length(); i++) {
			if(Character.isLowerCase(string.charAt(i))) {
				brojLowerKaraktera++;
			}
		}
		return brojLowerKaraktera;
	}
	
	public String karakteriKojiNisuSlova(String string) {
		String nijeSlovo="";
		for(int i=0; i<string.length(); i++) {
			if(!(Character.isAlphabetic(string.charAt(i)))) {
				nijeSlovo+=string.charAt(i);
				}
		}
		return nijeSlovo;
	}

}
