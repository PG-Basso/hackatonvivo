package com.example.thiago.muitogelo;

import android.provider.BaseColumns;

public final class VivoDbContract {

    public static final String TEXT = " TEXT";
    public static final String INTEGER = " INTEGER";
    public static final String REAL = " REAL";
    public static final String COMMA = ",";
    public static final String NOTNULL = " NOT NULL";

	private VivoDbContract() { }

	public static class UserTable implements BaseColumns {
		public static final String TABLE_NAME = "userTable";
		public static final String COLUMN_FULLNAME = "fullName";               // Nome completo
		public static final String COLUMN_DATEOFB = "dateOfBirth";             // Data de Nascimento
		public static final String COLUMN_EMAIL = "email";                     // E-mail
		//public static final String COLUMN_LOGIN = "login";                     // Login
		//public static final String COLUMN_PASSWORD = "password";               // Senha
		public static final String COLUMN_PHONENUM = "phoneNumber";            // Núm. telefone
		public static final String COLUMN_ISVIVO = "isVivo";                   // É vivo?
		public static final String COLUMN_CITY = "city";                       // Cidade
		public static final String COLUMN_STATE = "state";                     // Estado 
		public static final String COLUMN_STREET = "street";                   // Rua
		public static final String COLUMN_DISTRICT = "district";               // Bairro

		// Create table
		public static final String SQL_CREATE = 
			"CREATE TABLE " + TABLE_NAME + " (" +
			_ID             + INTEGER + " PRIMARY KEY," + 
			COLUMN_FULLNAME + TEXT    + COMMA +
			COLUMN_DATEOFB  + TEXT    + COMMA +
			COLUMN_EMAIL    + TEXT    + COMMA +
			//COLUMN_LOGIN    + TEXT    + COMMA +
			//COLUMN_PASSWORD + TEXT    + COMMA +
			COLUMN_PHONENUM + TEXT    + COMMA +
			COLUMN_ISVIVO   + INTEGER + COMMA +
			COLUMN_CITY     + TEXT    + COMMA +
			COLUMN_STATE    + TEXT    + COMMA +
			COLUMN_STREET   + TEXT    + COMMA +
			COLUMN_DISTRICT + TEXT    + ")";
		// Delete table
		public static final String SQL_DELETE = 
			"DELETE TABLE IF EXISTS " + TABLE_NAME;
	}

	public static class SiteTable implements BaseColumns {
		public static final String TABLE_NAME = "siteTable";
		public static final String COLUMN_USERID = "userId";
		public static final String COLUMN_TYPE = "type";                       // Tipo (Terreno/Edifício)
		public static final String COLUMN_ADDRESS = "address";                 // Endereço
		public static final String COLUMN_CITY = "city";                       // Cidade
		public static final String COLUMN_DISTRICT = "district";               // Bairro
		public static final String COLUMN_STATE = "state";                     // Estado
		public static final String COLUMN_CEP = "cep";                         // CEP
		public static final String COLUMN_LAT = "latitude";                    // Latitude
		public static final String COLUMN_LONG = "longitude";                  // Longitude
		public static final String COLUMN_ALT = "altitude";                    // Altitude

		// Create table
		public static final String SQL_CREATE = 
			"CREATE TABLE " + TABLE_NAME + " (" +
			_ID             + INTEGER + " PRIMARY KEY," + 
			COLUMN_USERID   + INTEGER + COMMA +
			COLUMN_TYPE     + TEXT    + COMMA +
			COLUMN_ADDRESS  + TEXT    + COMMA +
			COLUMN_CITY     + TEXT    + COMMA +
			COLUMN_DISTRICT + TEXT    + COMMA +
			COLUMN_STATE    + TEXT    + COMMA +
			COLUMN_CEP      + TEXT    + COMMA +
			COLUMN_LAT      + REAL    + COMMA +
			COLUMN_LONG     + REAL    + COMMA +
			COLUMN_ALT      + REAL    + ")";
		// Delete table
		public static final String SQL_DELETE = 
			"DELETE TABLE IF EXISTS " + TABLE_NAME;
	}


	public static class SiteLDetailsTable implements BaseColumns {
		public static final String TABLE_NAME = "siteLDetailsTable";
		public static final String COLUMN_SITEID = "siteId";
		public static final String COLUMN_NAME = "name";                       // Nome do edifício
		public static final String COLUMN_OWNERNAME = "ownerName";             // Nome do dono
		public static final String COLUMN_OWNERPHONENUM = "ownerPhoneNumber";  // Núm. telefone do dono
		public static final String COLUMN_OWNERADDRESS = "ownerAddress";       // Endereço do dono
		public static final String COLUMN_REPNAME = "repName";                 // Nome do representante
		public static final String COLUMN_REPPHONENUM = "repPhoneNumber";      // Núm. telefone do representante
		public static final String COLUMN_REPADDRESS = "repAddress";           // Endereço do representante
		public static final String COLUMN_SYNDNAME = "syndName";               // Nome do síndico
		public static final String COLUMN_SYNDPHONENUM = "syndPhoneNumber";    // Núm. telefone do síndico
		public static final String COLUMN_ISDEEDAV = "isDeedAvailable";        // A escritura está disponível?
		public static final String COLUMN_ISDOCAV = "isDocAvailable";          // O documento XPTO está disponível?

