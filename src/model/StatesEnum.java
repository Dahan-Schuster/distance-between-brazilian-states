package model;

public enum StatesEnum {
	
	AC("Acre", 					"09:58:29:S", "67:48:36:W"),
	AL("Alagoas",		 		"09:39:57:S", "35:44:07:W"),
	AM("Amazonas", 			 	"03:06:07:S", "60:01:30:W"),
	AP("Amapá",   				"00:02:20:N", "51:03:59:W"),
	BA("Bahia", 				"12:58:16:S", "38:30:39:W"),
	CE("Ceará",  				"03:43:02:S", "38:32:35:W"),
	DF("Brasília (DF)",			"15:46:47:S", "47:55:47:W"),
	ES("Espírito Santo", 		"20:19:10:S", "40:20:16:W"),
	GO("Goiás",					"16:40:43:S", "49:15:14:W"),
	MA("Maranhão",  			"02:31:47:S", "44:18:10:W"),
	MT("Mato Grosso", 			"15:35:46:S", "56:05:58:W"),
	MS("Mato Grosso do Sul", 	"20:26:34:S", "54:38:47:W"),
	MG("Minas Gerais", 			"19:55:15:S", "43:56:16:W"),
	PA("Pará",  				"01:27:21:S", "48:30:16:W"),
	PB("Paraíba",  				"07 06’54:S", "34 51’47:W"),
	PR("Paraná", 				"25:25:40:S", "49:16:23:W"),
	PE("Pernambuco", 			"08:03:14:S", "34:52:52:W"),
	PI("Piauí",  				"05:05:21:S", "42:48:07:W"),
	RJ("Rio de Janeiro", 		"22:54:10:S", "43:12:27:W"),
	RN("Rio Grande do Norte",  	"05:47:42:S", "35:12:34:W"),
	RO("Rondônia", 				"08:45:43:S", "63:54:14:W"),
	RS("Rio Grande do Sul", 	"30:01:59:S", "51:13:48:W"),
	RR("Roraima",   			"02:49:11:N", "60:40:24:W"),
	SC("Santa Catarina", 		"27:35:48:S", "48:32:57:W"),
	SE("Sergipe", 				"10:54:40:S", "37:04:18:W"),
	SP("São Paulo", 			"23:32:51:S", "46:38:10:W"),
	TO("Tocantins", 			"10:12:46:S", "48:21:37:W");

	private final String name;
	private final String lat;
	private final String lon;
	
	StatesEnum(String name, String lat, String lon) {
		this.name = name;
		this.lat = lat;
		this.lon = lon;
	}
	
	public String getName() {
		return name;
	}
	
	public Latitude getLatitude() throws NumberFormatException, Exception {
		String[] values = lat.split(":");
		
		return new Latitude(Integer.parseInt(values[0]), Integer.parseInt(values[1]), Double.parseDouble(values[2]), values[3].charAt(0));
	}
	
	public Longitude getLongitude() throws NumberFormatException, Exception {
		String[] values = lon.split(":");
		return new Longitude(Integer.parseInt(values[0]), Integer.parseInt(values[1]), Double.parseDouble(values[2]), values[3].charAt(0));
	}

}