		// Create table
		public static final String SQL_CREATE = 
			"CREATE TABLE " + TABLE_NAME + " (" +
			_ID                  + INTEGER + " PRIMARY KEY," + 
			COLUMN_SITEID        + INTEGER + COMMA +
			COLUMN_NAME          + TEXT    + COMMA +
			COLUMN_OWNERNAME     + TEXT    + COMMA +
			COLUMN_OWNERPHONENUM + TEXT    + COMMA +
			COLUMN_OWNERADDRESS  + TEXT    + COMMA +
			COLUMN_REPNAME       + TEXT    + COMMA +
			COLUMN_REPPHONENUM   + TEXT    + COMMA +
			COLUMN_REPADDRESS    + TEXT    + COMMA +
			COLUMN_SYNDNAME      + TEXT    + COMMA +
			COLUMN_SYNDPHONENUM  + TEXT    + COMMA +
			COLUMN_ISDEEDAV      + INTEGER + COMMA +
			COLUMN_ISDOCAV       + INTEGER + ")";
		// Delete table
		public static final String SQL_DELETE = 
			"DELETE TABLE IF EXISTS " + TABLE_NAME;
	}


	public static class SitePDetailsTable implements BaseColumns {
		public static final String TABLE_NAME = "sitePDetailsTable";
		public static final String COLUMN_SITEID = "siteId";
		public static final String COLUMN_FLOORNUM = "floorNumber";            // Número de andares
		public static final String COLUMN_CLOSESTAV = "closestAvenue";         // Avenida mais próxima
		public static final String COLUMN_ISACCESSAV = "isAccessAvailable";    // Acesso 24/7 disponível?
		public static final String COLUMN_HOWACCPROV = "howAccessProvided";    // Como o acesso será provido?
		public static final String COLUMN_ISPOWAV = "isPowerAvailable";        // Existe energia elétrica disponível no site?
		public static final String COLUMN_AVPOWER = "availablePower";          // Energia elétrica disponível (380V/220V/110V/N.A.)
		public static final String COLUMN_NEARPOWSUP = "nearestPowerSupply";   // Ponto de energia mais pŕóximo
		public static final String COLUMN_POWSUPPLIER = "powerSupplier";       // Concessionária de energia
		public static final String COLUMN_ISOBSTRUCTED = "isObstructed";       // Existe alguma obstrução ou interferência visível?
		public static final String COLUMN_TOTALAREA = "totalArea";             // Área total do terreno
		public static final String COLUMN_EXISTCONSTR = "existingConstruction";// Construção existente (sim/não/especifique)
		public static final String COLUMN_ELEVATORACC = "elevatorAccess";      // Acesso por elevador
		public static final String COLUMN_LADDERACC = "ladderAccess";          // Acesso por escada
		public static final String COLUMN_CRANEACC = "craneAccess";            // Acesso por guindaste
		public static final String COLUMN_OPENACC = "openAccess";              // Acesso aberto
		public static final String COLUMN_COMMENTS = "comments";               // Comentários gerais

		// Create table
		public static final String SQL_CREATE = 
			"CREATE TABLE " + TABLE_NAME + " (" +
			_ID                 + INTEGER + " PRIMARY KEY," + 
			COLUMN_SITEID       + INTEGER + COMMA +
			COLUMN_FLOORNUM     + INTEGER 	+ COMMA +
			COLUMN_CLOSESTAV    + TEXT    + COMMA +
			COLUMN_ISACCESSAV   + INTEGER + COMMA +
			COLUMN_HOWACCPROV   + TEXT    + COMMA +
			COLUMN_ISPOWAV      + INTEGER + COMMA +
			COLUMN_AVPOWER      + TEXT    + COMMA +
			COLUMN_NEARPOWSUP   + TEXT    + COMMA +
			COLUMN_POWSUPPLIER  + TEXT    + COMMA +
			COLUMN_ISOBSTRUCTED + INTEGER + COMMA +
			COLUMN_TOTALAREA    + REAL    + COMMA +
			COLUMN_EXISTCONSTR  + TEXT    + COMMA +
			COLUMN_ELEVATORACC  + INTEGER + COMMA +
			COLUMN_LADDERACC    + INTEGER + COMMA +
			COLUMN_CRANEACC     + INTEGER + COMMA +
			COLUMN_OPENACC      + INTEGER + COMMA +
			COLUMN_COMMENTS     + TEXT    + ")";
		// Delete table
		public static final String SQL_DELETE = 
			"DELETE TABLE IF EXISTS " + TABLE_NAME;
	}

}